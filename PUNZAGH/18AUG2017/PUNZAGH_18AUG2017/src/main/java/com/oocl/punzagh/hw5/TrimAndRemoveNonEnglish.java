package com.oocl.punzagh.hw5;

import java.util.Scanner;

public class TrimAndRemoveNonEnglish {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String str = input.nextLine().trim();
	str = str.replaceAll("[^\\x00-\\x7F]", "");
	System.out.println(str);
}
}
