package com.oocl.escobjo.hw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//SINGLETON 
public class MainApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloSpringTest obj1 = (HelloSpringTest) context.getBean("helloSpring2");
		obj1.setMessage("Yooo! I'm object A");
		obj1.getMessage();
		
		HelloSpringTest obj2 = (HelloSpringTest) context.getBean("helloSpring2");
		obj2.getMessage();
	}

}
