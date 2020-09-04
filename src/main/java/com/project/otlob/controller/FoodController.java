package com.project.otlob.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.otlob.model.Food;
import com.project.otlob.model.Restaurant;
import com.project.otlob.service.FoodService;


@RestController
@RequestMapping("/api/food")
public class FoodController {
	@Autowired
	private FoodService foodserv;
	@GetMapping("/{rid}")
	public List<Food> getAllFood(@PathVariable int rid) {
		return foodserv.getAllFood(rid);
	}
	@PostMapping("/add/{restID}")
	public ResponseEntity addFood(@RequestBody Food food, @PathVariable int restID) {
		food.setRest(new Restaurant(restID,"","","","",""));
		foodserv.addFood(food);
		return new ResponseEntity(HttpStatus.OK);
	}
}
