package com.oocl.planace.sw2.SpringExercise2;

public class Employee {
	private String name;
	private String role;
	private String employeeId;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	
	public void getEmployee() {
		System.out.println("Employee Info:");
		System.out.println("Employee ID: " + employeeId);
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Role: " + role);
	}
	
}

