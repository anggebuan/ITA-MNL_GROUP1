package com.oocl.punzagh.hw1;

public class TowerOfHanoi {

	 public static void main(String[] args) {
	      int nDisks = 10;
	      shiftTowers(nDisks, 'A', 'B', 'C');
	   }
	   public static void shiftTowers(int topN, char from, char inter, char to) {
	      if (topN == 1) {
	         System.out.println("Disk 1 from " + from + " to " + to);
	      } else {
	    	  shiftTowers(topN - 1, from, to, inter);
	         System.out.println("Disk " + topN + " from " + from + " to " + to);
	         shiftTowers(topN - 1, inter, from, to);
	      }
	   }

}
