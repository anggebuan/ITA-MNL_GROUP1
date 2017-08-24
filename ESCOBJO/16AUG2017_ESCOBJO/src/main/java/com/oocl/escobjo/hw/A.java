package com.oocl.escobjo.hw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class A {
	

Order_Items o;

public Order_Items getO() {
	return o;
}

public void setO(Order_Items o) {
	this.o = o;
}

public void call() {
	System.out.println(o.getItem());  
	System.out.println(o.getQty());  
	System.out.println(o.getPrice()); 
	
	
}




}
