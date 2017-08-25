package com.oocl.tengkh.resource;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class homework10_webcontent {
	public String main(String value) {

		URL url;
		String html = "";

		try {
			url = new URL(value);
			URLConnection conn = url.openConnection();

			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

			String inputLine;

			String fileName = "C:\\Users\\tengkh\\Desktop\\test.doc";
			File file = new File(fileName);

			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);

			while ((inputLine = br.readLine()) != null) {
				bw.write(inputLine);
				html += inputLine;
			}

			bw.close();
			br.close();

			System.out.println("Download is completed");

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return html;

	}

}
