package com.oocl.planace.hw2;

import java.util.LinkedList;

class Product {
	private int prod = 0;
	private int maxValue;

	public Product(int max) {
		maxValue = max;
	}

	protected synchronized int put() throws InterruptedException {
		prod++;
		wait();
		notify();
		return prod;
	}

	protected synchronized int get() throws InterruptedException {
		notify();
		wait();
		return prod-1;
	}

	protected int getMax() {
		return maxValue;
	}
	
	protected int getValue() {
		return prod;
	}
}

public class ProducerConsumer {
	static int maxValue = 10;
	public static Product product = new Product(maxValue);

	public static void main(String args[]) {
		Producer T1 = new Producer();
		Consumer T2 = new Consumer();
		T1.start();
		T2.start();
	}

	private static class Producer extends Thread {
		public void run() {
			synchronized (product) {
				try {
					while (product.getValue() <= product.getMax()) {
						System.out.println("Producer #1 put: " + product.put());
						Thread.sleep(1000);
					}
				} catch (InterruptedException e) {
				}
			}
		}
	}

	private static class Consumer extends Thread {
		public void run() {
			synchronized (product) {
				try {
					while (product.getValue() <= product.getMax()) {
						System.out.println("Consumer #1 got: " + product.get());
						Thread.sleep(1000);
					}
				} catch (InterruptedException e) {
				}
			}
		}
	}
}
