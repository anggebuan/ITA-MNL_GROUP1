package ITA.exercise4;

/**
 * Hello world!
 *
 */
public class Fibonacci {

	public static void main(String[] args) {
		
		System.out.println("********** FIBONACCI **********");

		int x = 0;
		int y = 1;
		int sum = 0;
		
		System.out.println(x);
		System.out.println(y);
		for (int i = 0; i < 98; i++) {
			sum = x + y;

			System.out.println(sum);
			x = y;
			y = sum;
			
	
		}
	}

}
