package com.oocl.barceja2.hw2;

import java.io.IOException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.oocl.barceja2.hw1.Assignment10;
import com.oocl.barceja2.hw1.assignment5;

@Path("/hello")
public class HelloResource {

	@GET
	@Produces("text/html")
	@Path("/getHtml")
	public String hello() throws IOException {
		Assignment10 ass10 = new Assignment10();
		return ass10.copyHTMLFile("https://stackoverflow.com/questions/24241993/not-able-to-connect-to-oracle-db");
	}
		
	
	@GET
	@Produces("text/plain")
	@Path("/getStringRemoveWhiteSpaces")
	public String assignment5(@QueryParam("directory") String userInput) throws IOException {
		assignment5 ass5 = new assignment5();
		return ass5.removeWhiteSpace(userInput);
	}
	
	
	
}
