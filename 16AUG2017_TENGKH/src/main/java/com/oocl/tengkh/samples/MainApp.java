package com.oocl.tengkh.samples;
import org.springframework.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloSpringTest obj = (HelloSpringTest) context.getBean("helloSpring");
		obj.getMessage();
		
		
	}

}
