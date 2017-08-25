package com.oocl.barisja2.sw1.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oocl.barisja2.sw1.impl.DirectoryExplorerImpl;

@WebService
public class DirectoryExplorer {

//	DirectoryExplorerImpl exp = new DirectoryExplorerImpl();
	
	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	
	DirectoryExplorerImpl exp = (DirectoryExplorerImpl) context.getBean("directory");
	
	
	
	@WebMethod
	public String getDirectories() {

		return exp.getDirectories();
	}

	@WebMethod
	public String getFiles() {

		return exp.getFilez();
	}
	
}
