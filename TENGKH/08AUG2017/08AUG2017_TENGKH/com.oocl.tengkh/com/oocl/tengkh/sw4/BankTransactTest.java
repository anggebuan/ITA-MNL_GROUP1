package com.oocl.tengkh.sw4;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.oocl.tengkh.sw3.bankException;
import com.oocl.tengkh.sw3.checkingAmount;

@RunWith(Parameterized.class)
public class BankTransactTest {

	checkingAmount bankAccount = new checkingAmount();

	private double amount;
	private double expect;
	private double balance;

	public BankTransactTest(double amount, double balance, double expect ) {
		this.amount = amount;
		this.balance = balance;
		this.expect = expect;
		/*System.out.println("Amount: " + this.amount);
		System.out.println("Balance: " + this.balance);
		System.out.println("Expect: " + this.expect);*/
		
	}

	@Parameters
	public static List<Double[]> testDeposits() {
		Double expect[][] = {{10.0,100.0,90.0},{100.0,200.0,300.0}};// 90, 100, 3, 5000 };
		return Arrays.asList(expect);
	}

	@Test
	public void testWid() {
		bankAccount.setAmount(amount);
		bankAccount.setBalance(balance);

		double actual = 0;
		try {
			actual = bankAccount.withdraw(bankAccount.getAmount());
		} catch (bankException e) {
			System.out.println("error");
		}
		assertEquals(expect, actual, 0);
	}
}
