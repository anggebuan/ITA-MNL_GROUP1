package com.oocl.punzagh.hw2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oocl.punzagh.hw1.A;

public class MainApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/oocl/punzagh/hw2/Beans.xml");
		NetworkManager obj = (NetworkManager) context.getBean("networkmgr");
		context.registerShutdownHook();

	}

}
