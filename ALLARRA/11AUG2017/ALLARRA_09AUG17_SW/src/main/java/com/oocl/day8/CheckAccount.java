package com.oocl.day8;

public class CheckAccount {
	private String name;
	private double balance;

	public CheckAccount(String name, double balance) {
		this.name = name;
		System.out.println("Welcome :" + name);
		this.balance = balance;
	}

	public double checkbalance() {
		return balance;
	}

	public double deposits(double x) {
		System.out.println("you are depositing total of " + x + " amount");
		double temp = balance + x;
		balance = temp;
		System.out.println(x + " Amount has been succesfully deposited in your account");
		return balance;
	}

	public double withdrawal(double x) throws BankExceptionThrowable {
		System.out.println("you are tryting to withdraw amount of " + x);
		double amount = balance - x;
		System.out.println(x + " of amount is successfully withdrawn");
		if (amount < 0) {
			System.out.print("Your balance is " + balance);
			throw new BankExceptionThrowable(x);
		}
		else
			balance = amount;		
		return amount;
	}

}
