package com.calculator.resources;

public class CalculatorMethods {
	
	public String addition(double x, double y) {
		try {
			double sum = x + y;
			return String.valueOf(sum);
		} catch (Exception e) {
			return "Input not a number";
		}
	}

	public String subtraction(double x, double y) {
		try {
			double diff = x - y;
			return String.valueOf(diff);
		} catch (Exception e) {
			return "Input not a number";
		}
	}
	
	public String multiply(double x, double y) {
		try {
			double prod = x * y;
			return String.valueOf(prod);
		} catch (Exception e) {
			return "Input not a number";
		}
	}
	
	public String squareRoot(double x) {
		try {
			double sqrt = Math.sqrt(x);
			return String.valueOf(sqrt);
		} catch (Exception e) {
			return "Input not a number";
		}
	}
	
}
