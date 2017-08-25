package com.example.demos;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NetworkManager {
	String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void init() {
		System.out.println("Initializing http connection object...");
	}

	public void dest() {
		System.out.println("Closing http connection object...");
	}
}