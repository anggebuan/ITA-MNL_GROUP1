package com.oocl.barisja2.hw2;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.oocl.barisja2.hws.WebCrawler;

@Path("/webCrawlerResource")
public class WebCrawlerResource {
	
	@GET
	@Produces("text/plain")
	public String webCrawlerResource(){
		
		WebCrawler wc = new WebCrawler();
		
		return wc.crawl();
	}
	
	
	
	
}
