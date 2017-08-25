package com.oocl.tengkh.hw4;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Returns the file number, file names, directory number and directory name
 * in a given directory in your local machine
 * C:\Users\KhimTeng09\Desktop
 * */
public class Homework4_Java_FilesCounter {

	public static void main(String[] args) {
		int countFile = 0, countDir = 0;
		//File pathFiles = new File("C:/Users/KhimTeng09/Desktop");
		File pathFiles = new File ("C:/Users/tengkh/Desktop");
		File[] PathFileList = pathFiles.listFiles();

		List<String> ListArray = new ArrayList<String>();

		for (int i = 0; i < PathFileList.length; i++) {
			if (PathFileList[i].isFile()) {
				countFile++;
				ListArray.add("File: " + PathFileList[i].getName());
			} else if (PathFileList[i].isDirectory()) {
				countDir++;
				ListArray.add("Directory: " + PathFileList[i].getName());
			}
		}

		Collections.sort(ListArray);
		for (String x : ListArray) {
			System.out.println(x);
		}
		System.out.println("\nNumber of Files: " + countFile);
		System.out.println("\nNumber of Directory: " + countDir);


	}

}
