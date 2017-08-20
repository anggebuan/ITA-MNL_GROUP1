package com.oocl.punzagh.hw5;

import java.util.Scanner;

public class TrimAndRemoveNonEnglish {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter String to remove white space and remove non-english characters");
	String str = input.nextLine().trim();
	input.close();
	str = str.replaceAll("[^\\x00-\\x7F]|\\s", "");
	System.out.println(str);
}
}
