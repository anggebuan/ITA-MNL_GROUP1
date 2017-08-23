package com.oocl.allarra.soap;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oocl.allarra.impl.SnacksImpl;
import com.oocl.allarra.logging.Logging;
import com.oocl.allarra.objects.ProductClass;

@WebService
public class Services1 {

	@WebMethod
	public List<String> getProductCategories() {
		//return productService.getProductCategories();
		List<String> categories = new ArrayList<>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		categories.add("FastFood");
		return categories;
	}
	@WebMethod
	public List<ProductClass> getSnacksAvailability(){
		List<ProductClass> snackList = new ArrayList<>();
		SnacksImpl snackImpl = new SnacksImpl();
		snackList = snackImpl.getSnackList();
		
		return snackList;
	}
	@WebMethod
	public ProductClass getSnackProperty(String _snack) {

		ApplicationContext context = new ClassPathXmlApplicationContext("/com/oocl/allarra/soap/Beans.xml");
		Logging logs = (Logging) context.getBean("logging");
		
		String hostname = "Unknown";

		try
		{
		    InetAddress addr;
		    addr = InetAddress.getLocalHost();
		    hostname = addr.getHostName();
		    logs.setHost(hostname);
		    System.out.println(hostname);
		}
		catch (UnknownHostException ex)
		{
		    System.out.println("Hostname can not be resolved");
		}
		
		SnacksImpl snckImpl = (SnacksImpl) context.getBean("test");
		ProductClass productSnack = snckImpl.Getsnack("Lays");
		return productSnack;
	}
	
	public static void main(String[] args) {		
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/oocl/allarra/soap/Beans.xml");
		Logging logs = (Logging) context.getBean("logging");
		
		
		
		String hostname = "Unknown";

		try
		{
		    InetAddress addr;
		    addr = InetAddress.getLocalHost();
		    hostname = addr.getHostName();
		    logs.setHost(hostname);
		    System.out.println(hostname);
		}
		catch (UnknownHostException ex)
		{
		    System.out.println("Hostname can not be resolved");
		}
		
		SnacksImpl snckImpl = (SnacksImpl) context.getBean("test");
		ProductClass productSnack = snckImpl.Getsnack("Lays");
		System.out.println(productSnack.get_name());
		
	}
	
}
