package com.oocl.ALLARRA.HW1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;



public class webCrawl {

	public String getHtml(String value) {
		URL url;
		String html = "";

		try {
			url = new URL(value);
			URLConnection conn = url.openConnection();

			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

			String inputLine;


			while ((inputLine = br.readLine()) != null) {
				html += inputLine;
			}

			br.close();

			System.out.println("Download is completed");

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return html;

	}
//	public String main(String args) {
//		// TODO Auto-generated method stub
//		javaIOstream jIO = new javaIOstream("D:\\Mon allarey\\text\\crawled.txt","D:\\Mon allarey\\text\\crawled.txt");
//		ArrayList<String> ioContent = jIO.Read();
//		webCrawl wc = new webCrawl();
//		wc.connect(args);
//		ioContent.add(wc.crawl());
//		jIO.write(ioContent);
//		args = wc.crawl();
//		return args;
//	}
//	Document doc;
//	public void connect(String site){
//		try {
//			doc = Jsoup.connect(site).get();
//			String text = doc.body().text();
//			System.out.println(text);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			System.out.println("cant Locate site please input valid site");
//		} 
////		Document doc = Jsoup.parse(html); 		
//	}
//	
//	public String crawl() {
//		return doc.body().text(); 
//	}
	

}
