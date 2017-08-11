package com.oocl.training.sample;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ArrayCompareTest.class, ArraysTest.class, QuickBeforeAfterTest.class,
		StringHelperParameterizedTest.class, StringHelperTest.class })
public class AllTests {

}
