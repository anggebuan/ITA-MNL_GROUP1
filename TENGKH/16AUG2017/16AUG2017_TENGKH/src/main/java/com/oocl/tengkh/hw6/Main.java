package com.oocl.tengkh.hw6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("BeansEx6.xml");
		Employees emp = (Employees) context.getBean("employee");
		emp.getEmployeeId();
		emp.getName();
		emp.getRole();
		emp.getCompany();
		
	}
}
