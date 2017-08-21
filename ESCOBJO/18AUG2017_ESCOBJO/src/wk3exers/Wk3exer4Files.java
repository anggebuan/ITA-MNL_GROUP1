package wk3exers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Wk3exer4Files {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		int count = 0;
		int countdir = 0;
		File f = new File("C:/Users/Jossel/Documents");
		
		System.out.println("List of Directories:");
		for (File file : f.listFiles()) {
			if (file.isDirectory()) {
				System.out.println("Path: " + file.getAbsolutePath());
				countdir++;
			}

		}
		
		System.out.println("\nList of Files:");
		for (File file : f.listFiles()) {
			if (file.isFile()) {
				System.out.println("File: " + file.getName());
				count++;
			}
		}

		System.out.println("\n-----------------------------------------");
		System.out.println("\nTotal number of directories: " + countdir);
		System.out.println("Total number of file: " + count);

	}
}
