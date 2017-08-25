package com.oocl.barceja2.sw2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logging {
   /** Following is the definition for a pointcut to select
      *  all the methods available. So advice will be called
      *  for all the methods.
   */
   @Pointcut("execution(* com.oocl.barceja2.sw2.*.*(..))")
   private void selectAll(){
   }

   /** 
      * This is the method which I would like to execute
      * before a selected method execution.
 * @throws IOException 
   */
   
   @Before("selectAll()")
   public void beforeAdvice() throws IOException{
	   writeLogger();
      System.out.println("Old stock books: ");
   }
   
   
	private void writeLogger() throws IOException {
		// TODO Auto-generated method stub
		InetAddress ip;
	    BufferedWriter bw = null;
 		PrintWriter out = null;
 		StringBuilder sb = new StringBuilder();
 		
	        try {
	            ip = InetAddress.getLocalHost();
	            DateFormat dateFormat = new SimpleDateFormat("dd/MMM/YYYY HH:mm:ss");
	            Calendar cal = Calendar.getInstance();
	            
	            String existingPath = "D:\\logger\\bookslogger.txt";
	    		FileWriter fw = new FileWriter(existingPath, true);
    			bw = new BufferedWriter(fw);
    			out = new PrintWriter(bw);
    			sb.append(dateFormat.format(cal.getTime()) + " - ");
    			sb.append("Hostname/ IP Address: " + ip);
    			sb.append("; Web service has been accessed");
    			System.out.println(sb.toString());
    			out.println(sb.toString());
	    		
	            
	        } catch (UnknownHostException e) {
	 
	            e.printStackTrace();
	        } finally {
    			bw.close();
    			out.close();
    		}
	}

   /** 
      * This is the method which I would like to execute
      * after a selected method execution.
   */
   @After("selectAll()")
   public void afterAdvice(){
      System.out.println("People buy Bookszsss");
   }

   /** 
      * This is the method which I would like to execute
      * when any method returns.
   */
   @AfterReturning(pointcut = "selectAll()", returning = "retVal")
   public void afterReturningAdvice(Object retVal){
      System.out.println("Restock Set of books: " + retVal.toString() );
   }

   /**
      * This is the method which I would like to execute
      * if there is an exception raised by any method.
   */
   @AfterThrowing(pointcut = "selectAll()", throwing = "ex")
   public void AfterThrowingAdvice(IllegalArgumentException ex){
      System.out.println("There has been an exception: " + ex.toString());   
   }
}