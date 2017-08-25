package com.oocl.tengkh.sw3;

public class checkingAmount {

	double amount, balance;

	public double depot(double amount) {
		return balance += amount;

	}

	public double withdraw(double amount) throws bankException {
		if (balance >= amount) {
			System.out.println("Withdraw: " + amount + " PHP");
			balance -= amount;
			System.out.println("Balance: " + balance + " PHP");
		} else {
			throw new bankException(amount);
		}
		return balance;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}