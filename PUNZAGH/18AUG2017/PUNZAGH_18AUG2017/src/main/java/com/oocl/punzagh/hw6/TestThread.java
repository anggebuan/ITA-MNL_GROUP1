package com.oocl.punzagh.hw6;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class TestThread {
	   public static Object Lock1 = new Object();
	   public static Object Lock2 = new Object();
	   
	   public static void main(String args[]) {
	      ThreadDemo1 T1 = new ThreadDemo1();
	      ThreadDemo2 T2 = new ThreadDemo2();
	      T1.start();
	      T2.start();
	      
	        ThreadMXBean bean = ManagementFactory.getThreadMXBean();
	        try
	        {
	            Thread.sleep(1000);
	        }
	        catch (InterruptedException e)
	        {
	            e.printStackTrace();
	        }
	        long ids[] = bean.findMonitorDeadlockedThreads();
	 
	        if(ids != null)
	        {
	            ThreadInfo threadInfo[] = bean.getThreadInfo(ids);
	 
	            for (ThreadInfo threadInfo1 : threadInfo)
	            {
	                System.out.println("Thread ID: " + threadInfo1.getThreadId());    //Prints the ID of deadlocked thread
	 
	                System.out.println("Thread Name: " +threadInfo1.getThreadName());  //Prints the name of deadlocked thread
	 
	                System.out.println("Thread LockName: " +threadInfo1.getLockName().toString());    //Prints the string representation of an object for which thread has entered into deadlock.
	 
	                System.out.println("Thread OwnerID: " +threadInfo1.getLockOwnerId());  //Prints the ID of thread which currently owns the object lock
	 
	                System.out.println("Thread OwnerName: " +threadInfo1.getLockOwnerName());  //Prints name of the thread which currently owns the object lock.
	            }
	        }
	        else
	        {
	            System.out.println("No Deadlocked Threads");
	        }
	   }
	   
	   private static class ThreadDemo1 extends Thread {
	      public void run() {
	         synchronized (Lock1) {
	            System.out.println("Thread 1: Holding lock 1...");
	            
	            try { Thread.sleep(10); }
	            catch (InterruptedException e) {}
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
	            
	            try { Thread.sleep(10); }
	            catch (InterruptedException e) {}
	            System.out.println("Thread 2: Waiting for lock 1...");
	            
	            synchronized (Lock1) {
	               System.out.println("Thread 2: Holding lock 1 & 2...");
	            }
	         }
	      }
	   } 
	}