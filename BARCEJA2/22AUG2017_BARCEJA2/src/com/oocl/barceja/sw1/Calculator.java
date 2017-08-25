package com.oocl.barceja.sw1;

import javax.jws.WebService;

@WebService
public class Calculator {
	
	//Assignment #1. My own webservice
	Operations operationService = new Operations();
	public double evaluate(String op, double a, double b) {
		return operationService.evaluateOperator(op, a, b);
	}

}
