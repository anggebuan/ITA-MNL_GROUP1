package com.oocl.tengkh.hw7;

public class Buffer {
		private int info;
		private boolean isEmpty = true;
		
		public synchronized void put (int i) throws InterruptedException { 
			while (isEmpty == false) { 	//wait till the buffer becomes empty
				try { wait(); }
				catch (InterruptedException e) {throw e;}
			}
			info = i;
			isEmpty = false;
			System.out.println("Producer inserted -> " + i);
			notify();
		} 
		
		public synchronized int get () throws InterruptedException {
			while (isEmpty == true)  {	
				try { 	wait(); }
				catch (InterruptedException e) {throw e;}
			}
			isEmpty = true;
			notify();
			int val = info;
			System.out.println("Consumer retrieve -> " + val);
			return val;
		}
}