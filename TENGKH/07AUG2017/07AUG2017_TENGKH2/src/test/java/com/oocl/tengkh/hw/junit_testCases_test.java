package com.oocl.tengkh.hw;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

import com.oocl.tengkh.exam.Main;

public class junit_testCases_test {

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		//fail("Not yet implemented");
		
		Main main = new Main();
		
		//test_exercise 1
		System.out.println("Exercise 1 test result: ");
		ArrayList<String> arrayList_expected = new ArrayList<String>();
		ArrayList<String> arrayList_actual = new ArrayList<String>();
		arrayList_expected.add("one");
		arrayList_expected.add("two");
		arrayList_expected.add("default");
		arrayList_actual = main.Exercise1();
		assertEquals(arrayList_expected, arrayList_actual);
		System.out.println("Expected: " + arrayList_expected + "\nActual: " + arrayList_actual);
		
		//test_exercise 2
		System.out.println("\nExercise 2 test result: ");
		int expected = 8;
		int n = 0;
		int actual = main.Exercise2(n);
		assertEquals(expected, actual );
		System.out.println("Expected: " + expected + "\nActual: " + actual);
		
		//test_exercise 3
		System.out.println("\nExercise 3 test result: ");
		int expected2 = 2;
		int actual2 = main.Exercise3();
		assertEquals(expected2, actual2);
		System.out.println("Expected: " + expected2 + "\nActual: " + actual2);
		
		
		//test_exercise 4
		System.out.println("\nExercise 4 test result: ");
		ArrayList<String> arrayList_expected2 = new ArrayList<String>();
		arrayList_expected2.add("Hello");
		arrayList_expected2.add("Hello");
		arrayList_expected2.add("Hello");
		arrayList_expected2.add("Hello");
		ArrayList<String> arrayList_actual2 = new ArrayList<String>();
		arrayList_actual2 = main.Exercise4();
		assertEquals(arrayList_expected2, arrayList_actual2);
		System.out.println("Expected: " + arrayList_expected2 + "\nActual: " + arrayList_actual2);
		
		//test_exercise 7
		System.out.println("\nExercise 7 test result: ");
		int expected3 = 5;
		int actual3 = main.Exercise7(60);
		assertEquals(expected3, actual3);
		System.out.println("Expected count: " + expected3 + "\nActual count: " + actual3);
		
		//test_exercise 10.a
		System.out.println("\nExercise 10.a test result: ");
		double expected4  = 10.5;
		double actual4 = main.Exercise10_A();
		double delta = 0;
		assertEquals(expected4, actual4, delta );
		System.out.println("Expected: " + expected4 + "\nActual: " + actual4);
		
		//test_exercise 10.b
		System.out.println("\nExercise 10.b test result: ");
		ArrayList<Integer> integer_expected = new ArrayList<Integer>();
		ArrayList<Integer> integer_actual = new ArrayList<Integer>();
		integer_expected.add(20);
		integer_expected.add(120);
		integer_actual = main.Exercise10_B();
		assertEquals(integer_expected, integer_actual);
		System.out.println("Expected: " + integer_expected + "\nActual: " + integer_actual);
		
		//test_exercise 10.c
		System.out.println("\nExercise 10.c test result: ");
		ArrayList<String> arraylist_expected = new ArrayList<String>();
		ArrayList<String> arraylist_actual = new ArrayList<String>();
		arraylist_actual = main.Exercise10_C();
		arraylist_expected.add("*");
		arraylist_expected.add("*");
		arraylist_expected.add("*");
		arraylist_expected.add("*");
		arraylist_expected.add("*");
		assertEquals(arraylist_expected, arraylist_actual);
		System.out.println("Expected: " + arraylist_expected + "\nActual: " + arraylist_actual);
		
		
		//test_exercise 10.d
		System.out.println("\nExercise 10.d test result: ");
		ArrayList<Boolean> bool_expect = new ArrayList<Boolean>();
		ArrayList<Boolean> bool_actual = new ArrayList<Boolean>();
		bool_expect.add(false);
		bool_expect.add(false);
		bool_expect.add(false);
		bool_actual = main.Exercise10_D();
		assertEquals(bool_expect, bool_actual);
		System.out.println("Expected: " + bool_expect + "\nActual: " + bool_actual);
	
		
		//test_exercise 10.e
		System.out.println("\nExercise 10.e test result: ");
		ArrayList<String> arrayListex = new ArrayList<String>();
		ArrayList<String> arrayListac = new ArrayList<String>();
		arrayListex.add("cart");
		arrayListex.add("cart");
		arrayListex.add("o");
		arrayListex.add("o");
		arrayListex.add("n");
		arrayListac = main.Exercise10_E();
		assertEquals(arrayListex, arrayListac);
		System.out.println("Expected: " + arrayListex + "\nActual: " + arrayListac);
		
		/*//test_exercise 10.e
		System.out.println("\nExercise 10.e test result: ");
		int a,b,c;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		a = scan.nextInt();
		System.out.println("\nEnter 2nd number: ");
		b = scan.nextInt();
		System.out.println("\nEnter 3rd number: ");
		c = scan.nextInt();
		scan.close();
		
		assertArrayEquals(Ex10(a,b,c), main.Execercise10e(a, b, c));*/
	
	}
	
	/*public String[] Ex10(int x, int y, int z) {
		String[] a = new String[3];
		int one = x, two = y, three = z;
		do {
			one++;
			a[0] += "cart";
			//System.out.println("cart");
		}
		while(one < 3);
		for(int i = 0; i<two; i++) {
			a[1] += "o";
			//System.out.println("o");
		}
		while(true) {
			three++;
			if(three == 5) {
				break;
			}
			//System.out.println("n");
			a[2] +="n";
		}
		return a;

	}*/
}

