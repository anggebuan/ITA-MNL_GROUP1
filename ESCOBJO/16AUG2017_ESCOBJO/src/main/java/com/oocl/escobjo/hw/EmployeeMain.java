package com.oocl.escobjo.hw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans_Emp.xml");

		Employee obj1 = (Employee) context.getBean("emp");
		 //obj1.setName("Jossel");
		System.out.println(obj1.getName());
		//obj1.setName("1120");
		System.out.println(obj1.getEmployee_id());
		//obj1.setName("Artist");
		System.out.println(obj1.getRole());
		

	}
}