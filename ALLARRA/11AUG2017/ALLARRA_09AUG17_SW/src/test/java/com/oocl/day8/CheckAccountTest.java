package com.oocl.day8;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

public class CheckAccountTest {
	
	CheckAccount CA;
	@Before
	public void createInstance(){
		 CA = new CheckAccount("Pedro", 600);
	}
//	
//	@Test
//	public void testCheckAccount() {
//		fail("Not yet implemented");
//	}

	@SuppressWarnings("deprecation")
	@Test
	public void testCheckbalance() {
		double initialBalance = 600;
		
		assertEquals(initialBalance, CA.checkbalance(),1);
	}
	

	@Test (expected = BankExceptionThrowable.class)
	public void testWithdrawal() throws BankExceptionThrowable{
		double[] withdraw  = {5000,100,200,600,50};
		for(int x=0;x<withdraw.length;x++) {
		CA.withdrawal(withdraw[x]);
		}
	}


}
