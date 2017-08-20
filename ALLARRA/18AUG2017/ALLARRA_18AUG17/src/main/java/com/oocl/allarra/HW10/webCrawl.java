package com.oocl.allarra.HW10;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import com.oocl.allarra.SW1.javaIOstream;


public class webCrawl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		javaIOstream jio;
		

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
