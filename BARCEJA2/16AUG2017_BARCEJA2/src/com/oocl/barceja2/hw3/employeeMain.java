package com.oocl.barceja2.hw3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oocl.barceja2.hw2.ordersClass;

public class employeeMain {
	//Exercises no. 7
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/oocl/barceja2/hw3/Beans.xml");
		employee obj = (employee) context.getBean("employeeBean");
		System.out.println("Employee Name: " + obj.getName());
		System.out.println("Employee Role: " + obj.getRole());
		System.out.println("Employee ID: " + obj.getEmployee_id());
		
	}

}
