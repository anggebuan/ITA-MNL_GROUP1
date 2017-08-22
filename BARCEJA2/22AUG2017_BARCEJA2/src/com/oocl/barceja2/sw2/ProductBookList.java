package com.oocl.barceja2.sw2;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oocl.barceja.sw1.Operations;
import com.oocl.barceja2.pr2.ProductServiceImple;

@WebService
public class ProductBookList {
	public List<String> getBooks() {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/oocl/barceja2/sw2/ProductBeans.xml");
		ProductsClass pc = (ProductsClass) context.getBean("ProductList");
		
		return pc.getBookList();
	}
	
}
