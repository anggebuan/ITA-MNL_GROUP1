package com.oocl.tengkh.src;

import java.util.*;
import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oocl.tengkh.impl.BluePlumProducts;

//CONTROLLER

@WebService
public class BluePlum {

	BluePlumProducts BluePlumProducts = new BluePlumProducts();

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/oocl/tengkh/src/Beans.xml");
		BluePlumProducts blue = (BluePlumProducts) context.getBean("blue");
		blue.getBluePlumProducts();
		blue.getBeverageList("cold");

	}

	@WebMethod
	public List<String> getBeverageList(String products) {
		return BluePlumProducts.getBeverageList(products);

	}

	@WebMethod
	public List<String> getBluePlumProducts() {
		List<String> products = new ArrayList<>();
		products.add("Cold Beverages");
		products.add("Hot Beverages");
		return products;
	}

}
