package com.project.otlob.model;

import javax.persistence.*;
//rest
@Entity
@Table
public class Restaurant {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int RID;
	private String Name;
	private String phone;
	private String address;
	private String Logo;
	private String Menu;
	
	public Restaurant() {}
	public Restaurant(int rID, String name, String phone, String address, String logo, String menu) {
		super();
		RID = rID;
		Name = name;
		this.phone = phone;
		this.address = address;
		Logo = logo;
		Menu = menu;
	}
	public int getRID() {
		return RID;
	}
	public void setRID(int rID) {
		RID = rID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLogo() {
		return Logo;
	}
	public void setLogo(String logo) {
		Logo = logo;
	}
	public String getMenu() {
		return Menu;
	}
	public void setMenu(String menu) {
		Menu = menu;
	}
	
	
}
