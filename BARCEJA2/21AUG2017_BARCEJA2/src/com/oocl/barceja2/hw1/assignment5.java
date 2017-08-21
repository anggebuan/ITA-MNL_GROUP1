package com.oocl.barceja2.hw1;
import java.util.Scanner;

public class assignment5 {

	public String removeWhiteSpace(String input) {
		System.out.println("Please Input string:");
		String holder="";
		holder= input.replaceAll("\\s+","");
		System.out.println(holder);
		return holder;
	}


}
