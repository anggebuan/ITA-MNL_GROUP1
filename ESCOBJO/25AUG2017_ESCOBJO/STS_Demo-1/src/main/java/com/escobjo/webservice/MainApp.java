package com.escobjo.webservice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.escobjo.webservice.ProductCatalogue;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	      
		ProductCatalogue student = (ProductCatalogue) context.getBean("service");

		//student.getProductCategories();
		System.out.println("-------------------------------\n"+ student.getProducts(student.getCategory()));
		//      System.out.println("Your category is: " + student.getCategory() +"\n");
		      //System.out.println("Category List: " + student.getProductCategories()+"\n");
	       
		// 
		  
	     // student.printThrowException();
	}

}
