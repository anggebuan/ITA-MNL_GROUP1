package com.oocl.barisja2.sw4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("EmployeeBean.xml");
		Employee obj = (Employee) context.getBean("employee");
		System.out.println(obj.getEmp_id());
		System.out.println(obj.getName());
		System.out.println(obj.getRole());

		
	}
	
}

class Employee{
	
	public String emp_id, name, role;

	public String getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}

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
	
	
	
	
}
