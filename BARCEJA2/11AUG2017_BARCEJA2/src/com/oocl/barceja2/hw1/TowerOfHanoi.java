package com.oocl.barceja2.hw1;

import java.util.Scanner;

public class TowerOfHanoi {

	public static void main(String[] args) {
		System.out.println("Input no. of Plates: ");
		Scanner scan = new Scanner(System.in);
		 int nDisks = scan.nextInt();
	      doTowers(nDisks, "Pole A", "Pole B", "Pole C");
	   }
	   public static void doTowers(int topN, String from, String inter, String to) {
	      if (topN == 1) {
	         System.out.println("Plate 1 from " + from + " to " + to);
	      } else {
	         doTowers(topN - 1, from, to, inter);
	         System.out.println("Plate " + topN + " from " + from + " to " + to);
	         doTowers(topN - 1, inter, from, to);
	      }
	   }

}
