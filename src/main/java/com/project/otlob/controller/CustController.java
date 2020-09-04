package com.project.otlob.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.otlob.model.Customer;
import com.project.otlob.service.AuthService;

@RestController
@RequestMapping("/api/cust")
public class CustController {
	@Autowired
	private AuthService authservice;
	 @GetMapping("/{username}")
	    public Customer getuserbyname(@PathVariable String username) {
	    		return authservice.getbyusername(username);
	    	}
	    
}
