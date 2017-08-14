package com.oocl.tengkh.hw7;

public class ConsumerProducerGood {
	public static void main (String [] args) {
	    Buffer buf = new Buffer();
	    
	    Thread producer = new Producer(10, buf);
	    Thread consumer = new Consumer(10, buf);
	    
	    producer.start();
	    consumer.start();
	    
	 
	  }
	 
	} 


