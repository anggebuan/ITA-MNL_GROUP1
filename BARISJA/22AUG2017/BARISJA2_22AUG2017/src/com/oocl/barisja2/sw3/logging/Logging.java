package com.oocl.barisja2.sw3.logging;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logging {
	

	@Pointcut("execution(* com.oocl.barisja2.sw1.impl.*.*(..))")
   private void selectAll(){}


   @Before("selectAll()")
   public void beforeAdvice(){
		try {
		    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("D:/BARISJA2/WSLogs/log.txt", true)));
		    out.println( LocalDateTime.now() + "Someone accessed your webservice.");
		    out.close();
		} catch (IOException e) {
		    //exception handling left as an exercise for the reader
		}
		
      System.out.println("Someone accessed your webservice.");
   }


   @After("selectAll()")
   public void afterAdvice(){
      		try {
		    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("D:/BARISJA2/WSLogs/log.txt", true)));
		    out.println( LocalDateTime.now() + "Someone accessed your webservice.");
		    out.close();
		} catch (IOException e) {
		    //exception handling left as an exercise for the reader
		}
		
   }


}	