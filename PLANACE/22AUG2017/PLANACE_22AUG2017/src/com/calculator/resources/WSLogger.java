package com.calculator.resources;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Date;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class WSLogger {

	File logDir = new File("D:\\WSlogs");
	File logsTxt = new File("D:\\WSlogs\\logs.txt");

	@Pointcut("execution(* com.calculator.resources.CalculatorMethods.addition(..))")
	private void add() {
	}

	@Pointcut("execution(* com.calculator.resources.CalculatorMethods.subtraction(..))")
	private void sub() {
	}

	@Pointcut("execution(* com.calculator.resources.CalculatorMethods.multiply(..))")
	private void mul() {
	}

	@Pointcut("execution(* com.calculator.resources.CalculatorMethods.squareRoot(..))")
	private void sqrt() {
	}

	@After("add()")
	public void afterAdd() throws IOException {
		writeIntolog("addition");
	}

	@After("sub()")
	public void afterSub() throws IOException {
		writeIntolog("subtraction");
	}

	@After("mul()")
	public void afterMultiply() throws IOException {
		writeIntolog("multiply");
	}

	@After("sqrt()")
	public void afterDivide() throws IOException {
		writeIntolog("squareRoot");
	}

	InetAddress addrss;

	public void writeIntolog(String methodName) throws IOException {
		Date date = new Date();
		String text = "Someone used " + methodName + " " + date.toString() + " " + addrss.getLocalHost()
				+ System.lineSeparator();
		if (!logDir.exists()) {
			logDir.mkdir();
			logsTxt.createNewFile();
			Files.write(Paths.get(logsTxt.getAbsolutePath()), text.getBytes(), StandardOpenOption.APPEND);
		} else {
			if (!logsTxt.exists()) {
				logsTxt.createNewFile();
				Files.write(Paths.get(logsTxt.getAbsolutePath()), text.getBytes(), StandardOpenOption.APPEND);
			} else {
				Files.write(Paths.get(logsTxt.getAbsolutePath()), text.getBytes(), StandardOpenOption.APPEND);
			}
		}
	}
}
