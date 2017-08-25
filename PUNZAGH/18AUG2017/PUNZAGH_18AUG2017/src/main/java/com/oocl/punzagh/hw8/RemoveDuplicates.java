package com.oocl.punzagh.hw8;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<String>();
		list.add("Programmer");
		list.add("Hitman");
		list.add("你好");
		list.add("你好");
		list.add("Gamer");
		list.add("Hitman");
		System.out.println("---With Duplicates---");
		for(String str : list) {
			System.out.println(str);
		}
		System.out.println("----------------------");
		System.out.println("---Without Duplicates---");
		list = (ArrayList<String>) list.stream().distinct().collect(Collectors.toList());
		for(String str : list) {
			System.out.println(str);
		}
		System.out.println("----------------------");
	}
}
