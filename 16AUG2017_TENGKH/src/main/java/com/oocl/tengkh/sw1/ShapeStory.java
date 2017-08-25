package com.oocl.tengkh.sw1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShapeStory {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("BeansExe.xml");
		Drawing draw = (Drawing) context.getBean("drawcircle");
		Drawing draw1 = (Drawing) context.getBean("drawtriangle");
		draw.drawShape();
		draw1.drawShape();
	}
}