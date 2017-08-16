package com.oocl.planace.sw1.SpringExercise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			Drawing draw = new Drawing();
//			Circle circle = new Circle();
//			draw.setShape(circle);
//			draw.getShape();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/oocl/planace/sw1/SpringExercise/Beans.xml");
		Drawing obj = (Drawing) context.getBean("drawObjCircle");
		obj.getShape();
		
		context = new ClassPathXmlApplicationContext("/com/oocl/planace/sw1/SpringExercise/Beans.xml");
		obj = (Drawing) context.getBean("drawObjTriangle");
		obj.getShape();
	}

}


