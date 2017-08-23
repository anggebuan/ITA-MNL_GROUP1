package com.oocl.punzagh.sw1;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService
public class SimpleCalcu {
	
	Calculator  calcu = new Calculator();

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
		return null;
	  }

}
