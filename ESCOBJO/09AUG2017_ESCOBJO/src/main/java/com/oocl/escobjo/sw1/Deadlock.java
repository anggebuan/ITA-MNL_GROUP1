package com.oocl.escobjo.sw1;

public class Deadlock {
	
	Deadlock d = new Deadlock();
	public static Object Lock1 = new Object();
	public static Object Lock2 = new Object();
	
	public static void main(String[] args) {
		
		ThreadDemo1 t1 = new ThreadDemo1();
		ThreadDemo2 t2 = new ThreadDemo2();	
		t1.start();
		t2.start();
		
	}
	
	private static class ThreadDemo1 extends Thread{
	
		public void run() {
			synchronized(Lock2) {
			synchronized(Lock1) {
				System.out.println("Thread 1: Holding lock 1...");
				
				
				try
				{
					Thread.sleep(100);
				}
				catch(InterruptedException e) {
					
				}
				System.out.println("Thread 1: Waiting for lock 2..");
				
				synchronized(Lock2) {
					System.out.println("Thread 1: Holding lock 1 & 2...");
				}
			}}
		}
		
	}
	private static class ThreadDemo2 extends Thread{
		
		public void run() {
			synchronized(Lock2) {
				System.out.println("Thread 2: Holding lock 2...");
				
				
				try
				{
					Thread.sleep(100);
				}
				catch(InterruptedException e) {
					
				}
				System.out.println("Thread 2: Waiting for lock 1..");
				
				synchronized(Lock1) {
					System.out.println("Thread 2: Holding lock 1 & 2...");
				}
			
			
		
		}
		  }
		
//	  new Thread(a1).start();
//	    new Thread(a2).start();
  

	}
}
