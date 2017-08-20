package com.oocl.punzagh.hw10;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Spider
{
	
	private static final String FILENAME = "src/main/java/com/oocl/punzagh/hw10/Inside.txt";
	public static void main(String[] args) throws IOException {
		Stream<String> stream = Files.lines(Paths.get(FILENAME));
		ArrayList<String> arrayList = new ArrayList<String>();
		stream.forEach(arrayList::add);
		Spider wc = new Spider();
		wc.connect("http://www.bing.com");
		arrayList.add(wc.crawl());
		for(String str: arrayList) {
			Files.write(Paths.get("src/main/java/com/oocl/punzagh/hw10/Inside.txt"), str.getBytes(), StandardOpenOption.APPEND);
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
