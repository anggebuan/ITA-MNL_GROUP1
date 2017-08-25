package com.oocl.allarra.HW10;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import com.oocl.allarra.SW1.javaIOstream;


public class webCrawl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		javaIOstream jIO = new javaIOstream("D:\\Mon allarey\\text\\crawled.txt","D:\\Mon allarey\\text\\crawled.txt");
		ArrayList<String> ioContent = jIO.Read();
		webCrawl wc = new webCrawl();
		wc.connect("http://www.bing.com");
		ioContent.add(wc.crawl());
		jIO.write(ioContent);
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
