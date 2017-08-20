package com.oocl.allarra.HW5;

import java.util.Scanner;

public class StringManipulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "wazza wazza";
		Scanner scan=new Scanner(System.in);
		System.out.println("input Path: ");
		text = scan.nextLine();
		text = text.replaceAll("\\s","");
		text = text.replaceAll("[^\\p{ASCII}]", "");
		System.out.println(text);
	}
}
