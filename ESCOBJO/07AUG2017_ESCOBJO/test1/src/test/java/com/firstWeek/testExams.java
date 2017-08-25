package com.firstWeek;

import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.Test;

import junit.framework.TestCase;

public class testExams extends TestCase {
	ArrayList<String> actualresult = new ArrayList<String>();
	firstExam exam = new firstExam();

	@Test
	public void test1() {

		// actualresult.add("zero");
		actualresult.add("one");
		actualresult.add("two");
		actualresult.add("default");

		assertEquals(actualresult, exam.question1());
		System.out.println("\n" +"---------------");
	}
	
	public void test2() {		
		assertEquals(8, exam.question2(5));
		System.out.println("\n" +"---------------");
	}
	
	public void test3() {		
		assertEquals(26, exam.question3(2,2));
		System.out.println("\n" +"---------------");
	}
	public void test4() {		
		assertEquals(4, exam.question4(3,10));
		System.out.println("\n" +"---------------");
	}
	
	public void test6() {	
		double num[][] = {{0.5,0.75,1.0,1.25},
			{0.75,1.0,1.25,1.5},
			{1.0,1.25,1.5,1.75},
			{1.25,1.5,1.75,2.0}};
		assertArrayEquals(num, firstExam.question6());
		System.out.println("\n" +"---------------");
	}
	
	public void test7() {		
		assertEquals(5, exam.question7(60));
		System.out.println("\n" +"---------------");
	}
	public void test10A() {		
		assertEquals(10.5, exam.question10A());
		System.out.println("\n" +"---------------");
	}
	public void test10B() {		
		assertEquals(120, exam.question10B());
		System.out.println("\n" +"---------------");
	}
	public void test10C() {		
		assertEquals(5, exam.question10C());
		System.out.println("\n" +"---------------");
	}
	public void test10D() {		
		ArrayList<Boolean> actualresult = new ArrayList<Boolean>();
	
		actualresult.add(true);
		actualresult.add(true);
		actualresult.add(false);
		actualresult.add(false);
		actualresult.add(true);
		actualresult.add(false);
		actualresult.add(false);
		actualresult.add(false);
		actualresult.add(false);
		
		assertEquals(actualresult, exam.question10D());
		System.out.println("\n" +"---------------");
	}
	public void test10E() {		
		assertEquals("cartcartoon", exam.question10E());
		System.out.println("\n" +"---------------");
	}

}
