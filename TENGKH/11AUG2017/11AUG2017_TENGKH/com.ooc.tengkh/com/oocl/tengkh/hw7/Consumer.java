package com.oocl.tengkh.hw7;

public class Consumer extends Thread {
	private int n;
  	private Buffer consumerBuffer;
  	
  	public Consumer (int m, Buffer buffer) {
  		n = m;
  		consumerBuffer = buffer;
    }
    
    public void run() {
    	int value;
    	for (int i = 0; i < n; i++) {
    		try {
    			value = consumerBuffer.get();
    		}  catch (InterruptedException e) {return;}
    		try {
    			Thread.sleep(300);
    		} catch (InterruptedException e) {return;}
    		
    	}
    }
  }