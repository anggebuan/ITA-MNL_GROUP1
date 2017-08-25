package com.oocl.planace.sw4.RegexExercise;

import java.util.Scanner;

public class RegexExcersise {
	public static void main(String[] args) {
		String x = "Password must contain at least one small case letter, one upper case letter, a number, a symbol "
				+ "and must be 8-21 characters long";
		System.out.println(x);
		System.out.println("Please enter your password: ");
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		String pattern = "((?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*\\W))([a-zA-Z0-9\\W]+){8,21}";
		
		if(input.matches(pattern))
			System.out.println("Pass");
		else
			System.err.println("Fail");
	}
}
