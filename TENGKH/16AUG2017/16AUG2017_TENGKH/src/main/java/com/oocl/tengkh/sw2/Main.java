package com.oocl.tengkh.sw2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("BeanEx2.xml");
		Employees name = (Employees) context.getBean("name");
		Employees role = (Employees) context.getBean("role");
		Employees id = (Employees) context.getBean("employeeId");
		
		
		id.getEmployeeId();
		name.getName();
		role.getRole();
		
	}
}
