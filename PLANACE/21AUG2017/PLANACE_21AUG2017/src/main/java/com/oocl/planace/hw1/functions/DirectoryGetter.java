package com.oocl.planace.hw1.functions;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DirectoryGetter {
	static int count = 0;
	static List<String> dirNames = new ArrayList<String>();
	static List<String> fileNames = new ArrayList<String>();

	public static String getDirectory(String directory) {
		// TODO Auto-generated method stub
		directory = directory.replace(".", "/");
		directory = directory + "/";
		listFiles(directory);
		StringBuilder sb = new StringBuilder();
		sb.append("Total number of directories: " + dirNames.size() +"\n");
		for (String dirs : dirNames) {
			sb.append(dirs + "\\\n");
		}

		sb.append("Total number of files: " + fileNames.size()+"\n");
		for (String file : fileNames) {
			sb.append(file+"\n");
		}
		return sb.toString();
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