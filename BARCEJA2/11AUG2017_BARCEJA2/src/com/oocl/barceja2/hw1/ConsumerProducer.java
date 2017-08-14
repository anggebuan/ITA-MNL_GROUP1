package com.oocl.barceja2.hw1;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class ConsumerProducer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product prod = new Product(30);
		
		Consumer consume = new Consumer(prod);
		Producer produced = new Producer(prod);
		produced.start();
		consume.start();
	}

}

class Product {
	int products = 0;
	public int getProducts() {
		return products;
	}
	public void setProducts(int products) {
		this.products = products;
	}
	Product(int a){
		this.products=a;
	}
	
}

class Consumer extends Thread{
	Product prod;
	public Consumer(Product pr) {
		// TODO Auto-generated constructor stub
		this.prod =pr;
	}

	public void run() {
		for (int x = 0; x <= 10; x++) {
			synchronized (prod) {
				if (prod.products <= 0) {
					try {
						System.out.println("Products out of stock");
						prod.wait();
						notify();
						
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					prod.products -= 10;
					System.out.println("Consume new products");
				}
			}
		}
	}

}

class Producer extends Thread{
	Product prod;
	public Producer(Product pr) {
		// TODO Auto-generated constructor stub
		this.prod =pr;
	}

	public void run() {
		for(int x = 0; x<=10; x++) {
			synchronized(prod) {
				if(prod.products >= 50) {
						try {
							System.out.println("Stock is full Stop production.");
							System.out.println(prod.products);
							notify();
							prod.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				}else {
					prod.products+=4;
					System.out.println("4 product ADDED Replenish products");		
					}	
				}
			}	
		}
	}
