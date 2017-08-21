package com.oocl.barceja2.hw1;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.concurrent.TimeUnit;

public class assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
	}
	
	private static void test1() {
	    final Object lock1 = new Object();
	    final Object lock2 = new Object();
	 
	    Thread thread1 = new Thread(new Runnable() {
	        @Override public void run() {
	            synchronized (lock1) {
	                System.out.println("Thread1 acquired lock1");
	                try {
	                    TimeUnit.MILLISECONDS.sleep(50);
	                } catch (InterruptedException ignore) {}
	                synchronized (lock2) {
	                    System.out.println("Thread1 acquired lock2");
	                }
	            }
	        }
	 
	    });
	    thread1.start();
	 
	    Thread thread2 = new Thread(new Runnable() {
	        @Override public void run() {
	            synchronized (lock2) {
	                System.out.println("Thread2 acquired lock2");
	                try {
	                    TimeUnit.MILLISECONDS.sleep(50);
	                } catch (InterruptedException ignore) {}
	                synchronized (lock1) {
	                    System.out.println("Thread2 acquired lock1");
	                }
	            }
	        }
	    });
	    thread2.start();
	 
	    // Wait a little for threads to deadlock.
	    try {
	        TimeUnit.MILLISECONDS.sleep(100);
	    } catch (InterruptedException ignore) {}
	    detectDeadlock();
	}
	
	private static void detectDeadlock() {
	    ThreadMXBean threadBean = ManagementFactory.getThreadMXBean();
	    long[] threadIds = threadBean.findMonitorDeadlockedThreads();
	    int deadlockedThreads = threadIds != null? threadIds.length : 0;
	    System.out.println("Number of deadlocked threads: " + deadlockedThreads);
	}
}
