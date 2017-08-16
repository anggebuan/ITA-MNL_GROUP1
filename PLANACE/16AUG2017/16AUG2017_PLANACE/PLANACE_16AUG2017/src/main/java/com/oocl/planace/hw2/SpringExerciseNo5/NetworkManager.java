package com.oocl.planace.hw2.SpringExerciseNo5;

public class NetworkManager {
	public void init() {
		System.out.println("Starting HTTP Connection.......");
	}

	public void doThings() {
		for (int x = 1; x <= 5; x++) {
			System.out.println("Doing HTTP things " + x + "...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void destroy() {
		System.out.println("Disconnecting HTTP Connection.......");
	}
}
