package com.oocl.tengkh.hw5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("BeansEx3.xml");
		ClassInitDestroy NetworkManager = (ClassInitDestroy) context.getBean("connection");
		NetworkManager.getConnection();
		((AbstractApplicationContext) context).registerShutdownHook();
	}
}
