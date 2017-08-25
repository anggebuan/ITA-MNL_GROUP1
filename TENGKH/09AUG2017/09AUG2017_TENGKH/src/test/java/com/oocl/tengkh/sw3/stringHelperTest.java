package com.oocl.tengkh.sw3;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import com.oocl.tengkh.sw2.stringHelper;

public class stringHelperTest {

	stringHelper helper; //declaration of Object
	
	@Before
	public void before() {
		helper = new stringHelper();
		System.out.println("Before test");
	}
	
	 @Test public void testTruncateAInFirst2Position() {
		 assertEquals("CD", helper.truncateAInFirst2Position("AACD"));
		 
	 }
	/* 
	 @Test public void testAreFirstAndLastTwiCharactersTheSame() {
	 fail("Not yet implemented"); }
	 
	@Test
	public void testArraySort() {
		int[] expected = {1,2,3};
		int[] actual = {3,2,1};
		Arrays.sort(actual);
		assertArrayEquals(expected, actual);
	}

	@Test(expected = NullPointerException.class)
	public void testArraySort_NullArray() {
		int[] actual = null;
		int[] expected = {3,2,1};
		Arrays.sort(expected);
		assertArrayEquals(expected, actual);
	}
	
	@Test (timeout = 23)
	public void pub() {
		for (int i = 0; i < 1000000; i++) {
			Arrays.sort(new int[] {i, i-1, i+1});
		}

	}
*/
}
