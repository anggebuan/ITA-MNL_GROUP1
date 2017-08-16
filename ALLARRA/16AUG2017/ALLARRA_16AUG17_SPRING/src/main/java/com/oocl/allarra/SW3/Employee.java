package com.oocl.allarra.SW3;

public class Employee {
	String name,role,id;

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

	public void getId() {
		System.out.println("Id: "+id);
	}

	public void setId(String id) {
		this.id = id;
	}

}
