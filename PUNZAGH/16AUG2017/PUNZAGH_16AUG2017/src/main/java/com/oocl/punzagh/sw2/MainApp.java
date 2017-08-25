package com.oocl.punzagh.sw2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {


	public static void main(String[] args){
	
		ApplicationContext context = new ClassPathXmlApplicationContext("com/oocl/punzagh/sw2/Beans.xml");
		Drawing obja = (Drawing) context.getBean("drawcircle");
		obja.drawShape();
		Drawing objb = (Drawing) context.getBean("drawtriangle");
		objb.drawShape();
//		Triangle objb = (Triangle) context.getBean("triangle");
		
		
}
}


