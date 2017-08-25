package com.oocl.planace.hw1.SpringExerciseNo4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringExercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/oocl/planace/hw1/SpringExerciseNo4/Beans.xml");
		Payment obj = (Payment) context.getBean("getOrder");
		obj.payOrder();
	}
}
