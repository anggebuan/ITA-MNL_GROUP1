package com.oocl.escobjo.sw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//ort

public class sorting2 {

	
	public static void main(String[] args) {
		
		sort(null);
	//	int[]num = new int[];
		
	}
	
	public static void sort(int arr[]) {
		System.out.println("How many numbers you want to sort ?");
		System.out.println("Enter a number: ");
		Scanner input = new Scanner(System.in);
		int num;
		
		num = input.nextInt();
		int x,y,prime;
		
		for (x=0; x<=num; x++) {
			for(y=2; y<=x; y++) {
				prime = x%y;
				if(prime==0) {
					break;
				}
				
			}
			if(x==y) {
				System.out.println(x+" ");}
		}

	}
}
