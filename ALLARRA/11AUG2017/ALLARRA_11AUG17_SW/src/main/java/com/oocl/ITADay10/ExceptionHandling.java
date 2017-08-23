package com.oocl.ITADay10;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		try {
			x(1);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
		
	}
	public static int x(int z) throws IllegalAccessException {
		if(z==1) {
			throw new IllegalAccessException();
		}
		return z;
	}
	
	public static void close()
	{
		System.out.print("Closing");
	}
}

