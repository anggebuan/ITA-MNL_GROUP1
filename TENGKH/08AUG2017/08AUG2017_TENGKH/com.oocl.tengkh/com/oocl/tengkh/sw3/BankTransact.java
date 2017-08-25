package com.oocl.tengkh.sw3;

import org.omg.PortableServer.ThreadPolicyOperations;

public class BankTransact {

	public static void main(String[] args) throws bankException {
		checkingAmount bankAccount = new checkingAmount();
		int amount = 1000;
		try {
			System.out.println("You have deposited on your bankAccount: " + amount + " PHP");
			bankAccount.depot(amount);
			int withdraw1 = 800, withdraw2 = 300;
			System.out.println("\nYou request to withdraw amount of " + withdraw1 + " PHP");
			bankAccount.withdraw(withdraw1);
			System.out.println("\nYou request to withdraw amount of " + withdraw2 + " PHP");
			bankAccount.withdraw(withdraw2);
		} catch (bankException e) {
			System.out.println("Insufficient balance! Remaining balance is " + bankAccount.balance + " PHP");
		}

	}

}