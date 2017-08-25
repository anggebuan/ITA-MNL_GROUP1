package com.oocl.day7.exception;

public class BankDemo {

	public static void main(String[] args){
		CheckingAccount c = new CheckingAccount(100);

		try {
			System.out.println("Depositing $500...");
			c.deposit(500.00);
			System.out.println("Withdrawing $100...");
			c.withdraw(100.00);
			System.out.println("Withdrawing $1000...");
			c.withdraw(1000.00);
		} catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
