package com.oocl.punzagh.sw2;



class Runner extends Thread{
	public void run() {
		for (int i = 0; i < 10; i++) {

			//System.out.println("Hello " + i);
			System.out.println("Thread 1");

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}

class Runner2 extends Thread{
	public void run() {
		for (int i = 0; i < 10; i++) {

			//System.out.println("Hello " + i);
			System.out.println("Thread 2");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}
public class MultiThreading {

		public static void main (String args[]) {
			Runner run1 = new Runner();
			Runner2 run2 = new Runner2();
			
			run1.start();
			run2.start();
		}
}
