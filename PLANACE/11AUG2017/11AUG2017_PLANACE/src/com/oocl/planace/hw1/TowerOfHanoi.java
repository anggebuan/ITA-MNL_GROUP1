package com.oocl.planace.hw1;

import java.util.Scanner;

public class TowerOfHanoi {

	public static void towerOfHanoi(int top, char from, char mid, char to) {
		if (top == 1) {
			System.out.println("Disk 1 from " + from + " to " + to);
		} else {
			towerOfHanoi(top - 1, from, to, mid);
			System.out.println("Disk " + top + " from " + from + " to " + to);
			towerOfHanoi(top - 1, mid, from, to);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input number of disks: ");
		Scanner scan = new Scanner(System.in);
		int numDisks = scan.nextInt();
		towerOfHanoi(numDisks, 'A', 'B', 'C');
	}

}
