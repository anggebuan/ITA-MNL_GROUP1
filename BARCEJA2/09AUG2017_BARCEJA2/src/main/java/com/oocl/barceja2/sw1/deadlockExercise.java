package com.oocl.barceja2.sw1;

public class deadlockExercise {

	 public static Object Lock1 = new Object();
	 public static Object Lock2 = new Object();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();
		
	}
	
	private static class Thread1 extends Thread{
		public Thread1() {
			// TODO Auto-generated constructor stub
		}

		public void run() {
			synchronized(Lock1) {
				System.out.println("Thread 1: holding lock 1...");
			}
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			System.out.println("Thread1 1: Waiting for lock 2...");
			
			synchronized (Lock2) {
				System.out.println("Thread 1: Holding lock 1 & 2...");
			}
			
		}
		
	}
	private static class Thread2 extends Thread{
		public Thread2() {
			// TODO Auto-generated constructor stub
		}

		public void run() {
			synchronized(Lock1) {
				System.out.println("Thread 2: holding lock 2...");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO: handle exception
				}
				System.out.println("Thread 2: Waiting for lock 1...");
				
				synchronized (Lock2) {
					System.out.println("Thread 2: Holding lock 1 & 2...");
				}
			}
		}
	}
}


