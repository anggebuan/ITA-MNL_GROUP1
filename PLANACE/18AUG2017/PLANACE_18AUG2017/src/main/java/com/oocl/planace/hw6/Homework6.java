package com.oocl.planace.hw6;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class Homework6 {

	public static Object Lock1 = new Object();
	public static Object Lock2 = new Object();

	private static class ThreadDemo1 extends Thread {
		public void run() {
			synchronized (Lock1) {
				System.out.println("Thread 1: Holding lock 1...");

				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
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
				System.out.println("Thread 2: Holding lock 2...");

				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
				}
				System.out.println("Thread 2: Waiting for lock 1...");

				synchronized (Lock1) {
					System.out.println("Thread 2: Holding lock 1 & 2...");
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo1 T1 = new ThreadDemo1();
		ThreadDemo2 T2 = new ThreadDemo2();
		T1.start();
		T2.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ThreadMXBean mxBean = ManagementFactory.getThreadMXBean();
		long[] threadIDs = mxBean.findMonitorDeadlockedThreads();
		ThreadInfo[] threadInfos = mxBean.getThreadInfo(threadIDs);
		System.out.println("The locked threads are the ff:");
		for (ThreadInfo t : threadInfos) {
			System.out.println(t.getThreadName());
		}

	}

}
