package oocl.com.ITA;

public class BankExceptionThrowable extends Throwable {

	double amount;
	public BankExceptionThrowable(double amount){
		this.amount = amount;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return " and is not sufficient to withdraw "+ amount + " amount";
	}
	
	
}
