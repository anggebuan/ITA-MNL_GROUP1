package com.oocl.tengkh.hw9;

import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class homework9_Java_cmd {

	public static void main(String[] args) {

		System.out.println(
				"Choose [1] to open command prompt\nChoose [2] to open notepad\nChoose [3] to open media player");
		System.out.println("\nInput your choice:");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();

		switch (input) {
		case 1:
			CommandPrompt();
			break;

		case 2:
			Notepad();
			break;

		case 3:
			WMPlayer();
			break;

		default:
			System.out.println("Input value is not included in choices");
			break;
		}

	}

	public static void CommandPrompt() {
		Runtime run = Runtime.getRuntime();
		try {
			run.exec("cmd.exe /c start");
			System.out.println("You've open command prompt");
		} catch (java.io.IOException e) {
			System.out.println("Caught IOException: " + e.getMessage());
		}

	}

	public static void Notepad() {

		Runtime run = Runtime.getRuntime();
		try {
			run.exec("notepad");
			System.out.println("You've open notepad");
		} catch (java.io.IOException e) {
			System.out.println("Caught IOException: " + e.getMessage());
		}
	}
	
	public static void WMPlayer() {
		String[] cmd = {"C:\\Program Files (x86)\\Windows Media Player\\wmplayer.exe"};
		Runtime run = Runtime.getRuntime();
		try {
			run.exec(cmd);
			System.out.println("You've open  windows media player");
		} catch (java.io.IOException e) {
			System.out.println("Caught IOException: " + e.getMessage());
		}
	}

}
