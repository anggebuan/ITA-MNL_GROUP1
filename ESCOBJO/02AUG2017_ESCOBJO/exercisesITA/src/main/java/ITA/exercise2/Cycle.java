package ITA.exercise2;

import ITA.exercise2.Bicycle;
import ITA.exercise2.Cycle;
import ITA.exercise2.Tricycle;
import ITA.exercise2.Unicycle;

/**
 * Hello world!
 *
 */
public class Cycle {


	
	public static void main(String[] args) {
		//System.out.println("\nReady for a ride \n");
		
		
		Cycle uni = new Unicycle();
		Cycle bi = new Bicycle();
		Cycle tri = new Tricycle();	
	
		Cycle arr[] = new Cycle[3];
		arr[0] = uni;
		arr[1] = bi;
		arr[2] = tri;
	
		for(int i = 0; i<=2; i++) {
			//arr[i].balance();
		}
		
		((Unicycle) arr[0]).balance();
			((Bicycle) arr[1]).balance();
		
		System.out.println("\n");
		

	}

	public void ride() {

		System.out.println("\nReady for a ride \n");

	}
}
