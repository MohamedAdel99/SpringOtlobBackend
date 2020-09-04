package com.project.otlob.model;

import javax.persistence.*;


@Entity
@Table
public class Food {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int FID;
	private String Name;
	private double price;
	private int qty;
	private String Category;
	@ManyToOne
	private Restaurant rest;
	public Food(){
		   // Add here init stuff if needed
		}
	public Food(int fID, String name, double price, int qty, String category, Restaurant rest) {
		super();
		FID = fID;
		Name = name;
		this.price = price;
		this.qty = qty;
		Category = category;
		this.rest = rest;
	}
	public int getFID() {
		return FID;
	}
	public void setFID(int fID) {
		FID = fID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public Restaurant getRest() {
		return rest;
	}
	public void setRest(Restaurant rest) {
		this.rest = rest;
	}
	
}
