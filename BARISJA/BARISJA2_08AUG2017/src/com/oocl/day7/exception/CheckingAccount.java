package com.oocl.day7.exception;

public class CheckingAccount {

	double balance;
	double needs;

	public CheckingAccount(double balance) {
		this.balance = balance;
	}

	public void withdraw(double amount) throws InsufficientFundsException {
		
		if (amount >= 1000) {
			System.out.println("Additional 50 will be deducted");
			amount += 50;
			System.out.println("Will now deduct "+ amount);
			
		}
		
		needs = balance - amount;

		if (needs < 0) {
			throw new InsufficientFundsException(needs);
		} else {
			balance -= amount;
		}

	}

	public void deposit(double amount) {

		balance += amount;

	}

}
