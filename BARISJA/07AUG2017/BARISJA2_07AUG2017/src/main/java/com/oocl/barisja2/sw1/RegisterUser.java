package com.oocl.barisja2.sw1;

import java.util.Scanner;

public class RegisterUser {

	public static void main(String[] args) {
		String userName, password, confPassword;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Username: ");
		userName = scan.nextLine();
		System.out.print("Enter password: ");
		password = scan.nextLine();
		System.out.print("Confirm password: ");
		confPassword = scan.nextLine();

		Validator v = new Validator(password, confPassword);

		switch (v.getErrornum()) {
		case 1:
			System.out.println("All fields must be filled!");
			break;
		case 2:
			System.out.println("Password must match!");
			break;
		case 3:
			System.out.println("Password must contain atleast one (1) digit");
			break;
		case 4:
			System.out.println("Password must contain atleast one (1) capital letter");
			break;
		case 5:
			System.out.println("Password must be atleast 8 characters");
			break;
		default:
			System.out.println("User Registered!");
			break;
		}

	}

}
