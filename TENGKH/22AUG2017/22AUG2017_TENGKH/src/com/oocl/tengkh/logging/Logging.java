package com.oocl.tengkh.logging;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.annotation.Before;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;

@Aspect
public class Logging {
	private String path = "C:/Users/KhimTeng09/Desktop/ws_log_out.txt";
	InetAddress ip;

	public String createLocalhost() {
		try {
			this.ip = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		return ip.getHostAddress();
	}

	@Pointcut("execution(* com.oocl.tengkh.impl.*.*(..))")
	private void selectAll() throws IOException {
	}

	@Before("selectAll()")
	public void beforeAdvice() throws IOException {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		String ip = createLocalhost();
		LogAppend("[" + dateFormat.format(date) + "]" + " IP ADRESS: " + this.ip + " BluePlum WebService has been accessed.");

	}

	@After("selectAll()")
	public void afterAdvice() throws IOException {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		String ip = createLocalhost();
		LogAppend("[" + dateFormat.format(date) + "]" + " IP ADRESS: " + ip + " BluePlum WebService is closed.");
	}

	@AfterReturning(pointcut = "selectAll()", returning = "retVal")
	public void afterReturningAdvice(Object retVal) {
		System.out.println("\nReturning:" + retVal.toString());
	}

	@AfterThrowing(pointcut = "selectAll()", throwing = "ex")
	public void AfterThrowingAdvice(IllegalArgumentException ex) {
		System.out.println("There has been an exception: " + ex.toString());
	}

	public void LogAppend(String msg) throws IOException {
		try {
			Files.write(Paths.get(path), ("\r" + msg).getBytes(), StandardOpenOption.APPEND);
		} catch (IOException e) {
			// exception handling left as an exercise for the reader
		}

	}

}