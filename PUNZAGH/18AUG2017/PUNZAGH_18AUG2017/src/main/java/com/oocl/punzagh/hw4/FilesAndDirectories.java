package com.oocl.punzagh.hw4;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class FilesAndDirectories {

	public static void main(String[] args) {
		System.out.println("Enter Directory Path");
		Scanner input = new Scanner(System.in);
		String directorypath = "C:\\Users\\Mistelteyn\\Desktop\\Aug 18";
		showfilesandfolders(directorypath);
	}

	static void showfilesandfolders(String directorypath) {
		File directory = new File(directorypath);
		// get all the files from a directory
		File[] fList = directory.listFiles();
		int ttlfiles = 0;
		int ttldirec = 0;
		ArrayList<String> fileList = new ArrayList<String>();
		ArrayList<String> dirList = new ArrayList<String>();
		for (File file : fList) {
			if (file.isDirectory()) {
				ttldirec++;
				dirList.add(file.getPath());

			} else {
				ttlfiles++;
				fileList.add(file.getName());
			}
		}
		System.out.println("total directory " + ttldirec);
		for (String str : dirList) {
			System.out.println(str);
		}
		System.out.println("total files " + ttlfiles);
		for (String str : fileList) {
			System.out.println(str);
		}
	}

}
