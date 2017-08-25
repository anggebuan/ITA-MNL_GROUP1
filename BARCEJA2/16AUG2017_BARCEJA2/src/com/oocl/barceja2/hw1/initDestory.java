package com.oocl.barceja2.hw1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class initDestory {
	//Exercise No. 5
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/oocl/barceja2/hw1/Beans.xml");
		ExampleBeanA exampleBean=  (ExampleBeanA) context.getBean("initDestroy");
		System.out.println(exampleBean.getAbc());
		((AbstractApplicationContext) context).registerShutdownHook();

	}

	
}

