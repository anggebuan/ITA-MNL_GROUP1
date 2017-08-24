package com.oocl.punzagh.sw2;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArraysCompareTest {

	@Test
	public void testArraySort_RandomArray() {
		int[] numbers = {12, 3,4,1};
		int[] expected = {1,3,4,12};
		Arrays.sort(numbers);
		assertArrayEquals(expected,numbers);
	}

	@Test(expected = NullPointerException.class)
		public void testArraySort_NullArray() {
			int[] numbers = null;
			Arrays.sort(numbers);
		}
	

		
	
}
