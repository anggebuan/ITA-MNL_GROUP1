package com.oocl.barisja2.sw1.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DirectoryExplorerImpl {

	int count = 0;
	List<String> directories = new ArrayList<String>();
	List<String> filez = new ArrayList<String>();

	public DirectoryExplorerImpl() {
		String path = "D:/";

		this.getFile(path);
	}

	public String getDirectories() {
		String str = "Directories: \n";

		for (String string : directories) {
			str += string + "\n";
		}

		return str;

	}

	public String getFilez() {
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
				}
			}
		}
	}
}
