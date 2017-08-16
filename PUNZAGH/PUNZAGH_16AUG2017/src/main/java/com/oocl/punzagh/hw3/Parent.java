package com.oocl.punzagh.hw3;

public class Parent {
	private String company;
	
	public void getCompany() {
		System.out.println("Company: " +company);
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	public void init() {
		System.out.println("Initiating");
	}
	public void destroy() {
		System.out.println("Destroying");
	}
}
