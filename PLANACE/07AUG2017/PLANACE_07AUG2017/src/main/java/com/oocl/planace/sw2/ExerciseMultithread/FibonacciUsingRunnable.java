package com.oocl.planace.sw2.ExerciseMultithread;

import java.util.*;
import java.lang.Integer;

class Fibonacci implements Generator<Integer>, Runnable {
	private int count;
	private final int n;

	public Fibonacci(int n) {
		this.n = n;
	}

	public Integer next() {
		return fib(count++);
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		Integer[] sequence = new Integer[n];
		for (int i = 0; i < n; i++) {
			sequence[i] = next();
		}
		System.out.println("Seq. of " + n + ": " + Arrays.toString(sequence));
	}
	private int fib(int n) {
		if (n < 2)
			return 1;
		return fib(n - 2) + fib(n - 1);
	}

}

public class FibonacciUsingRunnable {
	public static void main(String args[]) {
		// Scanner scan = new Scanner(System.in);

		// int x = scan.nextInt();
		int x = 10;
		for (int i = 1; i <= x; i++) {
			Thread y = new Thread(new Fibonacci(i));
			y.start();
		}
	}
}
