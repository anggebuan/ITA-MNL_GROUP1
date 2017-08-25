package com.escobjo.webservice;

import java.util.*;
import javax.jws.WebMethod;
import javax.jws.WebService;

import com.escobjo.webservice.business.CalculatorServiceImple;

@WebService
public class CalculatorCatalogue {
	
	CalculatorServiceImple  calculatorService = new CalculatorServiceImple();

	@WebMethod
	public List<String> getCalculatorOperations() {
		//return productService.getProductCategories();
		List<String> operations = new ArrayList<>();
		operations.add("Addition");
		operations.add("Subtraction");
		operations.add("Multiplication");
		operations.add("Division");
		return operations;
	}
	  public Double getValuestoCalculate(String operations, double n1, double n2){
		  return calculatorService.getInputs(operations, n1, n2);
		  
	  }
}
