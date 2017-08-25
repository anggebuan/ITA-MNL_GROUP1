package com.firstWeek;

import java.util.Scanner;

/**
 * Hello world!
 *
 */

public class Calculator {

	// int sum, diff, prod, quo;
	int ans;

	public static void main(String[] args) {

		int choice;
		int ans;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		Calculator cal = new Calculator();

		System.out.println("Calculate");
		System.out.println("1 - Add ");
		System.out.println("2 - Subtract ");
		System.out.println("3 - Multiply  ");
		System.out.println("4 - Divide \n");
		System.out.print("Enter your choice: ");
		choice = in.nextInt();

		System.out.print("\nEnter 1st number: ");
		int num1 = in.nextInt();
		System.out.print("Enter 2nd number: ");
		int num2 = in.nextInt();
		System.out.println("------------------------- ");

		if (choice == 1) {
			ans = cal.Add(num1, num2);
			System.out.println("Sum: " + ans);
		} else if (choice == 1) {
			ans = cal.Subtract(num1, num2);
			System.out.println("Difference: " + ans);
		} else if (choice == 1) {
			ans = cal.Multiply(num1, num2);
			System.out.println("Product: " + ans);
		} else if (choice == 1) {
			ans = cal.Divide(num1, num2);
			System.out.println("Quotient: " + ans);
		}
	}

	public int Add(int n1, int n2) {
		ans = n1 + n2;
		return ans;
	}

	public int Subtract(int n1, int n2) {
		ans = n1 - n2;
		return ans;
	}

	public int Multiply(int n1, int n2) {
		ans = n1 * n2;
		return ans;
	}

	public int Divide(int n1, int n2) {
		ans = n1 / n2;
		return ans;
	}

}
