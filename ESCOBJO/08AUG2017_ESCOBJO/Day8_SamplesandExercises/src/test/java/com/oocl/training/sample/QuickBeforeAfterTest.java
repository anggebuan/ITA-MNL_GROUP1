package com.oocl.training.sample;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAfterTest {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("BeforeClass");
	}
	
	@Before
	public void before() {
		System.out.println("Before");
	}
	
	@Test
	public void test() {
		System.out.println("Test 1");
	}
	@Test
	public void test1() {
		System.out.println("Test 2");
	}
	
	@After
	public void after() {
		System.out.println("After");
	}

}
