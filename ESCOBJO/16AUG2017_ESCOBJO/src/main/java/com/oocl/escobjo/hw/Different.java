package com.oocl.escobjo.hw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Different {

	public static void main(String[] args) {

		Shape s = new Shape();
		
	Triangle myTriangle = new Triangle();
	Drawing draw = new Drawing();
	draw.setShape(myTriangle);
	draw.getShape();
	s.draw();
	
	Circle myCircle = new Circle();
	draw.setShape(myCircle);
	draw.getShape();
	
	
	}
}
