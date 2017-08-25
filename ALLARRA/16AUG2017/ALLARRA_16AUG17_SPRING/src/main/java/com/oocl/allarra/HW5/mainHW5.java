package com.oocl.allarra.HW5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainHW5 {
	public static void main(String[] args) {
		AbstractApplicationContext c = new ClassPathXmlApplicationContext("/com/oocl/allarra/HW5/NetworkManagementBean.xml");
		NetworkManagement NM = (NetworkManagement) c.getBean("connection");
		NM.getMessage();
		c.registerShutdownHook();
	}
}
