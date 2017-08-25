package com.oocl.ita;

import java.util.Scanner;

public class regexPasswordValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Password = new String();

		Scanner scanIn = new Scanner(System.in);

		System.out.print("Please input password ");
		Password = scanIn.nextLine();
		scanIn.close();
		System.out.print(Password.matches("/[A-Z]/"));
		if(Password.length()>=8 && Password.length()<=32)
			if(Password.matches("/[A-Z]/")) {
				System.out.println("Password Met");
			}
			else
				System.out.println("Password does not met, please include capital small number and ");
		else
			System.out.println("Password length not met");
	}

}
