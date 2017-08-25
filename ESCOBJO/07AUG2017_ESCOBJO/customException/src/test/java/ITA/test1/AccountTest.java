package ITA.test1;

import org.junit.Before;
import org.junit.Test;

import com.ITA.exerciseWk2.BankDemo;
import com.ITA.exerciseWk2.CheckingAccount;
import com.ITA.exerciseWk2.InsufficientFundsException;
import static org.junit.Assert.*;

import java.util.Scanner;


public class AccountTest {

	Scanner input = new Scanner(System.in);
	CheckingAccount helper;
	double n =600 ;
	//double n ;
	
	@Before
	public void before() {
	//System.out.println("Enter amount: ");
	//n = input.nextDouble();
		helper = new CheckingAccount(n); 
		//n=600;
	}
	
	@Test
	public void depositTest()  {
		System.out.println("depo:"+n);
		helper.deposit(n);
	}	
	
	@Test
	public void withdrawTest() throws InsufficientFundsException {
		System.out.println("withdraw:"+n);
		helper.withdraw(n);
	}	
	

	@Test(expected=InsufficientFundsException.class)
	public void exceptionTest() throws InsufficientFundsException {
		System.out.println("exc:"+n);
		helper.withdraw(n);
	}
	

}
