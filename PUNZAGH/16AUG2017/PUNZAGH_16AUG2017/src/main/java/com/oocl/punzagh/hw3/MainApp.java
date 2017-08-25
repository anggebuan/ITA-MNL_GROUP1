package com.oocl.punzagh.hw3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oocl.punzagh.hw2.NetworkManager;

public class MainApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/oocl/punzagh/hw3/Beans.xml");
		Parent objb = (Parent) context.getBean("parent");
		objb.getCompany();
		Employee obj = (Employee) context.getBean("employee");
		obj.getName();
		obj.getCompany();
		
	}
}
