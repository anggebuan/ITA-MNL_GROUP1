package com.oocl.escobjo.hw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//SINGLETON 
public class Employee2Main {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans_Employee.xml");
	Employee2 em = (Employee2) context.getBean("emp");
	//Employee2 em2 = (Employee2) context.getBean("emp");
	
	System.out.println(em.getName());
	//obj1.setName("1120");
	System.out.println(em.getEmployee_id());
	//obj1.setName("Artist");
	System.out.println(em.getRole());
	System.out.println(em.getCompany());
	}

}
