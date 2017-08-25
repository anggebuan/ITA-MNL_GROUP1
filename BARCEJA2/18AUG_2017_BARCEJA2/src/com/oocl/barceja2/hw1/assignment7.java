package com.oocl.barceja2.hw1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class assignment7 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Input File Name of Text file:");
		Scanner scan = new Scanner(System.in);
		String fileName=scan.nextLine();
		String path="C:\\Users\\Jasper\\Desktop\\assignment ITA";
		path = path.concat("\\"+fileName+".txt");
		System.out.println();
		File f = new File(path);		
		String content = "This is the content to write into file\n";

		BufferedWriter bw = null;
		FileWriter fw = null;
		fw = new FileWriter(path);
		bw = new BufferedWriter(fw);
		bw.write(content);
		bw.close();
		copyToAnotherFile(content);
		System.out.println("Done");
	}
	
	public static void copyToAnotherFile(String contents) {
		String existingPath = "C:\\Users\\Jasper\\Desktop\\assignment ITA\\copAssignment7ToThis\\appendToThis.txt";
		try(
				FileWriter fw = new FileWriter(existingPath, true);
			    BufferedWriter bw = new BufferedWriter(fw);
			    PrintWriter out = new PrintWriter(bw))
			{
				out.println("\n");
			    out.println("the text"+contents);
			} catch (IOException e) {
			    //exception handling left as an exercise for the reader
			}
	}

}
