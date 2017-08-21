package com.oocl.barceja2.hw1;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class Assignment10 {
	private static final int BUFFER_SIZE = 1024 * 10;
	private static final int ZERO = 0;
	private final static byte[] dataBuffer = new byte[BUFFER_SIZE];

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			URL urlObject = new URL("http://www.cnblogs.com/libingql/archive/2012/03/30/2426198.html");

			String pageContent = null;
			final StringBuilder sb = new StringBuilder();

			final BufferedInputStream in = new BufferedInputStream(urlObject.openStream());

			int bytesRead = ZERO;

			while ((bytesRead = in.read(dataBuffer, ZERO, BUFFER_SIZE)) >= ZERO) {
				sb.append(new String(dataBuffer, ZERO, bytesRead));
			}
			pageContent = sb.toString();

			if (pageContent != null) {
				System.out.println(pageContent);
			} else {
				System.out.println("Error!");
			}
		} catch (MalformedURLException e) {
			System.out.println("Check you the url!");
		}

	}

}
