package com.oocl.punzagh.sw2;

public class MainApp {
public static void main(String[] args) {
	DirectoryExplorerService directoryExplorerService = new DirectoryExplorerService();
	DirectoryExplorer directoryExplorer = directoryExplorerService.getDirectoryExplorerPort();
	System.out.println(directoryExplorer.getDirectories());
}
	
}
