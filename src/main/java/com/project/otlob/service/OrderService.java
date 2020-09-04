package com.project.otlob.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.otlob.dto.OrderRequest;
import com.project.otlob.model.Customer;
import com.project.otlob.model.Food;
import com.project.otlob.model.Order;
import com.project.otlob.model.Restaurant;
import com.project.otlob.repository.CustomerRepository;
import com.project.otlob.repository.OrderRepository;

import org.springframework.security.core.userdetails.User;
@Service
public class OrderService {
	@Autowired
	private AuthService authservice;
	@Autowired
	private CustomerRepository cr;
	@Autowired
	private OrderRepository or;
	public void addorder(Order order) {
		or.save(order);
	}
	public List<Order> getOrderbycust(int custID) {
		return or.FindByCustid(custID);
	}
}
