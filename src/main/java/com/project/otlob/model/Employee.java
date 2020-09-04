package com.project.otlob.model;

import javax.persistence.*;

@Entity
@Table
public class Employee {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int EID;
	private String Name;
	private String nationalID;
	private String role;
	public int getEID() {
		return EID;
	}
	public void setEID(int eID) {
		EID = eID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getNationalID() {
		return nationalID;
	}
	public void setNationalID(String nationalID) {
		this.nationalID = nationalID;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
}
