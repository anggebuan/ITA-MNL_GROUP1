package com.oocl.escobjo.hw;

import java.util.Scanner;

public class Multiplesof2 {

	int count = 0;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		
		
		System.out.print("\tEnter number of multiples to display: ");
		int n = scanner.nextInt();
		
		int i,j;
		
		for(i = 0 ; i<=n; i++) {
			//for(j =  ; j<=n; j++) {
			int mult = i*2;	
			System.out.println(mult);
			//}
		}
		

	}


}
