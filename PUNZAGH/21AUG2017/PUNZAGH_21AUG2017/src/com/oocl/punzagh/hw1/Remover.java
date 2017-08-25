package com.oocl.punzagh.hw1;

import java.io.IOException;
import java.util.Scanner;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("remove")
public class Remover {
	
	@GET
	@Produces("text/plain")
	public String remove() throws IOException {
		String str = "Ghino Punzalan 你 好";
		String strremoved = str.replaceAll("[^\\x00-\\x7F]|\\s", "");
		return (str + "\r\n" + strremoved);
	}
}
