package com.oocl.punzagh.hw2;

import java.util.ArrayList;
import java.util.UUID;

public class ProducerConsumer {

	public static void main(String[] args) {
		ProduceAndConsume PaC = new ProduceAndConsume();
		item items = new item();
		new Producer(PaC,items);
	    new Consumer(PaC,items);
	 
	}

}

class Producer implements Runnable{
	ProduceAndConsume produce;
	item items;
	public Producer(ProduceAndConsume produce,item items) {
		this.produce = produce;
		this.items = items;
		System.out.println("Creating Producer Thread" );
		new Thread(this,"Producer").start();
	}

	public void run() {
		for(int i = 0;i<100;i++) {
			produce.Producer(items);
		}
	}
	
}
class Consumer implements Runnable{
	ProduceAndConsume consume;
	item items;
	private String threadName;
	
	
	public Consumer(ProduceAndConsume consume,item items) {
		this.consume = consume;
		this.items = items;
		System.out.println("Creating Consumer Thread ");
		new Thread(this,"Consumer").start();
	}


	public void run() {
		
		for(int i = 0;i<100;i++) {
			consume.Consumer(items);
		}
	}
	
}

class ProduceAndConsume {
	
	public synchronized void Producer(item items){
		try {
			String str =UUID.randomUUID().toString();
			if(!items.checkIfFull()) {
				items.addItem(str);
				notify();
			}else {
				wait();
			}
			
		}catch(InterruptedException e) {
			
		}
	}
	
	public synchronized void Consumer(item items){
		try {
			
			if(items.checkIfEmpty()) {
				wait();
			}else {
				items.removeItem();
				notify();
			}
		}catch(InterruptedException e) {
			
		}
	}
	
}

class item{
	
	ArrayList<String> list = new ArrayList<String>();
	int maxsize = 3;
	public ArrayList<String> getList() {
		return list;
	}
	public void setList(ArrayList<String> list) {
		this.list = list;
	}
	public int getMaxsize() {
		return maxsize;
	}
	
	public void addItem(String str) {
		if(this.getList().size()<this.getMaxsize()) {
			getList().add(str);
			System.out.println("Producer produced " + str);
		}
	}
	public void removeItem() {
			int rand = (int) Math.floor(Math.random() * getList().size());
			System.out.println("Consumer consumed "+ this.getList().get(rand));
			getList().remove(rand);
	}
	
	public boolean checkIfFull() {
		return getList().size()==getMaxsize();
	}
	public boolean checkIfEmpty() {
		return getList().size()==0;
	}
	
}
