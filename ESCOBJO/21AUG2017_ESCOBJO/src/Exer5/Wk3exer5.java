package Exer5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Wk3exer5 {
	public String str ;
	    public String main(String args)
	    {
	    	
	    	  str=args;
//	    	Scanner input = new Scanner(System.in);
//	    	System.out.print("Enter a word(s): " );
//	        String str = input.nextLine();
	        //System.out.println(str);
	        //1. Using replaceAll() Method
	 
	        String strWithoutSpace = str.replaceAll("\\s", "");
	 
	        System.out.println("\n"+strWithoutSpace);   
	 
	        //2. Without Using replaceAll() Method
	 
	        char[] strArray = str.toCharArray();
	 
	        StringBuffer sb = new StringBuffer();
	 
	        for (int i = 0; i < strArray.length; i++)
	        {
	            if( (strArray[i] != ' ') && (strArray[i] != '\t') )
	            {
	                sb.append(strArray[i]);
	            }
	        }
	 
	       System.out.println(sb);  // same output
		return strWithoutSpace;
	    }
	}

