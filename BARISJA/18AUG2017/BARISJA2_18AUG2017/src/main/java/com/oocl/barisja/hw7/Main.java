package com.oocl.barisja.hw7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Main io = new Main();
		// The name of the file to open.
		String readfile = "src/main/resources/read.txt";

		List input = io.readFile(readfile);

		String writefile = "src/main/resources/write.txt";

		io.writeFile(input, writefile);

		InputStream source = null;
		OutputStream dest = null;
		try {
			source = new FileInputStream(new File(writefile));
			dest = new FileOutputStream(new File("src/main/resources/copy.txt"));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {

			byte[] buffer = new byte[1024];
			int length;
			while ((length = source.read(buffer)) > 0) {
				dest.write(buffer, 0, length);
			}
			source.close();
			dest.close();
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

	private void writeFile(List input, String writefile) {

		try {
			// Assume default encoding.
			FileWriter fileWriter = new FileWriter(writefile);

			// Always wrap FileWriter in BufferedWriter.
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

			// Note that write() does not automatically
			// append a newline character.
			for (Object object : input) {

				bufferedWriter.write(object.toString());
				bufferedWriter.newLine();
			}

			// Always close files.
			bufferedWriter.close();
		} catch (IOException ex) {
			System.out.println("Error writing to file '" + writefile + "'");
			// Or we could just do this:
			// ex.printStackTrace();
		}
	}

	public List<String> readFile(String fileName) {
		// This will reference one line at a time
		String line = null;

		List<String> input = new ArrayList<String>();

		try {
			// FileReader reads text files in the default encoding.
			FileReader fileReader = new FileReader(fileName);

			// Always wrap FileReader in BufferedReader.
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {
				input.add(line);
			}

			Collections.sort(input, Collator.getInstance());

			// Always close files.
			bufferedReader.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + fileName + "'");
			// Or we could just do this:
			// ex.printStackTrace();
		}

		return input;

	}

}
