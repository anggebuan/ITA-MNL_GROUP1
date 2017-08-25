package com.oocl.day7.exercise1;

public class SimpleCalculator {

	public static void main(String[] args) {
		

		System.out.println((int) (11 / (float) 0));
		
		
		
		
		System.out.println(calculate(2,20000));
	}
	
	public static int calculate(int i, int j) {
		
		return j == 0 ? i : calculate(++i, --j);
		
	}
	
	
}
