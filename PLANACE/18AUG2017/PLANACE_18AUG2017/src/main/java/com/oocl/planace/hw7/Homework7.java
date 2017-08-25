package com.oocl.planace.hw7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Homework7 {

	private static File createFile() {
		int fileCount = 1;
		File file = new File("D:\\nonie\\TextFile.txt");
		while (file.exists()) {
			file = null;
			file = new File("D:\\nonie\\TextFile" + fileCount + ".txt");
			fileCount++;
		}
		try {
			file.createNewFile();

			FileWriter writer = new FileWriter(file);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
			bufferedWriter.write("This is " + file.getAbsolutePath());
			bufferedWriter.newLine();
			bufferedWriter.write("Hello There");
			bufferedWriter.close();
			writer.close();
			System.out.println("Successfully Created " + file.getAbsolutePath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Failed to create " + file.getAbsolutePath());
		}

		return file;
	}
	
	private static void copyFile(File file) {
		String fileName = file.getAbsolutePath();
		fileName = fileName.replaceAll(".txt", " - Copy.txt");
		File copyFile = new File(fileName);
		InputStream read = null;
		OutputStream copy = null;
		try {
			read = new FileInputStream(file);
			copy = new FileOutputStream(copyFile);
			byte[] buffer = new byte[1024];
			int length;
			while ((length = read.read(buffer)) > 0) {
	            copy.write(buffer, 0, length);
	        }

			read.close();
			copy.close();	

			System.out.println("Successfully Created " + copyFile.getAbsolutePath());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
		}
	}

	public static void main(String args[]) {
		File newFile = createFile();
		copyFile(newFile);
	}
}
