package com.oocl.punzagh.trial1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {


	public static void main(String[] args){
	
		ApplicationContext context = new ClassPathXmlApplicationContext("com/oocl/punzagh/trial1/Beans.xml");
		HelloSpringTest obj = (HelloSpringTest) context.getBean("helloSpring");
		obj.getMessage();
}
}
