package com.oocl.escobjo.hw;

import java.util.LinkedList;
import java.util.concurrent.Semaphore;

public class ThreadConsumerProducer {

	static Object LOCK = new Object();

	static LinkedList<Integer> list = new LinkedList<Integer>();
	static Semaphore sem = new Semaphore(0);
	static Semaphore mutex = new Semaphore(1);

	static class Consumer extends Thread {
		String msg;

		public Consumer(String msg) {
			this.msg = msg;
		}

		public void run() {
			try {

				while (true) {
					sem.acquire(1);
					mutex.acquire();
					System.out.println("Consumer \"" + msg + "\" receive: " + list.removeFirst());
					mutex.release();
				}
			} catch (Exception x) {
				x.printStackTrace();
			}
		}
	}

	static class Producer extends Thread {
		public void run() {
			try {

				int n = 0;

				while (true) {
					mutex.acquire();
					list.add(new Integer(n));
					System.out.println("Producer " + n+ " send: " + n++);
					mutex.release();
					sem.release(1);
					Thread.sleep(500);
				}
			} catch (Exception x) {
				x.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Producer().start();
		new Consumer("A").start();
		new Consumer("B").start();
	}
}
