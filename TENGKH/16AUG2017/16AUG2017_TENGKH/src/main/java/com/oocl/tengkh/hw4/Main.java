package com.oocl.tengkh.hw4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("BeansEx4.xml");
		A obj = (A) context.getBean("price");
	
	}
}
