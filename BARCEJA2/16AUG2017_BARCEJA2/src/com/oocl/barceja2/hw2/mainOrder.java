package com.oocl.barceja2.hw2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainOrder {
	// Exercise no. 4
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/oocl/barceja2/hw2/Beans.xml");
		ordersClass obj = (ordersClass) context.getBean("order");
		System.out.println(obj.getItem());
		System.out.println(obj.getAddress());
		System.out.println(obj.getPrice());
		
	}

}
