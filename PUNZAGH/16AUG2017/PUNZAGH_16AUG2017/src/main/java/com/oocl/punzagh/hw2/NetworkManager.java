package com.oocl.punzagh.hw2;

public class NetworkManager {

	private HttpConnection httpcon;
	
	
	public HttpConnection getHttpcon() {
		return httpcon;
	}


	public void setHttpcon(HttpConnection httpcon) {
		this.httpcon = httpcon;
	}


	public void init() {
		httpcon.open();
	}
	
	public void destroy() {
		httpcon.close();
	}
}
