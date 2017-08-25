package com.oocl.escobjo.hw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp2 {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloSpringTest obj = (HelloSpringTest) context.getBean("helloSpring");
		obj.getMessage();
	}

}
