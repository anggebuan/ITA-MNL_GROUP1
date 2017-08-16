package com.oocl.planace.hw3.SpringExerciseNo6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringExercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/oocl/planace/hw3/SpringExerciseNo6/Beans.xml");
		Company company = (Company) context.getBean("employee");
		company.getCompanyInfo();
	}

}
