package com.project.otlob.controller;

import java.util.ArrayList;
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


import com.project.otlob.model.Customer;
import com.project.otlob.model.Food;
import com.project.otlob.model.Order;
import com.project.otlob.model.Restaurant;
import com.project.otlob.service.OrderService;

@RestController
@RequestMapping("/api/orderfood/")
public class OrderController {
	@Autowired
	private OrderService os;
	@PostMapping("/add/{custid}/{rid}")
	public ResponseEntity addeorder(@RequestBody Order order, @PathVariable int custid,@PathVariable int rid) {
		Customer cust = new Customer(custid,"","","","","","");
		Restaurant rest = new Restaurant(rid,"","","","","");
		order.setCust(cust);
		order.setRest(rest);
		os.addorder(order);	
	 return new ResponseEntity(HttpStatus.OK);
	}
	
	@GetMapping("/{custID}")
	public List<Order> getOrder(@PathVariable int custID) {
		return os.getOrderbycust(custID);
	}
}
