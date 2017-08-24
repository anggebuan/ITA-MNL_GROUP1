package com.oocl.escobjo.hw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NetworkManagerMain {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans_netman.xml");
	
		NetworkManager nm  = (NetworkManager) context.getBean("net");
		
		System.out.println(nm.getMsg());
		context.destroy();
	}
}