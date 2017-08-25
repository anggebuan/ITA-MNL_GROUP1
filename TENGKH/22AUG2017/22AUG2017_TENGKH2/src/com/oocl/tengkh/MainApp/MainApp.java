package com.oocl.tengkh.MainApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oocl.tengkh.resource.ProductCatalogueResource;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		ProductCatalogueResource res = (ProductCatalogueResource) context.getBean("sample");

	}

}
