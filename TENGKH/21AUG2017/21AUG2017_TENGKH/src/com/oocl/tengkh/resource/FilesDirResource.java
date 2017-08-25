package com.oocl.tengkh.resource;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/dir")

public class FilesDirResource {
	@GET
	@Produces("text/plain")
	
	
	public String Counter() {
		int countFile = 0, countDir = 0;
		File pathFiles = new File("C:/Users/tengkh/Desktop");
		File[] PathFileList = pathFiles.listFiles();

		List<String> ListArray = new ArrayList<String>();

		for (int i = 0; i < PathFileList.length; i++) {
			if (PathFileList[i].isFile()) {
				countFile++;
				ListArray.add("File: " + PathFileList[i].getName());
			} else if (PathFileList[i].isDirectory()) {
				countDir++;
				ListArray.add("Directory: " + PathFileList[i].getName());
			}
		}

		Collections.sort(ListArray);
		for (String x : ListArray) {
			System.out.println(x);
		}
		System.out.println("\nNumber of Files: " + countFile);
		System.out.println("\nNumber of Directory: " + countDir);
		return ("\nNumber of Files: " + countFile + "\nNumber of Directory: " + countDir);

	}
}
