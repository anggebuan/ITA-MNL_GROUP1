package com.ITA.exerciseWk2;

//multithreading

public class threads {

	public static void main(String[] args) {

		for (int i = 1; i <= 2; i++) {
			Runner runner = new Runner();
			runner.start();
		}
	}

}

class Runner extends Thread {
	public void run() {

		String threadName = "";
		int count = 0;
		for (int i = 1; i <= 5; i++) {

			System.out.println("Creating Thread " + threadName + i);
			System.out.println("Starting Thread " + threadName + i);
			System.out.println("Running Thread " + threadName + i);

			count++;

			System.out.println("\nThread: " + threadName + count + "\n");

			try {
				Thread.sleep(100);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
