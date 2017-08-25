package com.oocl.planace.hw1.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import com.oocl.planace.hw1.functions.*;

@Path("/functions")
public class Homework1Resource {
	@GET
	@Path("/getDirectory/{directory}")
	@Produces("text/plain")
	public String getDirectory(@PathParam("directory") String directory) {
		if (directory.length() < 1) {
			return "You need to input a file Path";
		} else {
			// ipAdd = "13.107.21.200";
			DirectoryGetter getter = new DirectoryGetter();
			return getter.getDirectory(directory);
		}
	}

	@GET
	@Path("/getSiteBody/{site}")
	@Produces("text/plain")
	public String getSiteBody(@PathParam("site") String site) {
		if (site.length() < 1) {
			return "You need to input a website!";
		} else {
			site = "https://" + site;
			SiteGetter siteGet = new SiteGetter();
			
			return siteGet.getSite(site);
		}
	}
}
