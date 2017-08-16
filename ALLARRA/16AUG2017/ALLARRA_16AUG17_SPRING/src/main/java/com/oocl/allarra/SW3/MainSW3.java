package com.oocl.allarra.SW3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSW3 {
	public static void main(String[] args) {
		ApplicationContext c = new ClassPathXmlApplicationContext("/com/oocl/allarra/SW3/Employee.xml");
		Employee e = (Employee) c.getBean("employee1");
		e.getId();
		e.getName();
		e.getRole();
	}
}
