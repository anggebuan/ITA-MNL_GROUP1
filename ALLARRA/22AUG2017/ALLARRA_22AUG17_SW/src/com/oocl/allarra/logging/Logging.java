package com.oocl.allarra.logging;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.annotation.Before;

import java.util.ArrayList;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.AfterReturning;


@Aspect
public class Logging {
   /** Following is the definition for a pointcut to select
      *  all the methods available. So advice will be called
      *  for all the methods.
   */
	javaIOstream jIO;
	public Logging() {
		// TODO Auto-generated constructor stub
		
	}
   @Pointcut("execution(* com.oocl.allarra.impl.*.*(..))")
   private void selectAll(){}

   /** 
      * This is the method which I would like to execute
      * before a selected method execution.
   */
   ;
   @Before("selectAll()")
     public void beforeAdvice(){
	  jIO = new javaIOstream("D:\\Mon allarey\\text\\logs.txt", "D:\\Mon allarey\\text\\logs.txt");
	  ArrayList<String> ioContent = jIO.Read();
	  ioContent.add("someone Access your WS");
	  ioContent.add(host);
	  jIO.write(ioContent);
      System.out.println("Instance Called");
   }
   String host;
   public void setHost(String host){
		  this.host = "Hostname: "+host;
		  System.out.println(host);
	   }
   

   /** 
      * This is the method which I would like to execute
      * after a selected method execution.
   */
   @After("selectAll()")
   public void afterAdvice(){
	   jIO = new javaIOstream("D:\\Mon allarey\\text\\logs.txt", "D:\\Mon allarey\\text\\logs.txt");
	   ArrayList<String> ioContent = jIO.Read();
	   ioContent.add("Instance Close");
	   jIO.write(ioContent);
      System.out.println("Instance after.");
   }

   /** 
      * This is the method which I would like to execute
      * when any method returns.
   */
   @AfterReturning(pointcut = "selectAll()", returning = "retVal")
   public void afterReturningAdvice(Object retVal){
      System.out.println("Returning:" + retVal.toString() );
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