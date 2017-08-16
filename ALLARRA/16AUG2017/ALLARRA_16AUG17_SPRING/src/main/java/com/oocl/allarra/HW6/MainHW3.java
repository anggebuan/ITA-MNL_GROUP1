package com.oocl.allarra.HW6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainHW3 {
	public static void main(String[] args) {
		ApplicationContext c = new ClassPathXmlApplicationContext("/com/oocl/allarra/HW6/Employee.xml");
		Employee e = (Employee) c.getBean("employee1");
		e.getId();
		e.getName();
		e.getRole();
		e.getCompany();
	}
}
