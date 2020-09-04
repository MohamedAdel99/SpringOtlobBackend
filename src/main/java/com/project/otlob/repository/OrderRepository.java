package com.project.otlob.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.otlob.model.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Integer> {
	@Query(value = "select * from ORDER_TABLE where CUST_CID = ?1", nativeQuery = true)
	List<Order> FindByCustid(int custID);

}
