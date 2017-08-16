package com.oocl.planace.sw2.SpringExercise2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringExercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/oocl/planace/sw2/SpringExercise2/Beans.xml");
		Employee employee = (Employee) context.getBean("getEmployee");
		employee.getEmployee();
	}

}
