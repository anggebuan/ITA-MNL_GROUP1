package com.calculator.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.calculator.resources.CalculatorMethods;

@WebService
public class CalculatorWS {

	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

	CalculatorMethods calcWS = (CalculatorMethods) context.getBean("calcWS");

	@WebMethod
	public String addition(double x, double y) {
		return calcWS.addition(x, y);
	}

	@WebMethod
	public String subtraction(double x, double y) {
		return calcWS.subtraction(x, y);
	}

	@WebMethod
	public String multiply(double x, double y) {
		return calcWS.multiply(x, y);
	}

	@WebMethod
	public String squareRoot(double x) {
		return calcWS.squareRoot(x);
	}

}
