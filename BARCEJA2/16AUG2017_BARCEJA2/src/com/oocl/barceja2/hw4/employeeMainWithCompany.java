package com.oocl.barceja2.hw4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oocl.barceja2.hw3.employee;

public class employeeMainWithCompany {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/oocl/barceja2/hw3/Beans.xml");
		employee obj = (employee) context.getBean("employeeBean");
		System.out.println("Employee Name: " + obj.getName());
		System.out.println("Employee Role: " + obj.getRole());
		System.out.println("Employee ID: " + obj.getEmployee_id());
		
		ApplicationContext context1 = new ClassPathXmlApplicationContext("/com/oocl/barceja2/hw4/Beans.xml");
		employeeWithCompany obj1 = (employeeWithCompany) context1.getBean("employeeWithCompany");
		System.out.println("Override Employee Name: " + obj1.getName());
		System.out.println("Override Employee Role: " + obj1.getCompany());
		
		
	}
	
}
