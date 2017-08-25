package com.oocl.tengkh.sw;

import java.util.Scanner;

import javax.management.relation.RelationServiceNotRegisteredException;

public class E03_regex {

	public static void main(String[] args) {
		
		String regex = "^.{8,15}$";
		String password;
		String passCode = "khimberly9";
		Scanner scan = new Scanner(System.in);
		System.out.println("Hi Khim, please enter your password ");
		System.out.println("Enter password: ");
		password = scan.nextLine();
		//scan.close();
		
		if (!(password.isEmpty())) {
			boolean validate = password.matches(regex);
			if(validate) {
				if (password.equals(passCode)) {
					System.out.println("Welcome Khim!");
				}
				else {
					System.out.println("Incorrect password");
				}
			}else {
				System.out.println("Minimum 8 characters in length");
			}
		}else {
			System.out.println("Empty");
		}

	}

}
