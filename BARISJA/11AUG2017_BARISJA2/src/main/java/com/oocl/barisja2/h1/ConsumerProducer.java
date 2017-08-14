package com.oocl.barisja2.h1;

import java.util.Random;

public class ConsumerProducer {

	public static void main(String[] args) {
		
		Demand demand = new Demand();
		new Consumer(demand);
		new Producer(demand);
		
		
	}
	
	
}

class Demand{
	
	private int threshold = 40, product = 0;
	
	
	public void consume(int product)  throws InterruptedException {
		
		if(this.product - product <= 0 ) {
			System.out.println("Consumer wants to consume "+product+". Insufficient products. Please wait for Producer...");
			notify();
			wait();
		} else {
			System.out.println("Consumes " + product + ". ");
			this.product -= product;
			System.out.println("Total: "+ this.product);
			notify();
			wait();
		}
		
	}
	
	public void produce(int product)  throws InterruptedException {
		
		if(this.product + product > this.threshold || this.product == product ) {
			System.out.println("Producer wants to produce "+product+". Product will overflow. Please wait for Consumer...");
			notify();
			wait();
		} else {
			System.out.println("Produces " + product + ". ");
			this.product += product;
			System.out.println("Total: "+ this.product);
			notify();
			wait();
		}
		
	}
	
	
	
}


class Consumer implements Runnable{
	Demand demand;
	public Consumer(Demand demand) {

		this.demand = demand;
		new Thread(this).start();
		
	}
	
	public void run() {
		for(int i = 0; i < 10; i++) {
			int rand = Math.abs(new Random().nextInt() % 20 +1);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			synchronized (demand) {
				try {
					demand.consume(rand);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
		}
	}
	
}

class Producer implements Runnable{
	Demand demand;
	public Producer(Demand demand) {
		this.demand = demand;
		new Thread(this).start();
	}
	
public void run() {
	for(int i = 0; i < 10; i++) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		int rand = Math.abs(new Random().nextInt() % 20 +1);
		synchronized (demand) {
			try {
				demand.produce(rand);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
		
	
	}
	
}