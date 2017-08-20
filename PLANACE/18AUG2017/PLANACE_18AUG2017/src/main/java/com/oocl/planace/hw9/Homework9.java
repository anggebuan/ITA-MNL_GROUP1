package com.oocl.planace.hw9;

import java.util.Scanner;

public class Homework9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please choose what to run:");
		System.out.println("1 - Notepad");
		System.out.println("2 - Windows Media Player");
		System.out.println("Your choice is: ");
		Scanner scan = new Scanner(System.in);
		String in = scan.nextLine();
		try {
			if (in.equals("1"))
				Runtime.getRuntime().exec("notepad");
			else
				Runtime.getRuntime().exec("cmd /c start \"%programfiles%\\Windows Media Player\\wmplayer.exe\"");
		} catch (Exception e) {

		}
	}

}
