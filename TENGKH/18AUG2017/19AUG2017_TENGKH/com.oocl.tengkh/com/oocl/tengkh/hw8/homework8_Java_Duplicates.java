package com.oocl.tengkh.hw8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class homework8_Java_Duplicates {

	public static void main(String[] args) {
		List<String> container = new ArrayList<String>();
		container.add("yi");
		container.add("er");
		container.add("san");
		container.add("si");
		container.add("wu");
		container.add("wu");
		container.add("我愛你愛你愛我");
		container.add("我愛你愛你愛我");
		container.add("3");
		container.add("3");
		/*
		 * Scanner scan = new Scanner(System.in); System.out.println("Enter values: ");
		 * while(scan.hasNext()) { container.add(scan.nextLine());
		 * 
		 * } Collections.sort(container);
		 */

		System.out.println("List with duplicates: ");

		for (String array : container) {
			System.out.println(array);
		}

		System.out.println("\nNew List without duplicates: ");
		List<String> listDistinctInts = container.stream().distinct().collect(Collectors.toList());
		for (String array2 : listDistinctInts) {
			System.out.println(array2);
		}

	}

}
