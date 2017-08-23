package com.oocl.tengkh.sw1;

public class E01_Threading {

	public static void main(String[] args) {
		demoRun mat = new demoRun("Thread 1");
		mat.start();
		mat = new demoRun("Thread 2");
		mat.start();
		
	}

}

class demoRun implements Runnable{
	String threadName;
	
	public demoRun(String threadName) {
		this.threadName = threadName;
	}
		
	public void start() {
		Thread t = new Thread(this);
		t.start(); 
		System.out.println("Start " + threadName);
	}



	@Override
	public void run() {
		System.out.println("Run " + threadName);
		for(int i = 4; i>=0 ; --i) {
			System.out.println("\n" + threadName + " running in " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\n-----Threading "+threadName + " is completed-----");
		
		
	}
	
}