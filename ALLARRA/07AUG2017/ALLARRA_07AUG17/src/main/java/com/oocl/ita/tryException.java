package com.oocl.ita;

import java.io.PrintStream;
import java.io.PrintWriter;

public class tryException {
	public static void main(String[] args){
		test t1 = new test();
		
		try {
			t1.test();
		}catch(Ex1 ex) {
			System.out.println(ex);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
}
}
class classException extends Exception{}
class Ex1 extends classException{}
class Ex2 extends classException{}
class Ex3 extends classException{}
class test{
	void test() throws Ex1, Ex2, Ex3{
		throw new Ex1();
	}
}

