package com.oocl.punzagh.sw3;

public class BankDemo {
	public static void main(String[] args) {
		CheckingAccount account = new CheckingAccount();

		try {
			System.out.println("Depositing $500");
			account.deposit(500);
			System.out.println("Withdrawing $1000");
			account.withdraw(1000);
			System.out.println("Withdrawing $700");
			account.withdraw(700);

		} catch (InsufiicientFundsException e) {
			System.out.println("You have insufficient balance");
		}finally {
			System.out.println("Your current total balance is: " + account.getBalanceremaining());
		}

	}

}
