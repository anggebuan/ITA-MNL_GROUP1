package com.oocl.tengkh.hw5;

import java.sql.Connection;

public class ClassInitDestroy {
	
	private String connection;

	public void getConnection() {
		System.out.println("Connection Status: " + connection );
	}

	public void setConnection(String connection) {
		this.connection = connection;
	}
	
	public void init() {
		System.out.println("Connection is starting...");
	}
	
	public void destroy() {
		System.out.println("Connection destroyed...");
	}

}
