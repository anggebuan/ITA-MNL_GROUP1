package Exer8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Wk3exer8 {
	public String str ;
	    public String main(String args)
	    {
	    	
	        str=args;
	 
	        String pattern = "[^\\w+$p{ASCII}]";
	        String strWithoutSpace = str.replaceAll(pattern, "");
	        
	        System.out.println("\nRemoved spaces and symbols:"+strWithoutSpace);   

	        //s= str.trim();
//	       for(int i = 0 ; i<str.length() ;i++) {
//	    	   s =str.charAt(i);
//	       
//	    	   System.out.println(str.charAt(i));
//	    	   System.out.println("++:"+str.charAt(i++));
//	    	   if(str.charAt(i)==str.charAt(i++)) {
//	       }}
	       
//	       for (int i = 0; i < str.length(); i++) {
//	           if(!str.contains(String.valueOf(str.charAt(i)))) {
//	               str += String.valueOf(str.charAt(i));
//	           }
//	       }
	       char ch; String s = " ";
	       for(int i=0; i<str.length(); i++)
           {
               ch = str.charAt(i);
               if(ch!=' ')
                   s = s + ch;
               str = str.replace(ch,' '); //Replacing all occurrence of the current character by a space
           }
	        System.out.println("Removed duplicate: "+s);
	        
	   return s;
	}
	    
	    }

