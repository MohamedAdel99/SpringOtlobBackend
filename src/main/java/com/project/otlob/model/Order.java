package com.project.otlob.model;

import javax.persistence.*;

@Entity
@Table (name = "OrderTable")
public class Order {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int OID;
	private int quantity;
	private double totalAmount;
	private String details;
	private String contents;
	@OneToOne
	private Restaurant rest;
	@OneToOne 							
	private Customer cust;
	public Order(){
		   // Add here init stuff if needed
		}
	public int getOID() {
		return OID;
	}
	public void setOID(int oID) {
		OID = oID;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public Restaurant getRest() {
		return rest;
	}
	public void setRest(Restaurant rest) {
		this.rest = rest;
	}
	public Customer getCust() {
		return cust;
	}
	public void setCust(Customer cust) {
		this.cust = cust;
	}
	public Order(int oID, int quantity, double totalAmount, String details, String contents, Restaurant rest,
			Customer cust) {
		super();
		OID = oID;
		this.quantity = quantity;
		this.totalAmount = totalAmount;
		this.details = details;
		this.contents = contents;
		this.rest = rest;
		this.cust = cust;
	}
	

}