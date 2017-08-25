package com.oocl.planace.sw2;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ExampleTEst {

	// @Test
	public void TestArraySort_RandomArray() {
		int[] numbers = { 12, 3, 4, 1 };
		int[] expected = { 1, 3, 4, 12 };
		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);
	}

	// @Test(expected = NullPointerException.class)
	public void testArraySort_NullArray() {
		int[] numbers = null;
		Arrays.sort(numbers);
	}
	
	@Test(timeout = 1)
	public void testSort_Performance() {
		int array[] = { 12, 23, 4 };
		for (int i = 1; i < 1; i++) {
			Arrays.sort(new int[] { i, i - 1, i + 1 });
		}
	}
}
