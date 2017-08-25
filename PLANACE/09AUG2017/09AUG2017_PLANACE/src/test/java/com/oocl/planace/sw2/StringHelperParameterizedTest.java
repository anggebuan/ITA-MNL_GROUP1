package com.oocl.planace.sw2;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.oocl.planace.sw2.StringHelper;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {

	StringHelper helper = new StringHelper();

	private String input;
	private String expectedOutput;
	private String asdf;
	
	public StringHelperParameterizedTest(String input, String expectedOutput, String asdf) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
		this.asdf = asdf;
	}

	@Parameters
	public static Collection<String[]> testConditions() {
		String expectedOutputs[][] = { { "AACD", "CD", "EF" }, { "ACD", "CD", "EF" }, { "CD", "CD", "EF" } };
		return Arrays.asList(expectedOutputs);
	}

	@Test
	public void testTruncateAInFirst2Positions() {
		System.out.println(expectedOutput + " " + input);
		assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
	}

	// @Test
	public void testAreFirstAndLastTwoCharactersTheSame() {
		fail("Not yet implemented");
	}

}
