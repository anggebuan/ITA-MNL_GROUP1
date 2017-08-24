package com.oocl.escobjo.hw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShapeSpringMain{

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Drawing obj = (Drawing) context.getBean("shape1");
		Drawing obj2 = (Drawing) context.getBean("shape2");
		Drawing obj3 = (Drawing) context.getBean("shape3");
		//obj.getMessage();
		obj.getShape();
		obj2.getShape();
		obj3.getShape();

		
		
	}

}
