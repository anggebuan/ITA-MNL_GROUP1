package com.oocl.punzagh.hw9;

import java.io.IOException;
import java.util.Scanner;

public class ExecuteApplication {


    public static void main(String[] args)
    {
        Runtime runtime = Runtime.getRuntime();    
        Scanner str = new Scanner(System.in);
        
        try
        {
        	System.out.println("Enter System App");
            runtime.exec(str.nextLine());      
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

}
