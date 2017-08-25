package com.oocl.barisja.hw5;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		System.out.print("Please enter String: ");
		String input = new Scanner(System.in).nextLine();

		String output = removeWhites(input);

		System.out.println("Output is: " + output);
	}

	private static String removeWhites(String input) {

		String str[] = input.split(" ");
		String output = "";
		
		for (int i = 0; i < str.length; i++) {
			if(Pattern.compile("\\W").matcher(str[i]).matches() == true) {
				continue;
			
			} else {
				output += str[i];
			}
		}
		
		
		return output;
	}

}
