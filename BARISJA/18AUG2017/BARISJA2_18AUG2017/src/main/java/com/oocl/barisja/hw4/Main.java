package com.oocl.barisja.hw4;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
	int count = 0;
	List<String> directories = new ArrayList<String>();
	List<String> filez = new ArrayList<String>();

	public static void main(String[] args) {

		Main main = new Main();
		String path = "D:/testDirectory";

		main.getFile(path);
		System.out.println("Total Files/Directories: " + main.count+"\n");

		System.out.println(main.getDirectories());

		System.out.println(main.getFilez());
	}

	private String getDirectories() {
		String str = "Directories: \n";

		for (String string : directories) {
			str += string + "\n";
		}

		return str;

	}

	private String getFilez() {
		String str = "Files: \n";
		for (String string : filez) {
			str += string + "\n";
		}

		return str;
	}

	private void getFile(String dirPath) {
		File f = new File(dirPath);
		File[] files = f.listFiles();

		if (files != null) {
			for (int i = 0; i < files.length; i++) {
				count++;
				File file = files[i];

				if (file.isFile()) {
					filez.add(file.getName());
				}

				if (file.isDirectory()) {
					directories.add(file.getName());
					getFile(file.getAbsolutePath());
				}
			}
		}
	}
}
