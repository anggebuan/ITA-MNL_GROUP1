package com.oocl.barceja2.hw1;
import java.util.Scanner;

public class assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please Input string:");
		Scanner scan = new Scanner(System.in);
		String str =scan.nextLine();
		String holder="";
		holder= str.replaceAll("\\s+","");
		System.out.println(holder);
	}

}
