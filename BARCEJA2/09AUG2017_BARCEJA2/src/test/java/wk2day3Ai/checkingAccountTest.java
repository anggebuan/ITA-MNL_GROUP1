package wk2day3Ai;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.oocl.barceja2.sw3.checkingAccount;
import com.oocl.barceja2.sw3.customException;

public class checkingAccountTest {

	checkingAccount ca;
	
	@Before
	public void testCheckingAccount() {
		ca=new checkingAccount(100);
		System.out.println("before void");
	}

	@Test
	public void testGetBalance() {
		assertEquals(100,ca.getBalance());
		System.out.println("get balance");
	}

	@Test
	public void testSetBalance() {
		ca.setBalance(700);
		assertEquals(700,ca.getBalance());
		System.out.println("set balance");
	}

	@Test(expected = customException.class)
	public void testDesiredAmt() throws customException {
		ca.desiredAmt(50);
		System.out.println("DesiredAmt");
	}
	
	@Test
	public void testDesiredAmtTrue() throws customException {
		ca.desiredAmt(50);
		System.out.println("DesiredAmt");
	}

	@Test
	public void testWithdraw() {
		ca.withdraw(100);
		assertEquals(0,ca.getBalance());
	}

	@Test
	public void testDeposit() {
		ca.deposit(200);
		assertEquals(300,ca.getBalance());
	}

}
