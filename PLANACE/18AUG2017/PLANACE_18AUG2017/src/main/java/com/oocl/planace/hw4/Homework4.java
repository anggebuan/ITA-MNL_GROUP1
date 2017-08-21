package com.oocl.planace.hw4;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Homework4 {
	static int count = 0;
	static List<String> dirNames = new ArrayList<String>();
	static List<String> fileNames = new ArrayList<String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		listFiles("D:\\testFolder");

		System.out.println("Total number of directories: " + dirNames.size());
		for (String dirs : dirNames) {
			System.out.println(dirs + "\\");
		}

		System.out.println("Total number of files: " + fileNames.size());
		for (String file : fileNames) {
			System.out.println(file);
		}
	}

	private static void listFiles(String path) {
		File filePath = new File(path);
		File[] files = filePath.listFiles();

		if (files != null)
			for (int i = 0; i < files.length; i++) {
				count++;
				File file = files[i];

				if (file.isDirectory()) {
					dirNames.add(files[i].getName());
					listFiles(file.getAbsolutePath());
				} else {
					fileNames.add(files[i].getName());
				}

			}
	}
}