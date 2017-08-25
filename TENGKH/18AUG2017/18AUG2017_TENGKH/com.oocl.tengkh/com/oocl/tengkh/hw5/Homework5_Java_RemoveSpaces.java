package com.oocl.tengkh.hw5;

import java.util.Scanner;

public class Homework5_Java_RemoveSpaces {

	public static void main(String[] args) {
		String input;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value: ");
		input = scan.nextLine();
		String removeSpaces = input.replaceAll("[^w+\\s]", "");
		System.out.println("\nResult: " + removeSpaces);
	}

}
