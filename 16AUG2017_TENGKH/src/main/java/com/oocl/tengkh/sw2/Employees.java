package com.oocl.tengkh.sw2;

public class Employees {
	private String name, role, employeeId;
	
	public void getEmployeeId() {
		System.out.println("Employee ID: " + employeeId);
	}

	public void  getName() {
		System.out.println("Name: " + name);
	}

	public void getRole() {
		System.out.println("Role: " + role);
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

}
