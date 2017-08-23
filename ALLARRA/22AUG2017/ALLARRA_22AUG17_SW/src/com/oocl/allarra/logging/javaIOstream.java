package com.oocl.allarra.logging;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;

public class javaIOstream {
	
	String filename;
	String fileTo;
	public javaIOstream(String filename, String fileTo){
		this.filename = filename;	
		this.fileTo = fileTo;
	}
	
	public ArrayList<String> Read() {

		ArrayList<String> line = new ArrayList<String>();
		String temp;
		try {
            // FileReader reads text files in the default encoding.
			 // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(filename);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((temp = bufferedReader.readLine()) != null) {
                System.out.println(temp);
                line.add(temp);
            }   

            // Always close files.
            bufferedReader.close();    
		
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		return line;	
	}
	
	
	public void write(ArrayList<String> s) {
		BufferedWriter bw = null;
		FileWriter fw = null;
		
		try {

			fw = new FileWriter(fileTo);
			bw = new BufferedWriter(fw);
			for(int x=0; x<s.size(); x++) {
				 System.out.println(s.get(x));
				 bw.write(s.get(x));
				 bw.newLine();
			}
			bw.close();
			fw.close();
			System.out.println("Done");
		}catch(Exception ex) {
			System.out.println("eeeehhh:"+ ex.getMessage());
		}
	}
	
	
	
	public static void main(String[] args) {
		javaIOstream io = new javaIOstream("D:\\Mon allarey\\text\\abc.txt", "D:\\Mon allarey\\text\\sorted.txt");
		ArrayList<String> line = new ArrayList<String>();
		line = io.Read();
		Collections.sort(line, Collator.getInstance());
		io.write(line);
	}

}
