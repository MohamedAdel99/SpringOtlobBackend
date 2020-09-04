package com.project.otlob.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.otlob.model.Restaurant;

@Repository
public interface RestaurantRepository extends CrudRepository<Restaurant,Integer> {
	@Query(value = "SELECT * FROM Restaurant r WHERE r.address = Address",
            nativeQuery=true
    )
	List<Restaurant> findByAddress(@Param("Address") String Address);

}
