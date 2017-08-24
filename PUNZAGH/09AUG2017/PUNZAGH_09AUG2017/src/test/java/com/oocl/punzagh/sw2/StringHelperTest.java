package com.oocl.punzagh.sw2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.oocl.punzagh.sw2.StringHelper;

public class StringHelperTest {
	StringHelper helper;
	
	@Before
	public void before() {
		 helper = new StringHelper();
	}
	
	
	
	@Test
	public void testTrucateAInFirst2Positions_AinFirst2Positions() {
		assertEquals("CD",helper.trucateAInFirst2Positions("AACD"));
		System.out.println(helper.trucateAInFirst2Positions("AACD"));
	}
	@Test
	public void testTrucateAInFirst2Positions_AinFirstPosition() {
		assertEquals("CD",helper.trucateAInFirst2Positions("ACD"));
		System.out.println(helper.trucateAInFirst2Positions("ACD"));
	}
	
//	@Test
//	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
//		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
//	}
//	@Test
//	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
//		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
//	}
	

}
