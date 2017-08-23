package com.oocl.barceja2.sw2;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class truncateAIinFirst2PositionsTest {
	
	static truncateAIinFirst2Positions tru;
	@BeforeClass
	public static void testBefore(){
		tru = new truncateAIinFirst2Positions();
	}
	
	truncateAIinFirst2Positions test ;
	public String input;
	public String expectedOutput;
	
	public truncateAIinFirst2PositionsTest(String i, String e){
		this.input = i;
		expectedOutput= e;
	}

	@Test
	public void testTruncateAInfirst2positions() {
		test = new truncateAIinFirst2Positions();
		assertEquals("CD", test.truncateAInfirst2positions("AACD"));
	}

	@Test
	public void testAreFirstAndLastTwoCharTheSame() {
		fail("Not yet implemented");
	}
	
	@Test
	public void TestArraySort_RandomArray() {
		int[] numbers = {12,3,4,1};
		int[] expected = {1,3,4,12};
		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);
	} 

	@Test(timeout = 23)
	public void testperformance() {
		for (int i = 0; i<1000000; i++) {
			Arrays.sort(new int[] {i, i-1, i+1});
		}
	}
	
	
	
	@Parameters
	public static Collection<String[]>testconditions(){
		String expected[][] = {{"AACD","CD"}, {"ACD","CD"},{"BAADC","BDC"}};
		return Arrays.asList(expected);
	}
	
	@Test
	public void test4() {
		System.out.println(input);
		assertEquals(expectedOutput, tru.truncateAInfirst2positions(input));
	} 
	
	
}
