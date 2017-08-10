package com.oocl.punzagh.sw2;

public class TestThreadChat {
	public static void main(String[] args) {
		Chat chat = new Chat();
		new Genji(chat);
		new Hanzo(chat);
	}

}

class Genji implements Runnable{
	Chat chat;
	String sayings[] = {"Genji: Hanzo, we meet again","Genji: I have survived","Genji: Ryu jin no ken wo kurae!"};
	
	public Genji(Chat chat) {
		this.chat = chat;
		new Thread(this,"Genji").start();
	}
	public void run() {
		for(int i=0;i<sayings.length;i++) {
			chat.Genji(sayings[i]);
		}
	}

	
}
class Hanzo implements Runnable{
	Chat chat;
	String sayings[] = {"Hanzo: Genji! you are alive?!","Hanzo: You are supposed to be dead!","Hanzo: Ryuga waga teki wo kurao!"};
	public Hanzo(Chat chat) {
		this.chat = chat;
		new Thread(this,"Hanzo").start();
	}
	
	public void run() {
		for(int i=0;i<sayings.length;i++) {
			chat.Hanzo(sayings[i]);
			
		}
	}

}

class Chat{
	
	public synchronized void Genji (String says) {
		try {
			System.out.println(says);
			Thread.sleep(3000);
			notify();
			wait();
			
		}catch(Exception e) {
			
		}

	}
	public synchronized void Hanzo (String says) {
		try {
			System.out.println(says);
			Thread.sleep(3000);
			notify();
			wait();
		}catch(Exception e) {
			
		}
		
	}
	
}
