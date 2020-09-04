package com.project.otlob.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.otlob.model.Restaurant;
import com.project.otlob.repository.RestaurantRepository;

@Service
public class RestaurantService {
	@Autowired
	private RestaurantRepository resrepo;
	
	public List<Restaurant> getAllRestaurants(){
		List<Restaurant> tp = new ArrayList<>();
		resrepo.findAll().forEach(tp::add);
		return tp;
	}
	public List<Restaurant> getRestaurantAddress(String address) {
		return resrepo.findByAddress(address);
	}
	public void addRestaurant(Restaurant restaurant) {
		 resrepo.save(restaurant);
	}
	public Restaurant getRestaurant(int rid) {
		return resrepo.findById(rid).orElse(null);
	}
}
