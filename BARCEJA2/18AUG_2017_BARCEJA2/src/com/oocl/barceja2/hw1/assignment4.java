package com.oocl.barceja2.hw1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class assignment4 {
	public static void main(String[] args) {
		System.out.println("Please input directory");
		Scanner scan = new Scanner(System.in);
		String path =scan.nextLine();
		File f = new File(path);
		try {
			listFilesForFolder(f);	
		}catch(Exception e){
			e.printStackTrace();
		}
		
//		File[] matchingFiles = f.listFiles(new FilenameFilter() {
//		    public boolean accept(File dir, String name) {
//		        return name.startsWith("temp") && name.endsWith("txt");
//		    }
//		});
		
		
	}
	
	public static void listFilesForFolder(File folder) {
	    int folderCtr=0,fileCtr=0;
	    List<String> foldernames = new ArrayList<String>();
	    List<String> filenames = new ArrayList<String>();
		for (File fileEntry : folder.listFiles()) {
	        if (fileEntry.isDirectory()) {
	        	foldernames.add(fileEntry.getName().toString());
	        	folderCtr++;
	        }
	        if(!fileEntry.isDirectory()) {
	        	filenames.add(fileEntry.getName().toString());
	        	fileCtr++;
	        }
	    }
		System.out.println("total directory number: "+ folderCtr);
        for(String fnames:foldernames) {
        	System.out.println(fnames);
        }
        System.out.println("------------------");
        System.out.println("total file number: "+ fileCtr);
        for(String fnames:filenames) {
        	System.out.println(fnames);
        }
	}
}
