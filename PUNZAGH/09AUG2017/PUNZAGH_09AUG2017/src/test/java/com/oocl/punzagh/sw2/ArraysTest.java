package com.oocl.punzagh.sw2;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArraysTest {

	@Test(timeout=14)
	public void testSort_Performance() {
		for(int i=0;i<=1000000;i++){
			Arrays.sort(new int[] {i,i-1,i+1});
		}
	}
}
