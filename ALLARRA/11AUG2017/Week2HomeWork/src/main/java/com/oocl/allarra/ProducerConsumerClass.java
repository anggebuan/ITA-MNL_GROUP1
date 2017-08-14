package com.oocl.allarra;

public class ProducerConsumerClass {
	public static void main(String[] args) {
		common c = new common();
		Producer p1 = new Producer(c,1);
		Consumer c1 = new Consumer(c,1);
		p1.start();
		c1.start();
	}

}
class common{
	
	boolean available = false;
	int content;
	public synchronized int Consume() {
		while(available==false)
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		available=false;
		notifyAll();
		return content;
	}
	
	public synchronized void Produce(int i) {
		while(available ==true)
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		available = true;
		content = i;
		notifyAll();
	}
}
class Producer extends Thread{
	common c;
	int num;

	public Producer(common c, int num) {
		this.c = c;
		this.num = num;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int x=0; x<10;x++) {
			c.Produce(x+1);
			System.out.println("Producer put" + (x+1));
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	}
}
class Consumer extends Thread{
	common c;
	int num;

	public Consumer(common c, int num) {
		this.c = c;
		this.num = num;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int x=0; x<10;x++) {
			try {
				sleep(90);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int val = c.Consume();
			System.out.println("Consumer got" + val);
		}
	}
}