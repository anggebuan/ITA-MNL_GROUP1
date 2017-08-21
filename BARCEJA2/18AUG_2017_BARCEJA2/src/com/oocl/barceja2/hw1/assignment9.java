package com.oocl.barceja2.hw1;

import java.io.IOException;
import java.util.Scanner;

public class assignment9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime runtime = Runtime.getRuntime();
        try
        {
        	System.out.println("Choice below which application to run:");
        	System.out.println("[1] - Notepad");
        	System.out.println("[2] - Windows media player");
        	Scanner scan = new Scanner(System.in);
        	String choice=scan.nextLine();
        	if ("1".equals(choice)) {
        		runtime.exec("notepad.exe");	
        	}else if ("2".equals(choice)) {
        		runtime.exec("C:\\Program Files (x86)\\Windows Media Player\\wmplayer.exe");	
        	}
            
            //OR runtime.exec("notepad");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }	
	}

}
