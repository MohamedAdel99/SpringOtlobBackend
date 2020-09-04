package com.project.otlob.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.otlob.config.JwtTokenUtil;
import com.project.otlob.dto.RegisterRequest;
import com.project.otlob.model.Customer;
import com.project.otlob.model.Restaurant;
import com.project.otlob.security.JwtRequest;
import com.project.otlob.security.JwtResponse;
import com.project.otlob.service.AuthService;
import com.project.otlob.service.JwtUserDetailsService;


@RestController
@RequestMapping("/api/auth")
public class AuthController {
	@Autowired
	private AuthService authservice;
	 @Autowired
	 private AuthenticationManager authenticationManager;
	 @Autowired
     private JwtUserDetailsService userDetailsService;
	 @Autowired
	 private JwtTokenUtil jwtTokenUtil;
	 
	    @PostMapping("/signup")
	    public ResponseEntity signup(@RequestBody RegisterRequest registerRequest) {
	        authservice.signup(registerRequest);
	        return new ResponseEntity(HttpStatus.OK);
	    }
	   
}


