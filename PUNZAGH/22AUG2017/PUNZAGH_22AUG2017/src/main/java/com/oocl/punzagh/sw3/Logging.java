package com.oocl.punzagh.sw3;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logging {

	@Pointcut("execution(* com.oocl.punzagh.sw3.*.*(..))")
	private void selectAll() {
	}

	File f = new File("src/main/java/com/oocl/punzagh/sw3/log.txt");
	InetAddress ip;

	public String getInfo() {
		try {
			this.ip = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "IP: " + ip.getHostAddress() + ", Host: " + ip.getHostName();
	}

	@Before("selectAll()")
	public void beforeAdvice() {
		String str = getInfo();
		writer(str);
	}

	@After("selectAll()")
	public void afterAdvice() {
		String str = getInfo();
		writer(str);
	}

	public void writer(String str) {
		try {
			Files.write(Paths.get("C:/Users/Mistelteyn/log.txt"), (str).getBytes(), StandardOpenOption.APPEND);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
