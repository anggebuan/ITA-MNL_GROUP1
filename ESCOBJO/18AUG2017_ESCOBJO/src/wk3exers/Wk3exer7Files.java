package wk3exers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Wk3exer7Files {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		
		Scanner input = new Scanner(System.in);    	
		
		File f = new File("C:/Users/Jossel/Documents/a.txt");
	
		System.out.println("Creating new file");
		
		 try{
	            // Create new file
	            String content = "I love God";
	            String path="C:/Users/Jossel/Documents/a.txt";
	            File file = new File(path);

	            // If file doesn't exists, then create it
	            if (!file.exists()) {
	                file.createNewFile();
	            }
	            file.createNewFile();
	            FileWriter fw = new FileWriter(file.getAbsoluteFile());
	            BufferedWriter bw = new BufferedWriter(fw);

	            // Write in file
	            bw.write(content);

	            // Close connection
	            bw.close();
	        }
	        catch(Exception e){
	            System.out.println(e);
	        }
	
		FileInputStream instream = null;
		FileOutputStream outstream = null;
	 
	    	try{
	    	    File infile =new File("C:/Users/Jossel/Documents/a.txt");
	    	    File outfile =new File("C:/Users/Jossel/Documents/b.txt");
	 
	    	    instream = new FileInputStream(infile);
	    	    if (!infile.exists()) {
	                infile.createNewFile();
	            }
	    	    outstream = new FileOutputStream(outfile);
	 
	    	    byte[] buffer = new byte[1024];
	 
	    	    int length;
	    	    /*copying the contents from input stream to
	    	     * output stream using read and write methods
	    	     */
	    	    while ((length = instream.read(buffer)) > 0){
	    	    	outstream.write(buffer, 0, length);
	    	    }

	    	    //Closing the input/output file streams
	    	    instream.close();
	    	    outstream.close();

	    	    System.out.println("File copied successfully!!");
	 
	    	}catch(IOException ioe){
	    		ioe.printStackTrace();
	    	 }
}
}
