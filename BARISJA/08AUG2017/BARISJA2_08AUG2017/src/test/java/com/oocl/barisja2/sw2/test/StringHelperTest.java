package com.oocl.barisja2.sw2.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.oocl.barisja2.sw2.StringHelper;

public class StringHelperTest {
	
	StringHelper helper;

	@Before
	public void before() {
		helper = new StringHelper();
	}
	
	@Test
	public void testTruncateAInFirst2Position_AinFirst2Positions() {
		assertEquals("CD", helper.truncateAInFirst2Position("AACD"));
	}

	@Test
	public void testAreFirstAndLastTwiCharactersTheSame() {
//		fail("Not yet implemented");
	}

	
	
	
}
