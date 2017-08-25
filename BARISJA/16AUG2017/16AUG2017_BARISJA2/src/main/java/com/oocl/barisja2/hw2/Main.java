package com.oocl.barisja2.hw2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "NetworkManagerBean.xml" });

		NetworkManager cust = (NetworkManager) context.getBean("networkManager");
		context.destroy();
	}
}

class NetworkManager {

	String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void init() throws Exception {
		System.out.println("Connected to: " + url);
	}

	public void destroy() throws Exception {
		System.out.println("Disconnected to: " + url);
	}

}