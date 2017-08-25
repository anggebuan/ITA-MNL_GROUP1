package com.oocl.planace.sw3;

class Thread1 implements Runnable {
	String[] questions = { "Hello", "How are you", "Nice to meet you." };
	Chat chat;
	Thread t1;

	public Thread1(Chat chat2) {
		this.chat = chat2;
		t1 = new Thread(this);
		t1.start();
	}

	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < questions.length; i++) {
			chat.askQuestion(questions[i], t1.getName());
		}
	}
}

class Thread2 implements Runnable {
	String[] answers = { "Hi", "I'm fine", "Nice to meet you too" };
	Chat chat;
	Thread t2;

	public Thread2(Chat chat2) {
		this.chat = chat2;
		t2 = new Thread(this);
		t2.start();
	}

	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < answers.length; i++) {
			chat.getAnswer(answers[i], t2.getName());
		}
	}
}

class Chat {
	boolean flag = true;

	// implement
	public void invertFlag() {
		flag = !flag;
	}

	public boolean getFlag() {
		return flag;
	}
	// end to implement

	public synchronized void askQuestion(String msg, String name) {
		if (flag) {
			try {
				System.out.println(name + ": " + msg);
				flag = !flag;
				Thread.sleep(1000);
				notify();
				wait();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	public synchronized void getAnswer(String msg, String name) {
		if (!flag) {
			try {
				System.out.println(name + ": " + msg);
				flag = !flag;
				Thread.sleep(1000);
				notify();
				wait();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

public class MultiThreadChat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chat chat = new Chat();
		Thread1 t1 = new Thread1(chat);
		Thread2 t2 = new Thread2(chat);
	}

}
