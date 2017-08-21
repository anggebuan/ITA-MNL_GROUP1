package com.oocl.tengkh.sw1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class IOExercise1 {
	public static void main(String[] args) throws IOException {
		String content = new String(Files.readAllBytes(Paths.get("C:/Users/tengkh/Desktop/IO_TEST.txt")));
		System.out.println("IO_TEST Contents: \n" + content);

		String filename = "C:/Users/tengkh/Desktop/IO_TEST.txt";
		System.out.println("\nArray fetched:");
		FileReader read = new FileReader(filename);
		BufferedReader bufferRead = new BufferedReader(read);
		String container;

		List<String> words = new ArrayList<String>();
		while ((container = bufferRead.readLine()) != null) {
			words.add(container);
			System.out.println(words);
		}
		bufferRead.close();
		
		Collections.sort(words);
		System.out.println("\nSort: \n" + words);

		FileWriter write = new FileWriter("C:/Users/tengkh/Desktop/IO_OUTPUT.txt");
		BufferedWriter bufferWrite = new BufferedWriter(write);
		for (int i = 0; i < words.size(); i++) {
			bufferWrite.write(words.get(i));
			bufferWrite.newLine();
		}
		
		bufferWrite.close();

	}

}
