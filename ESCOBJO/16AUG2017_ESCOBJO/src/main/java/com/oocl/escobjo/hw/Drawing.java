package com.oocl.escobjo.hw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//SINGLETON 
public class Drawing {

	private Shape shape;
	

	public void setShape(Shape shape) {
		this.shape = shape;
	}

	public void getShape() {
		this.shape.draw();
	}





}
