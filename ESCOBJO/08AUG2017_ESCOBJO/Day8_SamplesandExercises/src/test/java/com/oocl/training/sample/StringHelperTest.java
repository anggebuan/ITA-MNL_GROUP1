package com.oocl.training.sample;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.oocl.traning.sample.StringHelper;

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
