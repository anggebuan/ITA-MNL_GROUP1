package com.oocl.escobjo.hw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//SINGLETON 
public class MainApp_init_destroy {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		// ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloSpring_init_dest obj1 = (HelloSpring_init_dest) context.getBean("helloSpring3");

		obj1.getMessage();
		context.registerShutdownHook();
	}

}
