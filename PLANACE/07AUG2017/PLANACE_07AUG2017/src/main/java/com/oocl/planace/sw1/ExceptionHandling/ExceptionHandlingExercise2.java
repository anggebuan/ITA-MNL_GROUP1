package com.oocl.planace.sw1.ExceptionHandling;

class Exception1 extends Exception{}
class HungryException extends Exception1 {

}

class ThirstyException extends Exception1 {

}

class SleepyException extends Exception1 {
	
}

public class ExceptionHandlingExercise2 {

	private static void callExceptions(String type) throws HungryException, ThirstyException, SleepyException {
		switch (type) {
		case "hungry":
			throw new HungryException();
		case "thirsty":
			throw new ThirstyException();
		case "sleepy":
			throw new SleepyException();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			callExceptions("hungry");
		} catch (Exception1 e) {
			System.out.println("caught " + e.toString());
		}
	}

}
