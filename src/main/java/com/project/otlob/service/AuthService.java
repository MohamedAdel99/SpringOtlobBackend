package com.project.otlob.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import com.project.otlob.config.JwtTokenUtil;
import com.project.otlob.dto.RegisterRequest;
import com.project.otlob.model.Customer;
import com.project.otlob.repository.CustomerRepository;
import com.project.otlob.security.JwtResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;


@Service
public class AuthService {
	@Autowired
	private CustomerRepository crep;
	@Autowired
	private PasswordEncoder passencoder;
	
	 
	public void signup(RegisterRequest registerRequest) {
		Customer c = new Customer(0, null, null, null, null, null, null);
		c.setUsername(registerRequest.getUsername());
		c.setPassword(encoder(registerRequest.getPassword()));
		c.setEmail(registerRequest.getEmail());
		c.setPhoneNum(registerRequest.getPhonenum());
		c.setAddress(registerRequest.getAddress());
		c.setPayment(registerRequest.getPayment());
		System.out.println(registerRequest.getUsername());
		crep.save(c);
	}
	private String encoder(String pass) {
		return passencoder.encode(pass);
	}
	public Customer getbyusername(String username) {
		return crep.findByUsername(username).get();
	}

	}
