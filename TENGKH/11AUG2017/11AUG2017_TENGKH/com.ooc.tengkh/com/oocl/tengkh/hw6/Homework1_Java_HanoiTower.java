package com.oocl.tengkh.hw6;
import java.util.Scanner;

/*
 * Java Assignment:
 * How to use method for solving Tower of Hanoi problem for n discs?
 * */

public class Homework1_Java_HanoiTower {
	public static void main(String[] args) {
		TowerHanoi game = new TowerHanoi();
		Scanner scan = new Scanner(System.in);
		System.out.println("Puzzle Game: Tower of Hanoi");
		System.out.println("Enter the number of disk: ");
		int numberOfDisk = scan.nextInt();
		char A = 'A', B = 'B', C = 'C';
		game.Simulate(numberOfDisk, A, B, C);
	}

}

class TowerHanoi{
	public void Simulate(int input, char start, char mid, char last) {
		if(input == 1) {
			System.out.println("\nDisk 1: from " + start + " to " + last );
		}else {
			Simulate(input - 1, start, last, mid);
			System.out.println("\nDisk " + input + " from " + start + " to " + last);
			Simulate(input - 1, mid, start, last);
		}
			
	}
}
