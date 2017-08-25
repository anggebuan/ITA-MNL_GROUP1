package com.oocl.allarra.HW7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class javaIOstreamHW7 {
	String text;
	
	public javaIOstreamHW7(String text) {
		this.text = text;
	}
	public void CreateFile() {
		int x=1; 
		File f = new File("D:\\Mon allarey\\text\\MyText"+1+".txt");
			while(f.exists()) {
				f = null;
				x++;
				f = new File("D:\\Mon allarey\\text\\MyText"+x+".txt");
			}
			write(text,x);
	}

	public void write(String s, int j) {
		BufferedWriter bw = null;
		FileWriter fw = null;
		String fileTo = "D:\\Mon allarey\\text\\MyText"+j+".txt";
		try {

			fw = new FileWriter(fileTo);
			bw = new BufferedWriter(fw);
				 bw.write(s);
				 bw.newLine();
			bw.close();
			fw.close();
			System.out.println("Done");
		}catch(Exception ex) {
			System.out.println("eeeehhh:"+ ex.getMessage());
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input String: ");
		javaIOstreamHW7 io = new javaIOstreamHW7(in.nextLine());
		io.CreateFile();
	}


}
