package com.oocl.barisja.hw8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		List <String> list = new ArrayList<String>();
		
		System.out.println("Enter String: ");
		String str = new Scanner(System.in).nextLine();
		//Janiel Janiel matthew janiel bariso matthew springael
		String tmp []= str.split(" ");
		
		
		for (int i = 0; i < tmp.length; i++) {
			list.add(tmp[i]);
		}
		

		Set<String> hs = new HashSet<String>();
		hs.addAll(list);
		list.clear();
		list.addAll(hs);
		str = "";
		for (String string : list) {
			str += string;
		}
		System.out.println(str);
	}
	
}
