package com.oocl.punzagh.hw1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oocl.punzagh.sw3.Employee;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/oocl/punzagh/hw1/Beans.xml");
		A obj = (A) context.getBean("a");
		obj.showThatItem();
	}

}
