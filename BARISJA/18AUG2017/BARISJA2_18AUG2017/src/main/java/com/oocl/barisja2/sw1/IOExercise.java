package com.oocl.barisja2.sw1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IOExercise {

	public static void main(String[] args) {

		IOExercise io = new IOExercise();
		// The name of the file to open.
		String readfile = "src/main/resources/read.txt";

		List input = io.readFile(readfile);

		String writefile = "src/main/resources/write.txt";

		io.writeFile(input, writefile);

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
