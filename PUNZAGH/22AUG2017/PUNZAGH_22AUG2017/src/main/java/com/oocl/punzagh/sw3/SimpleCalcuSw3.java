package com.oocl.punzagh.sw3;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@WebService
public class SimpleCalcuSw3 {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	Calculator calcu = (Calculator) context.getBean("calculator");
	
//	Calculator calcu = new Calculator();
	@WebMethod
	  public Double calculate(Double num1,Double num2, String operationType){
		if(operationType.toLowerCase().equals("add")) {
			 return calcu.getSum(num1, num2);
		}else if(operationType.toLowerCase().equals("sub")) {
			 return calcu.getDifference(num1, num2);
		}else if(operationType.toLowerCase().equals("mul")){
			 return calcu.getProduct(num1, num2);
		}else if (operationType.toLowerCase().equals("div")) {
			 return calcu.getQuotient(num1, num2);
		}
		return 0.00;
	  }

}
