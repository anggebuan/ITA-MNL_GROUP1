package com.oocl.planace.sw1;

public class FunctionalExercise1 {

	private static int add(int number1, int number2) {
		return number2 == 0 ? number1 : add(++number1, --number2);
	}
	
	public static int divide(int x, int y) {
		return (int)(x/(float)y);
	}
	
	public static void main(String[] args) {
		int number1 = 10;
		int number2 = 200;
		System.out.println(number1 + " + " + number2 + " = " + add(number1,number2));
		
		System.out.println(divide(6,0));
	}

}
