package com.oocl.punzagh.sw3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Employee {

	private String name;
	private String role;
	private int employee_id;
	
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("com/oocl/punzagh/sw3/Beans.xml");
		Employee obj = (Employee) context.getBean("employee");
		obj.getName();
		obj.getRole();
		obj.getEmployee_id();
}
	
	public void getName() {
		System.out.println(name);
	}
	public void setName(String name) {
		this.name = name;
	}
	public void getRole() {
		System.out.println(role);
	}
	public void setRole(String role) {
		this.role = role;
	}
	public void getEmployee_id() {
		System.out.println(employee_id);
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	
	
}
