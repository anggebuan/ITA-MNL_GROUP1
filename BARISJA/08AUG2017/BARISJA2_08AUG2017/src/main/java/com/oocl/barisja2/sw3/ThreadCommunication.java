package com.oocl.barisja2.sw3;

public class ThreadCommunication {
	Chat m = new Chat();
	public void run() {

		new T1(m);
		new T2(m);
	}
	
	public String getOutput() {
		return m.getOutput();
	}
	
	
}

class Chat{
	boolean flag = true;
	String output = "";
	
	
//	public synchronized void Question (String msg) {
////		if (flag) {
//			try {
//				System.out.println("YU: " +msg);
////				flag = !flag;
//				Thread.sleep(1000);
//				notify();
//				wait();
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
////		}
//	}
	
	public String getOutput() {
		return output;
	}


	public synchronized void Answer (String msg) {
		if (!flag) {
			try {
//				System.out.println("CARTER: " +msg);
				output += "CARTER: " +msg + "\r\n";
				flag = !flag;
			
				notify();
				wait();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (flag) {
			try {
//				System.out.println("YU: " +msg);
				output += "CARTER: " +msg;
				flag = !flag;
				
				notify();
				wait();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

class T1 implements Runnable{
	Chat m;
	String [] s1 = {"May I help you?", "Yu.", "Yes, I am Yu.", " I have told you Yu", "No, Yu is blind.","That is what I just said.","I did not say what, I said Yu!","And Yu is answering!"};
	
	public T1(Chat m1) {
		this.m = m1;
		new Thread (this, "Question").start();
	}
	
	public void run() {
		for (int i = 0; i < s1.length; i++) {
			m.Answer(s1[i]);
		}
		
	}
	
	
}

class T2 implements Runnable{
	Chat m;
	String [] s2 = {"We'll be asking the questions, old man. Who are you?", "No, not me, you.", "Just answer the damn questions, who are you?","Are you deaf?","I'm not blind, you blind.", "You just said what?","That's what I'm askin' you!"};
	
	public T2(Chat m2) {
		this.m = m2;
		new Thread (this, "Answer").start();
	}
	
	
	public void run() {
		for (int i = 0; i < s2.length; i++) {
			m.Answer(s2[i]);
		}
	}
	
}