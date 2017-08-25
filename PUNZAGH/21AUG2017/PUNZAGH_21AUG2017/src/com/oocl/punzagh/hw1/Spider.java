package com.oocl.punzagh.hw1;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


@Path("/gettexts")
public class Spider
{
	//private static final String FILENAME = "src/com/oocl/punzagh/hw1/Inside.txt";
	
	@GET
	@Produces("text/plain")
	public String webcrawlstr() throws IOException {
		//Stream<String> stream = Files.lines(Paths.get(FILENAME));
		//ArrayList<String> arrayList = new ArrayList<String>();
		//stream.forEach(arrayList::add);
		Spider wc = new Spider();
		wc.connect("http://www.bing.com");
//		arrayList.add(wc.crawl());
//		for(String str: arrayList) {
//			Files.write(Paths.get("src/main/java/com/oocl/punzagh/hw10/Inside.txt"), str.getBytes(), StandardOpenOption.APPEND);
//		}
		return wc.crawl();
	}
	
	Document doc;
	public void connect(String site){
		
		try {
			doc = Jsoup.connect(site).get();
			String text = doc.body().text();
			System.out.println(text);
		} catch (IOException e) {
			System.out.println("cant Locate site please input valid site");
			
		} 	
	}
	
	public String crawl() {
		return doc.body().text(); 
	}
}
