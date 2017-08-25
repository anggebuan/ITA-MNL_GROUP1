package com.oocl.tengkh.hw7;

import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * Create a text file
 * Write anything on it
 * Copy 
 * */
public class CreateFile {

	public static void main(String[] args) throws IOException {
		String path = "C:/Users/KhimTeng09/Desktop/";
		File file = new File(path + "1st.txt");
		file.createNewFile();
		FileWriter toWrite = new FileWriter(file);
		BufferedWriter write = new BufferedWriter(toWrite);
		String[] array = { "Khimberly", "Blue", "Food", "Music" };
		for (int i = 0; i < array.length; i++) {
			write.write(array[i]);
			write.newLine();
		}
		write.close();

		FileReader toRead = new FileReader(file);
		BufferedReader read = new BufferedReader(toRead);
		String str;
		List<String> list = new ArrayList<String>();
		while ((str = read.readLine()) != null) {
			list.add(str);
		}
		read.close();

		File file2 = new File(path + "2nd.txt");
		file2.createNewFile();
		String[] array2 = { "Java", "JavaScript", "Spring Framework" };
		FileWriter toWrite2 = new FileWriter(file2);
		BufferedWriter write2 = new BufferedWriter(toWrite2);
		for (int i = 0; i < list.size(); i++) {
			write2.write(list.get(i).toString());
			write2.newLine();

		}
		for(int x = 0; x < array2.length; x++) {
			write2.append(array2[x]);
			write2.newLine();
		}
		write2.close();

	}

}
