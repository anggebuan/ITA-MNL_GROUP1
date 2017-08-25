package com.ITA.exerciseWk2;

public class BankDemo {

	public static void main(String[] args) {
		double a, b, c;
		CheckingAccount acc = new CheckingAccount(100);
		a = acc.deposit(500);
		System.out.println("\nDeposit: " + a);
	
		try {

			b = acc.withdraw(700);

			System.out.println("Withdraw: " + b);
			System.out.println("Balance: " + acc.balance);

			// throw new InsufficientFundsException();
		}

		catch (InsufficientFundsException e) {

			System.out.print("\nException: "+e.getMessage());

			e.printStackTrace();
			
		}

	}

}
