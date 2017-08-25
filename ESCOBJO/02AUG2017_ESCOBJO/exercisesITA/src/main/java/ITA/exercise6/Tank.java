package ITA.exercise6;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Tank {
	// static boolean filledTank = true;

	public static void main(String[] args) {

		Tank t = new Tank();

		System.out.println("\nTANK \n");

		String choice = "e";
		String prevchoice;
		boolean filledTank = false;

		System.out.println("Choose an action: \n");
		System.out.println("F - Fill ");
		System.out.println("E - Empty ");
		System.out.println("C - Clean \n");

		while (!choice.equalsIgnoreCase("c")) {

			System.out.print("\nEnter your choice: ");
			prevchoice = choice;
			choice = new Scanner(System.in).nextLine();

			try {

				// System.out.println("prevchoice: " + choice + "\n");

				if (choice.equalsIgnoreCase("f")) {
					filledTank = t.filled();
				} else if (choice.equalsIgnoreCase("e")) {
					filledTank = t.emptied();
				} else if (choice.equalsIgnoreCase("c")) {
					t.finalized(prevchoice, filledTank);
				} else {
					System.out.println("\nWrong choice");
					System.out.println("\n------------------------------.");
				}
				
				//System.out.println("filledTank: " + filledTank);

			} catch (Exception e) {
				e.getMessage();
			}
		}

	}

	public boolean filled() {

		System.out.println("\nTank is now filled with water.");
		System.out.println("\n------------------------------");
		return true;
	}

	public boolean emptied() {

		System.out.println("\nTank is now empty.");
		System.out.println("\n------------------------------");
		return false;
	}

	public void finalized(String pC, boolean filledTank) {

		if (pC.equalsIgnoreCase("f") && filledTank == true) {
			System.out.println("\nTank must be empty in order to clean it.");
			System.out.println("\n------------------------------");
		}

		else if (pC.equalsIgnoreCase("e") && filledTank == false) {
			System.out.println("\nTank is now cleaned.");
			System.out.println("\n------------------------------");
		}

	}
}
