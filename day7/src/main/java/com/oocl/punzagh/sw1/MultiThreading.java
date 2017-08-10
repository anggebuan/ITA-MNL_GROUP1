package com.oocl.punzagh.sw1;



class Runner extends Thread{
	public void run() {
		for (int i = 0; i < 10; i++) {
			
			//System.out.println("Hello " + i);
			System.out.println("Thread 1 ");

			try {
				Thread.sleep(100);
//				this.getState();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}

class Runner2 extends Thread{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread 2 ");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}
public class MultiThreading {

		@SuppressWarnings("deprecation")
		public static void main (String args[]) {
			Runner run1 = new Runner();
			Runner2 run2 = new Runner2();
			System.out.println("Thread1 " +run1.getState());
			System.out.println("Thread2 " +run2.getState());
			run1.start();
			System.out.println("Thread1 " +run1.getState());
			System.out.println("Thread1 " +run1.isAlive());
			try {
				run1.join(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Thread1 " +run1.getState());
			
			System.out.println("Thread1 " +run1.getState());
			run2.start();
			System.out.println("Thread2 " +run2.getPriority());
			run2.setPriority(1);
			System.out.println("Thread2 " +run2.getState());
		}
}
