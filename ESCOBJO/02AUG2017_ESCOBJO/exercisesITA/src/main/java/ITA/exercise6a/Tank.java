package ITA.exercise6a;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Tank {
	boolean filledTank = false;
	
	public static void main(String[] args) {

		Tank t = new Tank();
		System.out.println("Initial fillness for tank is " + t.filledTank);
		t.fill();
		System.out.println("Filled fillness is " + t.filledTank);
		System.gc(); //A full tank is being marked for garbage collection
		new Tank();
		System.out.println("Tank respawn fillness is still " + t.filledTank);
		t.empty();
		System.out.println("Emptied fillness is " + t.filledTank);
		System.gc(); //An empty tank is being marked for garbage collection, so no message folks

	}

	public void fill(){
		filledTank = true;
	}
	public void empty(){
		filledTank = false;
	}
	protected void finalize() {
		if(filledTank)
		System.out.println("You're throwing away a full tank of nothing!");
		}
}
