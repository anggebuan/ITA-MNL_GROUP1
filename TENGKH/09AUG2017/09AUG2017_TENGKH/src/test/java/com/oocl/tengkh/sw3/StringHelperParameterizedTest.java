package com.oocl.tengkh.sw3;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;

import com.oocl.tengkh.sw2.stringHelper;

import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {
	stringHelper helper = new stringHelper();

	private String input; // actual
	private String expectedOutput;
	private String expect;// expected

	// constructor
	public StringHelperParameterizedTest(String input, String expectedOutput, String expect) {
		this.input = input;
		this.expectedOutput = expectedOutput;
		this.expect = expect;
		System.out.println(this.input);
		System.out.println(this.expectedOutput);
		System.out.println(this.expect);
	}

	@Parameters
	public static Collection<String[]> testConditions() {
		String expectedOutputs[][] = { { "AACD", "CD","SAD" }, { "ACD", "CD","SAD" } };
		return Arrays.asList(expectedOutputs);
	}

	@Test
	public void testTruncateAInFirst2Position() {
		System.out.println(input);
		assertEquals(expectedOutput, helper.truncateAInFirst2Position(input));

	}
}
