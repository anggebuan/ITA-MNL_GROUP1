package com.oocl.punzagh.sw4;

import java.util.Scanner;
import java.util.regex.*;

public class Regexsample {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter desired password");
		String a = in.next();
		String regexpattern = "((?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*\\W))([a-zA-Z0-9\\W]+){8,21}";
		if(a.matches(regexpattern)) {
			System.out.println("Password is ok!~");
		}else{
			System.out.println("Password must have lower case letter, upper case letters, symbols and numbers");
		}
		
	}

}
