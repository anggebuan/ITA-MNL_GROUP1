package com.oocl.barisja.hw9;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		new processApp("notepad");
		new processApp("C:/Program Files (x86)/Windows Media Player/wmplayer");
	}
}


class processApp implements Runnable{

	String app;
	
	public processApp(String app) {
		this.app = app;
		new Thread(this).start();
	}
	
	public void run() {
		
		Runtime runt = Runtime.getRuntime();
		try {
			Process pr = runt.exec(app);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
}
