package com.ITA.exerciseWk2;



public class simpleChatclient extends Thread {

	public static void main(String[] args) {
		//Scanner input = new Scanner(System.in);
		Chats c = new Chats();
//		Thread t = new Thread();
//		t.start();
		// Man1 m1 = new Man1(c);
		// Man2 m2 = new Man2(c);
		new Man1(c);
		new Man2(c);
	}

}

class Man1 implements Runnable {
	Chats m;
	String[] msg = { "Hi kid ! ^_^", "How are you ?" };

	public Man1(Chats c) {
		this.m = c;
		new Thread(this, "Ask").start();
	}

	public void run() {
		for (int i = 0; i < msg.length; i++) {
			m.Ask(msg[i]);
		}

	}
}

class Man2 implements Runnable {
	Chats m;
	String[] msg = { "Hello ! ^_^", "Im not fine :( huhu .... " };

	public Man2(Chats c) {
		this.m = c;
		new Thread(this, "Ans").start();
	}

	public void run() {
		for (int i = 0; i < msg.length; i++) {
			m.Ans(msg[i]);
		}

	}

}

class Chats {
	boolean send = true;

	public synchronized void Ask(String msg) {

		if (send) {
			try {
				System.out.println(msg);
				send = false;
				Thread.sleep(100);
				notify();
				wait();
			} catch (Exception e) {
				 e.printStackTrace();
				//System.out.println("Exception: ");
			
			}
		}
	}

	public synchronized void Ans(String msg) {
		if (!send) {
			try {
				System.out.println(msg);
				send = true;
				Thread.sleep(100);
				wait();
				notify();
				
			} catch (Exception e) {
				 e.printStackTrace();
				//System.out.println("Exception: ");
			}
		}

	}

}
