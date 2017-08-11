package com.oocl.barisja2.sw3;

public class Deadlock {
	public static Object Lock1 = new Object();
	public static Object Lock2 = new Object();

	public static void main(String args[]) {
		ThreadDemo1 T1 = new ThreadDemo1();
		ThreadDemo2 T2 = new ThreadDemo2();
		T1.start();
		System.out.println("T1 started at "+ System.nanoTime());
		T2.start();
		System.out.println("T2 started at "+ System.nanoTime());
	}

	private static class ThreadDemo1 extends Thread {
		public void run() {
			synchronized (Lock1) {
				
				System.out.println("Thread 1: Holding lock 1... at " + System.nanoTime());

				try {
					System.out.println("Thread 1 slept at: "+ System.nanoTime());
					Thread.sleep(10);
					System.out.println("Thread 1 woke up at: "+ System.nanoTime());
				} catch (InterruptedException e) {
				}
				System.out.println("Thread 1: Waiting for lock 2... at "+ System.nanoTime());

				synchronized (Lock2) {
					System.out.println("Thread 1: Holding lock 1 & 2... at " + System.nanoTime());
				}
			}
		}
	}

	private static class ThreadDemo2 extends Thread {
		public void run() {
			synchronized (Lock2) {
				System.out.println("Thread 2: Holding lock 2... at " + System.nanoTime());

				try {
					System.out.println("Thread 2 slept at: "+ System.nanoTime());
					Thread.sleep(10);
					System.out.println("Thread 2 woke up at: "+ System.nanoTime());
				} catch (InterruptedException e) {
				}
				System.out.println("Thread 2: Waiting for lock 1... at " + System.nanoTime());

				synchronized (Lock1) {
					System.out.println("Thread 2: Holding lock 1 & 2... at " + System.nanoTime());
				}
			}
		}
	}
}