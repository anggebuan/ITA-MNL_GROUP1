package com.oocl.punzagh.AUG2017_PUNZAGH;

import java.util.Scanner;

public class ExceptionWithFinally {

	public static void main(String[] args) {
		
		
	try {
		int s[] = new int[3];
		s[3] = 2;

	}catch(Exception e) {
		System.out.println("-----Catch block-----");
		e.printStackTrace();
		System.out.println("-----Catch block-----");
	}finally {
		System.out.println("-----Finally block-----");
		System.out.println("Finally Block");
		System.out.println("-----Finally block-----");
	}

}
}