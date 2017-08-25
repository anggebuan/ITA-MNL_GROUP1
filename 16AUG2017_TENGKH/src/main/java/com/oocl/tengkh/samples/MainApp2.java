package com.oocl.tengkh.samples;
import org.springframework.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp2 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloSpringTest2 objA = (HelloSpringTest2) context.getBean("helloSpring2");
		objA.setMessage("fsdfdsds");
		objA.getMessage();
		
		HelloSpringTest2 objB = (HelloSpringTest2) context.getBean("helloSpring2");
		objB.getMessage();
	}

}
