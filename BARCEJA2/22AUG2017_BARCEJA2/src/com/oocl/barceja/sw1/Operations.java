package com.oocl.barceja.sw1;

public class Operations {
	
	public double evaluateOperator(String ope, double firstOpe, double secondOpe) {
		double ans = 0;
		switch(ope.toLowerCase()) {
		case "add":
			ans = add(firstOpe, secondOpe);
			break;
		case "subtract":
			ans = sub(firstOpe, secondOpe);
			break;
		case "multiply":
			ans = mul(firstOpe, secondOpe);
			break;
		case "divide":
			ans = div(firstOpe, secondOpe);
			break;
		}
		return ans;
		
	}
	
	public double add(double a, double b) {
		return a+ b;
	}
	
	public double sub(double a, double b) {
		return a - b;
	}
	
	public double div(double a, double b) {
		return a / b;
	}
	
	public double mul(double a, double b) {
		return a * b;
	}

}
