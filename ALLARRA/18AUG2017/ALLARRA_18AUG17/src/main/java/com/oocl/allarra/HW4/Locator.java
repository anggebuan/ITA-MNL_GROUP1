package com.oocl.allarra.HW4;

import java.io.File;
import java.util.Scanner;

public class Locator {
	public static void main(String[] args) {
		Locator l = new Locator();
		Scanner scan=new Scanner(System.in);
		System.out.println("input Path");
		String path= scan.nextLine();
		l.locatePath(path);
		scan.close();
	}
	public void locatePath(String path) {
		
		File folder = new File(path);
		try {
		File[] listOfFiles = folder.listFiles();
	    for (int i = 0; i < listOfFiles.length; i++) {
		      if (listOfFiles[i].isFile()) {
		        System.out.println("File " + listOfFiles[i].getName());
		      } else if (listOfFiles[i].isDirectory()) {
		        System.out.println("Directory " + listOfFiles[i].getName());
		      }
		    }}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("pathNotFound");
		}

	}

}
