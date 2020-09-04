package com.project.otlob.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Customer {

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int CID;
	private String username;
	private String password;
	private String email;
	private String payment;
	private String phoneNum;
	private String address;
	public Customer(){
		   // Add here init stuff if needed
		}
	public Customer(int cID, String username, String password, String email, String payment, String phoneNum,
			String address) {
		super();
		CID = cID;
		this.username = username;
		this.password = password;
		this.email = email;
		this.payment = payment;
		this.phoneNum = phoneNum;
		this.address = address;
	}
	public int getCID() {
		return CID;
	}
	public void setCID(int cID) {
		CID = cID;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}