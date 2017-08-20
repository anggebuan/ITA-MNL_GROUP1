package com.oocl.planace.hw5;

public class HomeWork5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "asd 中中中 asda";
		System.out.println(input);
		String output = input.replaceAll("[^\\x00-\\x7F]", "");
		output = output.replaceAll(" ", "");
		System.out.println(output);
	}
}
