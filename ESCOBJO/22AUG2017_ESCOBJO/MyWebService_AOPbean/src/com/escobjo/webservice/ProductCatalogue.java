package com.escobjo.webservice;

import java.util.*;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.escobjo.webservice.business.ProductServiceImple;

@WebService
//@WebService(targetNamespace = "http://superbiz.org/wsdl")
public class ProductCatalogue {

	
	ProductServiceImple  productService = new ProductServiceImple();
	private String category;
//	Service service = Service.create(wsdlDocumentLocation, serviceName);
	
	@WebMethod
	public List<String> getProductCategories() {
		//return productService.getProductCategories();
		List<String> categories = new ArrayList<>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		categories.add("FastFood");
		categories.add("Arts");
		return categories;
	}
	

	
	 public void setCategory(String category) {
    this.category = category;
	 }
	 public String getCategory() {
		return category;
	}
	 
	 
	
	public List<String> getProducts(String category){
		  return productService.getProducts(category);
	  }
	  
	@WebMethod
	public List<String> Process(){
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	      
		ProductCatalogue student = (ProductCatalogue) context.getBean("service");

		student.getProductCategories();
		System.out.println("-------------------------------\n");
		      System.out.println("Your category is: " + student.getCategory() +"\n");
		      //System.out.println("Category List: " + student.getProductCategories()+"\n");
	       
		  return student.getProducts(student.getCategory());
		  
	}
	
	
	
	   public void printThrowException(){
		      System.out.println("Exception raised ! ");
		      throw new IllegalArgumentException();
		   }
}


