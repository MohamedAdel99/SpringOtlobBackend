package com.project.otlob.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;


import com.project.otlob.model.Customer;
import com.project.otlob.repository.CustomerRepository;

@Service
public class JwtUserDetailsService implements UserDetailsService {
	
	@Autowired
	private CustomerRepository custrepo;

	   @Override
	    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	        Customer user = custrepo.findByUsername(username).orElseThrow(() ->
	                new UsernameNotFoundException("No user found " + username));
	        return new org.springframework.security.core.userdetails.User(user.getUsername(),
	                user.getPassword(),
	                true, true, true, true,
	                getAuthorities("ROLE_USER"));
	    }

	    private Collection<? extends GrantedAuthority> getAuthorities(String role_user) {
	        return Collections.singletonList(new SimpleGrantedAuthority(role_user));
	    }
	}