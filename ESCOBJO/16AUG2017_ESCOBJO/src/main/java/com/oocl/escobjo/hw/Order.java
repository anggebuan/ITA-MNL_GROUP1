package com.oocl.escobjo.hw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Order {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans_order.xml");

		//Order_Items obj1 = (Order_Items) context.getBean("order");
		A a  = (A) context.getBean("order");
	
	a.call();		
//		System.out.println(obj1.getQty());
//		System.out.println(obj1.getPrice());
		

	}
}