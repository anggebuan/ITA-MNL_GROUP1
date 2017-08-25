package oocl.com.ITA;

public class ThreadChat {
	public static void main(String[] args) {
		Messaging m = new Messaging();
		new Person1(m);
		new Person2(m);
	}
}

class Messaging{
	String name;
	boolean flag = true;
	public void name(String name) {this.name = name;}
	
	public synchronized void Reply(String msg) {
		if(!flag)
		{
			try {
				notify();
				
				flag = !flag;
				Thread.sleep(1000);
				System.out.println(name+ ": " +msg);
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		}
	public synchronized void Message(String msg) {
		if(flag)
		{
			try {
				notify();
				
				flag = !flag;
				System.out.println(name+ ": " +msg);
				Thread.sleep(1000);
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	
	}
	
	public void setname(String name) {
		this.name = name;
	}
}
class Person1 implements Runnable{
	Messaging Mobj;
	String[] p1 =  {"Wazzap", "im fine man too, any news?", "wazzza"};
	Person1(Messaging m){
		Mobj = m;
		new Thread (this, "Message").start();

	
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < p1.length; i++) {
			Mobj.setname("Pedro");
			Mobj.Message(p1[i]);
		
	}
	
}
}
class Person2 implements Runnable{
	Messaging Mobj;
	String[] p2 = {"Yow im Good man how bout you", "not much dude", "Yow "};
	Person2(Messaging m){
		Mobj = m;
		new Thread (this, "Reply").start();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < p2.length; i++) {
			Mobj.setname("Juan");
			Mobj.Reply(p2[i]);
		}
		
	}
}
