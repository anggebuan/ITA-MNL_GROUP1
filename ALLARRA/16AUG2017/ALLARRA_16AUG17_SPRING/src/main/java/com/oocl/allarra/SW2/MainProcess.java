package com.oocl.allarra.SW2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainProcess {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext c = new ClassPathXmlApplicationContext("/com/oocl/allarra/SW2/shapeBean.xml");
		Draw dr = (Draw) c.getBean("drawId");
		dr.drawMethod();
		dr.setShape(new Square());
		dr.drawMethod();
	}
	

}
