package com.oocl.punzagh.sw1;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class WriteFile {

	private static final String FILENAME = "src/main/java/com/oocl/punzagh/sw1/words.txt";

	public static void main(String[] args) {



		try {
			Stream<String> stream = Files.lines(Paths.get(FILENAME));
			ArrayList<String> arrayList = new ArrayList<String>();
			stream.forEach(arrayList::add);
			Collections.sort(arrayList,Collator.getInstance());
			FileOutputStream fop = new FileOutputStream(FILENAME);
				for (String string : arrayList) {
					string += "\n";
					byte[] contentInBytes = string.getBytes();
					System.out.println(string);
					System.out.println(contentInBytes);
					fop.write(contentInBytes);
					fop.flush();
				}
				fop.close();
		

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}
