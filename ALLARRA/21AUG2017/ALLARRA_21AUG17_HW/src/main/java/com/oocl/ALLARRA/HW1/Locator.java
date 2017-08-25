package com.oocl.ALLARRA.HW1;

import java.io.File;
import java.util.Scanner;

public class Locator {
	public void main(String[] args) {
		Locator l = new Locator();
		Scanner scan=new Scanner(System.in);
		System.out.println("input Path");
		String path= scan.nextLine();
		l.locatePath(path);
		scan.close();
	}
	public File[] locatePath(String path) {
		
		File folder = new File(path);
		File[] listOfFiles = null;
		try {
		listOfFiles = folder.listFiles();
		System.out.println("test");
	    }
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("pathNotFound");
		}
		
		return listOfFiles;

	}

}
