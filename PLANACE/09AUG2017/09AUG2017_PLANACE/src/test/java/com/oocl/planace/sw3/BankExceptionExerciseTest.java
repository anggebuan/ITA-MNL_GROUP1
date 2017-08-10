package com.oocl.planace.sw3;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.*;
import org.junit.runner.*;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.oocl.planace.sw3.Account;
import com.oocl.planace.sw3.InsufficientFundsException;

@RunWith(Parameterized.class)
public class BankExceptionExerciseTest {

	Account bankAccount = new Account();

	private double createMoney = 0;
	private double depositMoney = 0;
	private double withdrawMoney = 0;

	public BankExceptionExerciseTest(double createMoney, double depositMoney, double withdrawMoney) {
		super();
		this.createMoney = createMoney;
		this.depositMoney = depositMoney;
		this.withdrawMoney = withdrawMoney;
	}

	@Parameters
	public static Collection<Double[]> testData() {
		Double money[][] = { { 1000.0, 200.0, 300.0 }, { 200.0, 200.0, 500.0 }, { 123.0, 123.0, 123.0 } };
		return Arrays.asList(money);
	}

	@Before
	public void testAccount() {
		assertEquals("Success", bankAccount.createAccount(createMoney));
	}

	@Test
	public void testDeposit() {
		assertEquals("Success", bankAccount.createAccount(depositMoney));
	}

	@Test
	public void testWithdrawSuccess() throws InsufficientFundsException {
		try {
			assertEquals("Success", bankAccount.withdraw(withdrawMoney));
		} catch (InsufficientFundsException e) {
			fail(e.showInsufficientMoney());
		}
	}
	
	@Test (expected = InsufficientFundsException.class)
	public void testWithdrawFailed() throws InsufficientFundsException {
		bankAccount.withdraw(withdrawMoney);
	}

}
