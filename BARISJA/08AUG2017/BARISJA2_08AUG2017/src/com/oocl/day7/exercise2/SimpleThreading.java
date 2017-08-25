package com.oocl.day7.exercise2;

public class SimpleThreading {

	public static void main(String[] args) {

		RunnableThread rt1 = new RunnableThread("Thread 1");
		RunnableThread rt2 = new RunnableThread("Thread 2");
		rt1.start();
		rt2.start();
	}

}

class RunnableThread implements Runnable {

	String threadName;

	@Override
	public void run() {

		
		try {

			for (int i = 0; i < 4; i++) {
				System.out.println(threadName + ", " + i);
				Thread.sleep(500);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Ending: " + threadName);
		
	}

	public void start() {
		System.out.println("Starting: " + threadName);
		Thread t = new Thread(this);
		System.out.println(threadName + " " + t.getState());
		t.start();
		System.out.println(threadName + " " + t.getState());

	}

	public RunnableThread(String threadName) {
		System.out.println("Creating: " + threadName);
		this.threadName = threadName;
	}

}
