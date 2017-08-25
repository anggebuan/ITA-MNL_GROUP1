package com.oocl.tengkh.samples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp3 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloSpringInitDestroy objC = (HelloSpringInitDestroy) context.getBean("helloSpring3");
		objC.getMessage();
		((AbstractApplicationContext) context).registerShutdownHook();
	}

}
