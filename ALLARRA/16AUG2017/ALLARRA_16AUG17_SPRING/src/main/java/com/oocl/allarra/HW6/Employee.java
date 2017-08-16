package com.oocl.allarra.HW6;

public class Employee {
	String name,role,id,company;

	public void getName() {
		System.out.println("Name: " + name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void getRole() {
		System.out.println("Role: "+ role);
		
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void getCompany() {
		System.out.println("Company: "+company);
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void getId() {
		System.out.println("Id: "+id);
	}

	public void setId(String id) {
		this.id = id;
	}
	

}
