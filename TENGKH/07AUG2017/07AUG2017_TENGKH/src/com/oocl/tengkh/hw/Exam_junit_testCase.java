package com.oocl.tengkh.hw;

public class Exam_junit_testCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		runner run1 = new runner();
		runner run2 = new runner();
		run1.start();
		run2.start();

	}

}

class runner extends Thread {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {

			System.out.println("Hello " + i);

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}
}