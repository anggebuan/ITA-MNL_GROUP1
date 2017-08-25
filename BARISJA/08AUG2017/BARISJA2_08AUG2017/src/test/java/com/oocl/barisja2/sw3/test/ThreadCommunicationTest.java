package com.oocl.barisja2.sw3.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.oocl.barisja2.sw3.ThreadCommunication;

public class ThreadCommunicationTest {

	String output = "YU: May I help you?\n" + 
			"CARTER: We'll be asking the questions, old man. Who are you?\n" + 
			"YU: Yu.\n" + 
			"CARTER: No, not me, you.\n" + 
			"YU: Yes, I am Yu.\n" + 
			"CARTER: Just answer the damn questions, who are you?\n" + 
			"YU:  I have told you Yu\n" + 
			"CARTER: Are you deaf?\n" + 
			"YU: No, Yu is blind.\n" + 
			"CARTER: I'm not blind, you blind.\n" + 
			"YU: That is what I just said.\n" + 
			"CARTER: You just said what?\n" + 
			"YU: I did not say what, I said Yu!\n" + 
			"CARTER: That's what I'm askin' you!\n" + 
			"YU: And Yu is answering!";
	
	@Test
	public void test() {
		ThreadCommunication tc = new ThreadCommunication();
		tc.run();
		System.out.println(tc.getOutput());
		assertEquals(tc.getOutput(), output);
		
		
	}

}
