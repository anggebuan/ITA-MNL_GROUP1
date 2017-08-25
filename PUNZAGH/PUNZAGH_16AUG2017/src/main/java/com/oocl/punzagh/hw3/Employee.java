package com.oocl.punzagh.hw3;

public class Employee {

	private String name;
	private String company;
	
	public void getName() {
		System.out.println("Employee: " + name);
	}
	public void setName(String name) {
		this.name = name;
	}
	public void getCompany() {
		System.out.println("Company: " +company);
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void init() {
		System.out.println("Overide Initiation");
	}
	
	
}
