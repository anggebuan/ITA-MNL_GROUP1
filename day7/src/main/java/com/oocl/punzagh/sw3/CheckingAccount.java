package com.oocl.punzagh.sw3;

public class CheckingAccount {

private double balanceremaining = 1000.00;

protected double getBalanceremaining() {
	return balanceremaining;
}


public double deposit(double amount) {
	
	balanceremaining+=amount;
	
	return amount;
	//if(balanceremaining)
	
}

public double withdraw(double amount) throws InsufiicientFundsException {
	if(amount>=1000) {
	if(balanceremaining>=amount+amount*0.05) {
		System.out.println("Additional 5% is charge due to over withdrawing");
		balanceremaining-=amount;
	}else {
			throw new InsufiicientFundsException();
	}
	}else{
		if(balanceremaining>=amount) {
			balanceremaining-=amount;
		}
	}
	return balanceremaining;
}


}
