package com.oocl.tengkh.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.oocl.barisja2.sw1.webservice.DirectoryExplorer;
import com.oocl.barisja2.sw1.webservice.DirectoryExplorerService;
import com.oocl.barisja2.sw1.webservice.GetDirectories;

@Path("/dir")
public class direcotyResource {

	@GET
	@Produces("text/plain")
	public String Directory() {
		DirectoryExplorerService dir = new DirectoryExplorerService(); 
		DirectoryExplorer de = dir.getDirectoryExplorerPort();
		return de.getDirectories();
	}
	
	public String Files() {
		DirectoryExplorerService dir = new DirectoryExplorerService(); 
		DirectoryExplorer de = dir.getDirectoryExplorerPort();
		return de.getFiles();
	}
}
