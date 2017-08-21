package com.oocl.planace.sw1;

import java.io.*;
import java.util.Arrays;

public class InputTextSort {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File input = new File("D:\\CENON\\exercise\\input\\input.txt");
		File output = new File("D:\\CENON\\exercise\\output\\out.txt");

		// read input
		FileReader reader = new FileReader(input);
		StringBuilder inputBuffer = new StringBuilder();
		char[] inputArray = new char[255];
		reader.read(inputArray);
		for (char c : inputArray) {
			if (!String.valueOf(c).isEmpty())
				inputBuffer.append(c);
		}
		String inputTxt = inputBuffer.toString();
		System.out.println("Input: \n" + inputTxt + "\n");
		reader.close();

		// write output
		String[] stringArray = inputTxt.split("\r\n");
		Arrays.sort(stringArray);
		output.createNewFile();
		FileWriter writer = new FileWriter(output);
		for (String s : stringArray) {
			writer.write(s + "\r\n");
		}
		writer.flush();
		writer.close();

		// read input
		reader = new FileReader(output);
		inputBuffer = new StringBuilder();
		inputArray = new char[255];
		reader.read(inputArray);
		for (char c : inputArray) {
			if (!String.valueOf(c).isEmpty())
				inputBuffer.append(c);
		}
		inputTxt = inputBuffer.toString();
		System.out.println("Output: \n" + inputTxt);
		reader.close();
	}
}
