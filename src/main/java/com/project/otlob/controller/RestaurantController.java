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

import com.project.otlob.model.Restaurant;
import com.project.otlob.service.RestaurantService;

@RestController
@RequestMapping("/api/rest")
public class RestaurantController {
	@Autowired
	private RestaurantService restserv;
	@PostMapping("/add")
	public ResponseEntity addRestaurant(@RequestBody Restaurant restaurant) {
		restserv.addRestaurant(restaurant);
		return new ResponseEntity(HttpStatus.OK);
	}
	@GetMapping("/all")
	public List<Restaurant> getAllRestaurants() {
		return restserv.getAllRestaurants();
	}
	@GetMapping("/{address}")
	public List<Restaurant> getRestaurantAddress(@PathVariable String address) {
		System.out.println(address);
		return restserv.getRestaurantAddress(address);
	}
	@GetMapping("/id/{rid}")
	public Restaurant getRestaurant(@PathVariable int rid) {
		return restserv.getRestaurant(rid);
	}

}
