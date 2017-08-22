package com.oocl.barisja2.sw2;

import com.oocl.bangipr.sw1.Calculator;
import com.oocl.bangipr.sw1.CalculatorService;

public class SimpleCalculator {

	public static void main(String[] args) {
		
		CalculatorService calculatorService = new CalculatorService();
		Calculator calculator = calculatorService.getCalculatorPort();
		
		System.out.println(calculator.addition(21, 22));
		
	}
	
	
}
