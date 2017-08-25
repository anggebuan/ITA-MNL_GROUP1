package com.oocl.barisja2.hw1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.oocl.barisja2.hws.SearchDirectories;


@Path("/SearchDirectoryResource")
public class SearchDirectoryResource {

	@GET
	@Produces("text/plain")
	public String SearchDirectoryResource() {
		
		SearchDirectories sd = new SearchDirectories();
		
		return sd.getDirectories();
	}
}

