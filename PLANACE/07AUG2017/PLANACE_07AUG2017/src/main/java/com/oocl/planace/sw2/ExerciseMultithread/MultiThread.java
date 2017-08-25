package com.oocl.planace.sw2.ExerciseMultithread;

import java.util.ArrayList;

class Runner extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// super.run();
		for (int i = 0; i <= 10; i++) {
			System.out.println("Hello " + i + this.getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

public class MultiThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runner runner1 = new Runner();
		Runner runner2 = new Runner();
		runner1.start();
		runner2.start();
	}

}
