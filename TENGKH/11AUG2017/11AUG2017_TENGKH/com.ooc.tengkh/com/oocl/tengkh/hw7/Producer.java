package com.oocl.tengkh.hw7;

public class Producer extends Thread{
	private int n;
  	private Buffer bufferprod;
  	
  	public Producer (int m, Buffer buffer) {
  		n = m;
  		bufferprod = buffer;
    }
    
    public void run() {
    	for (int i = 0; i < n; i++) {
    		try {
    			Thread.sleep(300);
    		} catch (InterruptedException e) {return;}
    		
    	    try {
    	    	bufferprod.put(i + 1);
    	    } catch (InterruptedException e) {return;}
    		
    	}
    }
  }
