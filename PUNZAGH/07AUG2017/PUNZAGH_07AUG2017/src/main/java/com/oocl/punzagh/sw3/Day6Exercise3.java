package com.oocl.punzagh.sw3;

import java.util.Scanner;

public class Day6Exercise3{


	private static void callExceptions(int input) throws Day6Exercise3Exception1, Day6Exercise3Exception2, Day6Exercise3Exception3{

		switch (input) {
		case 1:
			throw new Day6Exercise3Exception1();
		case 2:
			throw new Day6Exercise3Exception2();
		case 3:
			throw new Day6Exercise3Exception3();
		}
	}

	public static void main(String[] args) {
		System.out.println("[1]throw new Day6Exercise3Exception1\n"
				+ "[2]throw new Day6Exercise3Exception2\n"
				+ "[3]throw new Day6Exercise3Exception3");
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		try {
			callExceptions(input);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
}
}
