package com.oocl.planace.hw10;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Homework10 {
	public static void main(String[] args) {
		String site = "https://www.microsoft.com";
		String text = "";
		try {
			Document siteInfo = Jsoup.connect(site).get();
			text = siteInfo.body().text();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("cant Locate site please input valid site");
			return;
		}

		File file = new File("D:\\nonie\\webcrawl\\siteBody.txt");

		try {
			file.createNewFile();
			FileWriter writer = new FileWriter(file);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
			bufferedWriter.write(text);
			bufferedWriter.close();
			writer.close();
			System.out.println("Successfully Created " + file.getAbsolutePath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Failed to create " + file.getAbsolutePath());
		}
	}
}
