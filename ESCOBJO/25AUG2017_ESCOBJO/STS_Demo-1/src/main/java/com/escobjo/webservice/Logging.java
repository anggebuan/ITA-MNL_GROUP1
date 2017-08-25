package com.escobjo.webservice;

import org.aspectj.lang.annotation.Aspect;
import java.io.*;
import java.net.InetAddress;

import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.annotation.Before;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.AfterReturning;

@Aspect
public class Logging {
	

   /** Following is the definition for a pointcut to select
      *  all the methods available. So advice will be called
      *  for all the methods.
   */
   @Pointcut("execution(* com.escobjo.webservice.*.* (..))")
   private void selectAll(){}

   /** 
      * This is the method which I would like to execute
      * before a selected method execution.
 * @throws IOException 
   */
   
   
   private void writeLogger() throws IOException {
		
		String existingPath = "D:\\My Documents\\logs.txt";
		BufferedWriter bw = null;
		PrintWriter out = null;
		try {
			
			 InetAddress myIP=InetAddress.getLocalHost();
			 
		      /* public String getHostAddress(): Returns the IP 
		       * address string in textual presentation.
		       */	      
		      InetAddress addr = InetAddress.getLocalHost();
		      System.out.println("Local HostAddress: "+addr.getHostAddress());
		      String hostname = addr.getHostName();
		      System.out.println("Local host name: "+hostname);
			
			
			FileWriter fw = new FileWriter(existingPath, true);
			bw = new BufferedWriter(fw);
			out = new PrintWriter(bw);
			
			out.println("Somebody access the webservice:");
			out.println("HostAddress: "+addr.getHostAddress());
			out.println("Host name: "+hostname);			
			out.println("-----ACCESSED CLASS "+"-----\n-------------------- ");

		} catch (IOException e) {
			// exception handling
		} finally {
			bw.close();
			out.close();
		}
	} 
   
   
   @Before("selectAll()")
   public void beforeAdvice() throws IOException{
	  
	   writeLogger();
      System.out.println("Setting up Product Catalogue...." );
   }

   /** 
      * This is the method which I would like to execute
      * after a selected method execution.
   */
   @After("selectAll()")
   public void afterAdvice(){	   
      System.out.print("Product Catalogue has been setup." + "\n");
   }

   /** 
      * This is the method which I would like to execute
      * when any method returns.
   */
   @AfterReturning(pointcut = "selectAll()", returning = "retVal")
   public void afterReturningAdvice(Object retVal){
      System.out.println("\nGathered Data: " + retVal.toString() +"\n" );
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