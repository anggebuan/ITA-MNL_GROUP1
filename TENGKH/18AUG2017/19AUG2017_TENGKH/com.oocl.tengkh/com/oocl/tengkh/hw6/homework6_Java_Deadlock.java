package com.oocl.tengkh.hw6;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

public class homework6_Java_Deadlock {
	public static Object Lock1 = new Object();
	public static Object Lock2 = new Object();

	public static void main(String args[]) {
		ThreadDemo1 T1 = new ThreadDemo1();
		ThreadDemo2 T2 = new ThreadDemo2();
		T1.start();
		T2.start();

		
		 ThreadMXBean bean = ManagementFactory.getThreadMXBean(); long ids[] =
		 bean.findMonitorDeadlockedThreads();
		 
		 if(ids != null) { System.out.println("\nFound deadlocks"); }else{
		 System.out.println("No deadlock found"); }
		 
		 detectDeadlock();
		 

	}

	private static class ThreadDemo1 extends Thread {
		public void run() {
			synchronized (Lock1) {
				System.out.println("Thread 1: Holding lock 1...");

				try {
					Thread.sleep(0);
				} catch (InterruptedException e) {
					detectDeadlock();
				}
				System.out.println("Thread 1: Waiting for lock 2...");

				synchronized (Lock2) {
					System.out.println("Thread 1: Holding lock 1 & 2...");
				}
			}
		}
	}

	private static class ThreadDemo2 extends Thread {
		public void run() {
			synchronized (Lock2) {
				System.out.println("Thread 2: Holding lock 1...");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					detectDeadlock();
				}
				System.out.println("Thread 2: Waiting for lock 2...");

				synchronized (Lock1) {
					System.out.println("Thread 2: Holding lock 1 & 2...");
				}
			}
		}
	}

	public static void detectDeadlock() {
		ThreadMXBean threadBean = ManagementFactory.getThreadMXBean();
		long[] threadids = threadBean.findDeadlockedThreads();
		int deadlockthreads = threadids != null ? threadids.length : 0;
		System.out.println("Number of deadlock: " + deadlockthreads);
	}
}