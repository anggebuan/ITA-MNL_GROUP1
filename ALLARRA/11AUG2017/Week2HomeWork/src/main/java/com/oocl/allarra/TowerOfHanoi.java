package com.oocl.allarra;

import java.util.Scanner;

public class TowerOfHanoi {

		   public void solve(int n, String start, String auxiliary, String end) {
		       if (n == 1) {
		           System.out.println("Disc "+n + " from " +start + " -> " + end);
		       } else {
		           solve(n - 1, start, end, auxiliary);
		           System.out.println("Disc " +n +" from "+start + " -> " + end);
		           solve(n - 1, auxiliary, start, end);
		       }
		   }

		   public static void main(String[] args) {
		       TowerOfHanoi towersOfHanoi = new TowerOfHanoi();
		       System.out.print("Enter number of discs: ");
		       Scanner scanner = new Scanner(System.in);
		       int discs = scanner.nextInt();
		       towersOfHanoi.solve(discs, "A", "B", "C");
		       scanner.close();
		   }
}
