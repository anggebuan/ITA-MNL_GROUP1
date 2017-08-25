package com.oocl.tengkh.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

@Path("/webcontent")
public class WebContentResource {
	@GET
	@Produces("text/html")
	public String webContent() {
		homework10_webcontent web = new homework10_webcontent();

		return web.main("https://github.com/");
	}

}
