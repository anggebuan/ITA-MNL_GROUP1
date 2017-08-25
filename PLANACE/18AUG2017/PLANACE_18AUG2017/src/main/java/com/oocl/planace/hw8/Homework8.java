package com.oocl.planace.hw8;

import java.util.ArrayList;
import java.util.HashSet;

public class Homework8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayListWithDups = new ArrayList<String>();

		arrayListWithDups.add("nonie");
		arrayListWithDups.add("test");
		arrayListWithDups.add("中中中");
		arrayListWithDups.add("test");
		arrayListWithDups.add("nonie");
		arrayListWithDups.add(null);
		arrayListWithDups.add("中中中");
		arrayListWithDups.add("homework");
		arrayListWithDups.add(null);

		// Printing listWithDuplicateElements
		System.out.print("Input:");
		System.out.println(arrayListWithDups);

		// Constructing HashSet using listWithDuplicateElements
		HashSet<String> removeDups = new HashSet<String>(arrayListWithDups);

		// Constructing listWithoutDuplicateElements using set
		ArrayList<String> arrayListNoDups = new ArrayList<String>(removeDups);

		// Printing listWithoutDuplicateElements
		System.out.print("Ouput: ");
		System.out.println(arrayListNoDups);
	}

}
