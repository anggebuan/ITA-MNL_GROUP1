package wk3exers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Wk3exer10Downloads {
	private static final int BUFFER_SIZE = 4096;


	static String dlPath = "C:\\Users\\Jossel\\Documents\\ITA\\js";
	static File f = new File(dlPath);
	
	public static void main(String[] args) throws IOException {
		Scanner inputURL = new Scanner(System.in);
		System.out.print("Enter URL: ");
		String url = inputURL.nextLine(); // https://en.wikipedia.org/wiki/Piano
		downloadFile(url, dlPath);
	}

	public static void downloadFile(String fileURL, String saveDir) throws IOException {
		URL url = new URL(fileURL);
		HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
		int responseCode = httpConn.getResponseCode();

		// always check HTTP response code first
		if (responseCode == HttpURLConnection.HTTP_OK) {
			String fileName = "";
			String disposition = httpConn.getHeaderField("Content-Disposition");
			String contentType = httpConn.getContentType();
			int contentLength = httpConn.getContentLength();

			if (disposition != null) {
				// extracts file name from header field
				int index = disposition.indexOf("Filename= ");
				if (index > 0) {
					fileName = disposition.substring(index + 10, disposition.length() - 1);
				}
			} else {
				// extracts file name from URL
				fileName = fileURL.substring(fileURL.lastIndexOf("/") + 1, fileURL.length());
			}

			System.out.println("\nFile Type: " + contentType);
			System.out.println("File Size: " + contentLength + " bytes");
			int count = 0; String fname = null;
			for (File file : f.listFiles()) {

				if (file.exists() ) {
					//System.out.println(file.getName());
					count++;
					
					 fname =  fileName + count;
					 //break;
				} else {
					 fname = fileName;
				}

			}
			//System.out.println("File Name: " + fileName + file);
			System.out.println("File Name: " + fname+"\n");

			// opens input stream from the HTTP connection
			InputStream inputStream = httpConn.getInputStream();
			
			String saveFilePath = saveDir + File.separator + fname;
			
			// opens an output stream to save into file
			FileOutputStream outputStream = new FileOutputStream(saveFilePath);

			int bytesRead = -1;
			byte[] buffer = new byte[BUFFER_SIZE];
			while ((bytesRead = inputStream.read(buffer)) != -1) {
				outputStream.write(buffer, 0, bytesRead);
			}

			outputStream.close();
			inputStream.close();

			System.out.println("File downloaded");
			System.out.println(saveFilePath);
			
		} else {
			System.out.println("No file to download. Server replied HTTP code: " + responseCode);
		}
		httpConn.disconnect();
	}

}