package com.oocl.barisja.hw10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Main wc = new Main();
		wc.connect("http://www.wikipedia.com");
		
		
		try {
		    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("src/main/resources/htmlContent.txt", true)));
		    out.println(wc.crawl());
		    out.close();
		} catch (IOException e) {
		    //exception handling left as an exercise for the reader
		}
		
	}
	Document doc;
	public void connect(String site){
		
		try {
			doc = Jsoup.connect(site).get();
			String text = doc.body().text();
			System.out.println(text);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("cant Locate site please input valid site");
			
		} 
//		Document doc = Jsoup.parse(html); 		
	}
	
	public String crawl() {
		return doc.body().text(); 
	}
	
	
}
