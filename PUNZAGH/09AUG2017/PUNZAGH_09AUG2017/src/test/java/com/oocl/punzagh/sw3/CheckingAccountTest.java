package com.oocl.punzagh.sw3;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

import com.oocl.punzagh.sw3.CheckingAccount;
import com.oocl.punzagh.sw3.InsuficientFundsException;

public class CheckingAccountTest {
	CheckingAccount acct;
	
	@Before
	public void Before() {
	acct = new CheckingAccount();
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testDeposit_normaldeposit() {
	assertEquals(1200, acct.deposit(200),0);

	}
	
	@Test
	public void testDeposit_overthedatatypedeposit() {
	Scanner in = new Scanner(System.in);
		System.out.println(Double.MAX_VALUE);
	assertEquals(1200, acct.deposit(in.nextDouble()),0);

	}
	
//	public void testDeposit_normaldeposit() {
//	assertEquals(1200, acct.deposit(200),0);
//
//	}

	@Test
	public void testWithdraw_normal() throws InsuficientFundsException {
		assertEquals(800, acct.withdraw(200),0);
	}
	
	@Test(expected =InsuficientFundsException.class )
	public void testWithdraw_overwithdraw() throws InsuficientFundsException {
		assertEquals(800, acct.withdraw(1500),0);
	}

}
