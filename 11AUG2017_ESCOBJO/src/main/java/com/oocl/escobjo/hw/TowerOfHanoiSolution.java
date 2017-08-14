package com.oocl.escobjo.hw;

import java.util.Scanner;

public class TowerOfHanoiSolution {

	int count = 0;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		
		
		TowerOfHanoiSolution tHanoi = new TowerOfHanoiSolution();
		
	System.out.println("\n\t---------- TOWER OF HANOI ----------\n");		
		System.out.print("\tEnter number of discs: ");
		int discs = scanner.nextInt();
		
		System.out.println();
		tHanoi.towerSolution(discs, "A", "B", "C");
		System.out.print("\n\tSequence of moves: "+tHanoi.count);
	}
	
	public int towerSolution(int num, String top, String support, String bottom) {
	
		if (num == 1) {
			System.out.println("\t\t"+top + " -> " + bottom);
			count++;
		} else {
			towerSolution(num - 1, top, bottom, support);
			System.out.println("\t\t" +top + " -> " + bottom);
			towerSolution(num - 1, support, top, bottom);
			count++;
		}
		return count;
	
	}

}
