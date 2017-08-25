package com.oocl.tengkh.sw2;

//Demonstrate an inter-thread

public class E02_ThreadingChat {
	public static void main(String[] args) {
		classroom weChat = new classroom();

		new T1("Gayle ", weChat);
		new T2("Dash ", weChat);


	}
}


class classroom {
	boolean indicator = false;

	public synchronized void Question(String threadName1, String msg) {
		if (indicator) {
			try {
				wait();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(threadName1 + ": " + msg);
		indicator = true;
		notify();
	}

	public synchronized void Answer(String threadName2, String msg) {
		if (!indicator) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(threadName2 + ": " + msg);
		indicator = false;
		notify();
	}
}

	class T1 implements Runnable {
		classroom m;
		String threadname1;

		String[] student1 = { "Hi", "Are you hungry?", "Yes~, let's lunch together!", "*roll eyes*" };

		public T1(String threadname1, classroom m) {
			this.threadname1 = threadname1;
			this.m = m;
			new Thread(this, "Question").start();
		}

		@Override
		public void run() {
			for (int i = 0; i < student1.length; i++) {
				m.Question(threadname1, student1[i]);
			}

		}

	}

	class T2 implements Runnable {
		classroom m2;
		String threadName2;

		String[] student2 = { "Hey", "Soo hungry! chaar~~ How about you?", "yeeeeey", "HAHAHAHA" };

		public T2(String threadname2, classroom m2) {
			this.m2 = m2;
			this.threadName2 = threadname2;
			new Thread(this, "Answer").start();
		}

		@Override
		public void run() {
			for (int i = 0; i < student2.length; i++) {
				m2.Answer(threadName2, student2[i]);
			}

		}

	}

