package com.oocl.allarra.HW6;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class threadLock {
	public static Object Lock1 = new Object();
	public static Object Lock2 = new Object();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo1 T1=new ThreadDemo1();
		ThreadDemo2 T2 = new ThreadDemo2();
		T1.start();
		T2.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ThreadMXBean bean = ManagementFactory.getThreadMXBean();
		long ids[] = bean.findMonitorDeadlockedThreads();
		ThreadInfo threadInfo[] = bean.getThreadInfo(ids);
		System.out.println("check locked threads");
		for (ThreadInfo threadInfo1 : threadInfo)
		{
		    System.out.println(threadInfo1.getThreadName());    //Prints the name of deadlocked thread
		}
	}

	private static class ThreadDemo1 extends Thread {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			synchronized (Lock1) {
				System.out.println("Thread1: holding lock1...");
				try {
					Thread.sleep(100);
				}catch (InterruptedException e) {
					
				}
				System.out.println("Thread1: waiting for lock2...");
				synchronized (Lock2) {
					System.out.println("Thread1: holding lock 1&2...");
				}
			}
			

		}
	}
	private static class ThreadDemo2 extends Thread{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			synchronized (Lock2) {
				System.out.println("Thread2: holding lock2...");
				try {
					Thread.sleep(100);
				}catch (InterruptedException e) {
					
				}
				System.out.println("Thread2: waiting for lock1...");
				synchronized (Lock1) {
					System.out.println("Thread2: holding lock 1&2...");
				}
			}
		}
	}
	
}
