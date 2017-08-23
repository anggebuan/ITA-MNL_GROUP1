package com.oocl.day8;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class CheckAccountTest2 {
	
	public CheckAccountTest2(double input, double expected) {
		super();
		this.input = input;
		this.expected = expected;
	}
	@Before
	public void beforeMethod() {
		CA = new CheckAccount("Pedro", 600);
	}
	Double input;
	Double expected;
	CheckAccount CA;
	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	@Test 
	public void testDeposits() {
//		fail("Not yet implemented");
		
	}
	
	@Parameters
	public static Collection<Double[]> createListofDeposits() {
		double bal = 600;
		Double[][] x = {{(double)100 , (double)700},{(double)400, (double)1000},{(double)600, (double)1200}};
		return Arrays.asList(x);
	}
	
	@Test
	public void test4() {
		System.out.println(input);
		assertEquals(expected , CA.deposits(input),0);
	}

}
