package com.escobjo.webservice.business;

import java.util.*;

public class CalculatorServiceImple {


//	List<String> add = new ArrayList<>();
//	List<String> subtract = new ArrayList<>();
//	List<String> multiply = new ArrayList<>();
//	List<String> divide = new ArrayList<>();
	double n1 =0.0 , n2 =0.0;
	double sum, diff, prod, quo;
	double answer = 0.0;
	
	
	public CalculatorServiceImple () {
	//	CalculatorServiceImple c = new CalculatorServiceImple();
		
//		add.add();
//		subtract.add(ans);
//		multiply.add(ans);
//		divide.add(ans);
		
	}

	public List<String> getCalculatorOperations() {

		List<String> operations = new ArrayList<>();
		operations.add("Addition");
		operations.add("Subtraction");
		operations.add("Multiplication");
		operations.add("Division");
		return operations;	
	}
	
	//public List<String> getInputs (String operations,  double n1, double n2){
	public Double getInputs (String operations,  double n1, double n2){
	
		switch (operations.toLowerCase()) {
		case "add":
			answer = n1 + n2;		
			return answer;
		case "subtract":
			answer = n1 - n2;
			return answer;
		case "multiply":
			answer = n1 * n2;
			return answer;
		case "divide":
			answer = n1 / n2;
			return answer;
		}
		return answer;
		
	}
	

	
}
