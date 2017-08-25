package com.ITA.regEx;

import java.util.Scanner;

public class sampleRegEx {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String username, password;

		String upattern = "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{4,}";
		String ppattern = "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@_#$%^&+=]).{8,}";
//		/String noNum = "(?=.*[0-9]).";

		System.out.print("Enter Username: ");
		username = in.nextLine();

		if (!username.matches(upattern)) {
			System.out.print("\nInvalid Username. It must contain at least 8 characters: ");
			System.out.println("\n\t-letters(capital and small) and numbers  ");
		} else {
			System.out.println("\nValid Username. ");
		}

		// ------------------

		System.out.print("\n\nEnter Password: ");
		password = in.nextLine();
		if (!password.matches(ppattern)) {
			System.out.print("\nInvalid Password. It must contain at least 8 characters:");
			System.out.println("\n\t-letters(capital and small), numbers, and symbols  ");
		} else {
			System.out.println("Valid Password. ");
		}

		if (username.matches(upattern) && password.matches(ppattern)) {
			System.out.print("\n--- Congrats. Log-in successful. ^__^ --- ");
		} else {
			System.out.print("\n\n --- LOG - IN FAILED! . :( --- ");
		}

	}
}
