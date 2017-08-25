package com.oocl.planace.sw1;

public class ExceptionHandlingExerciseWithFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] integerArrays = new int[10];
		String[] convertStrings = { "1", "2", "a", "4" };
		for (int x = 0; x < convertStrings.length; x++) {
			try {
				System.out.println("doing");
				integerArrays[x] = Integer.parseInt(convertStrings[x]);
				System.out.println("Success convert string " + convertStrings[x] + " to int");
			} catch (Exception e) {
				System.out.println("Cannot convert string " + convertStrings[x] + " to int");
			} finally {
				System.out.println("done");
			}
		}
	}
}