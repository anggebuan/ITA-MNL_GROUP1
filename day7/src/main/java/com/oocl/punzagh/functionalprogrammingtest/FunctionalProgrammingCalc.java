package com.oocl.punzagh.functionalprogrammingtest;

public class FunctionalProgrammingCalc {

	public static void main(String[] args) {
		FunctionalProgrammingCalc calc = new FunctionalProgrammingCalc();
		System.out.println(calc.addition(10,20));
		System.out.println(calc.divide(10,0));
		System.out.println(calc.addRec(49,999));
	}

	protected int addition(int a, int b) {
		return a+b;
	}
	
	
	protected double divide(double a, double b) {
		return a/b;
	}
	
	protected int addRec(int x, int y) {
		return y == 0
				?x
				:addRec(++x,--y);
	}
}
