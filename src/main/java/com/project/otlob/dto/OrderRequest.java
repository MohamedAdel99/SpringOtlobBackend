package com.project.otlob.dto;

import java.sql.Date;

public class OrderRequest {
	private int cust;
	private int quantity;
	private int totalAmount;
	private int food;
	private int resturant;
	public int getCust() {
		return cust;
	}
	public void setCust(int cust) {
		this.cust = cust;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	public int getFood() {
		return food;
	}
	public void setFood(int food) {
		this.food = food;
	}
	public int getResturant() {
		return resturant;
	}
	public void setResturant(int resturant) {
		this.resturant = resturant;
	}
	
}
