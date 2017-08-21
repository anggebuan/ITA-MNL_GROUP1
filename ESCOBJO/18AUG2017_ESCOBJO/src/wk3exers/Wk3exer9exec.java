package wk3exers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Wk3exer9exec {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		
		Scanner input = new Scanner(System.in);    	
		String str = null;		
		
		System.out.println("----------------------------\n");
		System.out.println("Choose file to open: " );
		System.out.println("1 - Notepad " );
		System.out.println("2 - Windows Media Player " );
		System.out.print("\nEnter your choice: ");
        String choice = input.nextLine();
        
        if(choice.equals("1")) {
        	str = "C:\\Windows\\notepad.exe";
        	System.out.println("\nNotepad is open.");
        }
        else if(choice.equals("2")) {
        	str = "C:\\Program Files (x86)\\Windows Media Player\\wmplayer.exe";
        	System.out.println("\nWindows Media Player is open.");
        	
        }
        else {
        	System.out.println("Wrong input! ");
        }
		
		 try {
		        Runtime runTime = Runtime.getRuntime();
		        Process process = runTime.exec(str);

		    } catch (IOException e) {
		    	System.out.println("\n" + e.getMessage()+"\n");
		    	e.printStackTrace();
		       
		    }
	}
}
