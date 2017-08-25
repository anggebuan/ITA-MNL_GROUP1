package com.oocl.ita;

import java.util.Arrays;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("wazza");
		for (int x = 1; x <= 5; x++) {
			System.out.println("wazza");
			new Thread(new FibonacciClass(x)).start();
			System.out.println("test");
	}

}
}

class FibonacciClass implements Generator<Integer>, Runnable {
	private final int n;
	private int count;
	public FibonacciClass(int num) {
		this.n = num;
	}

	public int next() {
		return fibonacciRule(count++);
	}

	public int fibonacciRule(int z) {
		if (z < 2)
			return 1;    
		return fibonacciRule(z - 2) + fibonacciRule(z - 1);
	}

	public void run() {
		// TODO Auto-generated method stub
		Integer[] sequence = new Integer[n];
		for (int z = 0; z < n; z++) {
			sequence[z] = next();
		}
		System.out.println("Sequence of " + n + ": " + Arrays.toString(sequence));
		System.out.println();
	}

}
