package com.project.otlob.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.otlob.model.Food;


@Repository
public interface FoodRepository  extends CrudRepository<Food, Integer> {
	@Query(value = "select * from Food f where f.rest_rid = ?1", nativeQuery = true)
	List<Food> FindAllByRest_rid(int rest_rid);

}
