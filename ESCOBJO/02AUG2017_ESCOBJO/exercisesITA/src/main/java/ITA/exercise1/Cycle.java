package ITA.exercise1;

import ITA.exercise1.Bicycle;
import ITA.exercise1.Cycle;
import ITA.exercise1.Tricycle;
import ITA.exercise1.Unicycle;

/**
 * Hello world!
 *
 */
public class Cycle {


	
	public static void main(String[] args) {
		System.out.println("\nReady for a ride \n");

		Cycle uni = new Unicycle();
		Cycle bi = new Bicycle();
		Cycle tri = new Tricycle();	
		
		
		uni.ride();
		bi.ride();
		tri.ride();
	}

	public void ride() {

		System.out.println("Ready for a ride \n");
	}
}
