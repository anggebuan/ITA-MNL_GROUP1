package com.oocl.escobjo.hw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//SINGLETON 
public class Shape {

	
	protected String shape_type;

	
	public void draw() {
		System.out.println("\nDrawing a shape...." + shape_type);
	}

}
