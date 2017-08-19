package com.oocl.punzagh.hw7;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Stream;

public class WriteFile {

	private static final String FILEPATH = "src/main/java/com/oocl/punzagh/hw7/";
	private static final String FILETYPE = ".txt";
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Input Filename:");
			String filename = scan.nextLine();
			FileOutputStream fop = new FileOutputStream(FILEPATH+filename+FILETYPE);

					byte[] contentInBytes = (FILEPATH+filename+FILETYPE).getBytes();
					fop.write(contentInBytes);
					fop.flush();
					fop.close();
					Files.write(Paths.get("src/main/java/com/oocl/punzagh/hw7/words.txt"), (FILEPATH+filename+FILETYPE+"\r\n").getBytes(), StandardOpenOption.APPEND);
		} catch (IOException e) {

			e.printStackTrace();

		}
		
	}

}
