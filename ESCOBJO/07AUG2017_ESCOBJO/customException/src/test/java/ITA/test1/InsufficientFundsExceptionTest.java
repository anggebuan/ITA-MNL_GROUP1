package ITA.test1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.ITA.exerciseWk2.BankDemo;
import com.ITA.exerciseWk2.CheckingAccount;
import com.ITA.exerciseWk2.InsufficientFundsException;

import junit.framework.TestCase;

public class InsufficientFundsExceptionTest {

	
	CheckingAccount helper;
	double n = 10;
	CheckingAccount acc = new CheckingAccount(n);
	
	@Before
	public void before() {
		helper = new CheckingAccount(n);
	}
	
	@Test
	public void accountTest() throws InsufficientFundsException {
		assertEquals("InsufficientFundsException", helper.withdraw(n));
	}

}
