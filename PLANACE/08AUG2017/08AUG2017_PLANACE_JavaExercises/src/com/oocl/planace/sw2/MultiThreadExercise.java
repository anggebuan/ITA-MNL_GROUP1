package com.oocl.planace.sw2;

class RunnableImpl implements Runnable {
	private Thread thread = null;
	private String threadName = "";

	public RunnableImpl(String string) {
		// TODO Auto-generated constructor stub
		this.threadName = string;
	}

	public void run() {
		// TODO Auto-generated method stub
		try {
			for (int x = 0; x <= 5; x++) {
				System.out.println("Running " + thread.getName() + " " + x);
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			System.out.println("Thread has been interrupted");
		}
		System.out.println(thread.getName() + " " + "is closing");
	}
	
	public void start() {
		if(thread == null) {
			thread = new Thread(this,threadName);
			thread.start();
			System.out.println(thread.getName() + " is starting");
		}
		else
			System.out.println(thread.getName() + " has been started");
	}
}

public class MultiThreadExercise {
	public static void main(String[] args) {
		RunnableImpl runnable1 = new RunnableImpl("Thread 1");
		runnable1.start();
		
		RunnableImpl runnable2 = new RunnableImpl("Thread 2");
		runnable2.start();
	}
}
