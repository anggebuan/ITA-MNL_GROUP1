package com.oocl.ALLARRA.HW1;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/homework")
public class Homework {

	@GET
	@Produces("text/html")
	@Path("/getPageContent/")
	public String hello(@QueryParam("directory") String j) {
		webCrawl crawl = new webCrawl();		
		return crawl.getHtml(j);
	}
	
	@GET
	@Produces("text/plain")
	@Path("/getFiles/")
	public String getFile(@QueryParam("localDir") String j) {
		
		Locator locator = new Locator();
		File[] f = locator.locatePath(j);
		String S = "";
		for (int i = 0; i < f.length; i++) {
		      if (f[i].isFile()) {
		        System.out.println("File " + f[i].getName());
		        S+=f[i]+"\n";
		      } else if (f[i].isDirectory()) {
		        System.out.println("Directory " + f[i].getName());
		        S+=f[i]+"\n";
		      }
		    }
		return S;
		
	}
	
}
