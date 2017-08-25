package com.ITA.exerciseWk2;


import java.util.Scanner;

public class exer3 {

	public static void main(String[] args) throws Exception {
		
		
		exer3a e3a = new exer3a();
		e3a.exer3a();
		
		
		Scanner in = new Scanner(System.in);
		int count = 0;
		int num = 0;
		
		try {
			
			
			String[] username = new String[2];
			
			for(int i = 0; i<=2; i++) {
			System.out.print("Enter word: ");
			username[i] = in.nextLine();
			 count++;
			}
			
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	}
}


	
	
	

