package com.oocl.planace.sw2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import com.oocl.planace.sw2.StringHelper;

public class StringHelperTest {

	StringHelper helper;
	
	@Before
	public void before() {
		helper = new StringHelper();
	}
	@Test
	public void testTruncateAInFirst2Positions() {
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AAsfasdfsAA"));
	}
	
	@After
	public void testFinished(){
		System.out.println("A test is finished");
	}
	
	@AfterClass
	public static void allTestsDone() {
		System.out.println("All tests finished");
	}
	

}
