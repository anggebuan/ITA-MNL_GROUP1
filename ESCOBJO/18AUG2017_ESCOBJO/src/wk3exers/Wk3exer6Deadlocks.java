package wk3exers;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

public class Wk3exer6Deadlocks {
// https://meteatamel.wordpress.com/2012/03/21/deadlock-detection-in-java/
	
	Wk3exer6Deadlocks d = new Wk3exer6Deadlocks();
	public static Object Lock1 = new Object();
	public static Object Lock2 = new Object();
	
	
	public static void main(String[] args) {

		 Thread1 t1 = new Thread1();
		 Thread2 t2 = new Thread2();	
		t1.start();
		t2.start();
		
		
		ThreadMXBean bean = ManagementFactory.getThreadMXBean();
		long ids[] = bean.findMonitorDeadlockedThreads();

		if (ids != null) {
			System.out.println("\nFound deadlock(s).");
		} else {
			System.out.println("No Deadlocks found.");
		}
		
		detectDeadlock();
	}


	
	private static class Thread1 extends Thread{
	
		public void run() {
		//	synchronized(Lock2) {
			synchronized(Lock1) {
				System.out.println("Thread 1: Holding lock 1...");
				
				
				try
				{
					Thread.sleep(0);
				}
				catch(InterruptedException e) {
					detectDeadlock();
				}
				System.out.println("Thread 1: Waiting for lock 2..");
				
				synchronized(Lock2) {
					System.out.println("Thread 1: Holding lock 1 & 2...");
			//	}
				
			}}
		}
		
	}

	
	private static class Thread2 extends Thread{
		
		public void run() {
			synchronized(Lock2) {
				System.out.println("Thread 2: Holding lock 2...");
				
				
				try
				{
					Thread.sleep(0);
				}
				catch(InterruptedException e) {
					detectDeadlock();
				}
				System.out.println("Thread 2: Waiting for lock 1..");
				
				synchronized(Lock1) {
					System.out.println("Thread 2: Holding lock 1 & 2...");
				}
			
			
		
		}
			
		  }
		
	 
//	    new Thread(a2).start();
		

	}
	
	private static void detectDeadlock() {
	    ThreadMXBean threadBean = ManagementFactory.getThreadMXBean();
	    long[] threadIds = threadBean.findDeadlockedThreads();
	    int deadlockedThreads = threadIds != null? threadIds.length : 0;
	    System.out.println("Number of deadlock(s): " + deadlockedThreads);
	}
}