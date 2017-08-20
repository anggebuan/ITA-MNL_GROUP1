package com.oocl.allarra.HW9;

import java.io.IOException;
import java.util.Scanner;

public class Execute {
	public static void main(String[] args) {
		Execute e = new Execute();

		Scanner scan=new Scanner(System.in);
		System.out.println("input command: ");
		String temp = scan.nextLine();
		e.runExe(temp);
		scan.close();
	}
	public void runExe(String cmdPath) {		
		try {
			if(cmdPath.equals("notepad")) {
				System.out.println(cmdPath);
				Runtime.getRuntime().exec(cmdPath+".exe");}
			else if(cmdPath.equals("wmplayer")) {
				Runtime.getRuntime().exec("C:\\Program Files (x86)\\Windows Media Player\\" +cmdPath+".exe");
			}
			else
				throw new IOException();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Cant Locate Exe app");
		}
			
	}
}
