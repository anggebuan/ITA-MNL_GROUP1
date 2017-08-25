package oocl.com.ITA;

public class threadChatting {
	public static void main(String[] args) {
		Chat m = new Chat();
		new T1(m);
		new T2(m);
	}

}

class Chat{
	boolean flag = true;
	String name;
	public synchronized void Question (String msg) {
		if (flag) {
			try {
				System.out.println( name+ " : "+msg);
				flag = !flag;
				Thread.sleep(1000);
				notify();
				wait();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	public synchronized void Answer (String msg) {
		if (!flag) {
			try {
				
				System.out.println( name+ " : "+msg);
				flag = !flag;
				Thread.sleep(1000);
				notify();
				wait();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	public void setname(String name) {
		this.name = name;
	}
} 

class T1 implements Runnable{
	Chat m;
	String [] s1 = {"May I help you?", "Yu.", "Yes, I am Yu.", " I have told you Yu", "No, Yu is blind.","That is what I just said.","I did not say what, I said Yu!","And Yu is answering!"};
	
	public T1(Chat m1) {
		this.m = m1;
		new Thread (this, "Question").start();
	}
	
	@Override
	public void run() {
		for (int i = 0; i < s1.length; i++) {
			m.setname("Pedro");
			m.Question(s1[i]);
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
	
	@Override
	public void run() {
		for (int i = 0; i < s2.length; i++) {
			m.setname("Juan");
			m.Answer(s2[i]);
		}
	}
	
} 

