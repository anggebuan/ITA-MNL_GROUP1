package com.oocl.barceja2.sw2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

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
		
		String existingPath = "D:\\logger\\bookslogger.txt";
		BufferedWriter bw = null;
		PrintWriter out = null;
		try {
			FileWriter fw = new FileWriter(existingPath, true);
			bw = new BufferedWriter(fw);
			out = new PrintWriter(bw);
			out.println("Webservice has been accessed");
		} catch (IOException e) {
			// exception handling left as an exercise for the reader
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