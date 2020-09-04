package com.project.otlob.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.otlob.model.Food;
import com.project.otlob.repository.FoodRepository;
@Service
public class FoodService {
	@Autowired
	private FoodRepository frepo;
	public List<Food> getAllFood(int rid) {
		List<Food> tp = new ArrayList<>();
		frepo.FindAllByRest_rid(rid).forEach(tp::add);
		return tp;
	}
	public void addFood(Food food) {
		frepo.save(food);
	}

}
