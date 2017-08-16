package com.oocl.allarra.HW4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oocl.allarra.SW3.Employee;

public class mainHW4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext c = new ClassPathXmlApplicationContext("/com/oocl/allarra/HW4/OrderItemBean.xml");
		A a = (A) c.getBean("OrderItems");
		a.getItemDetail();
		
		
	}

}
