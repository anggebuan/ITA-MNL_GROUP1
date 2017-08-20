package com.oocl.allarra.HW8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayListManipulator {
	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("test");
		myList.add("test");
		myList.add("2");
		myList.add("2");
		myList.add("test");
		myList.add("x");
		myList.add("x");
		myList.add("y");
		myList.add("x");
		myList.add("test");
		myList.add("y");
		myList.add("2");
		
		ArrayListManipulator alm = new ArrayListManipulator();
		myList = alm.RemoveDuplicate(myList);
//		Set<String> st =new HashSet<>();
//		st.addAll(myList);
//		myList.clear();
//		myList.addAll(st);
//	
		for(String s : myList) {
			System.out.println(s);
		}
	}
	public ArrayList<String> RemoveDuplicate(ArrayList<String> s) {
		for(int x=0; x<s.size();x++) {
			for(int z=x+1; z<s.size();z++) {
				if(s.get(x)==s.get(z)) {
					s.remove(z);
				}
			}
		}
		return s;
	}
}