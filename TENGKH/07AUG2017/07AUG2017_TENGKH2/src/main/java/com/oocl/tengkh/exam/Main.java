package com.oocl.tengkh.exam;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	private int num;
	public  ArrayList<String> Exercise1() {
		int i = 1;
		ArrayList<String> arrayList = new ArrayList<String>();
		for (int j = 0; j < 5; j = j + 2) {
			i = (i*i) + j;
		}
		switch (i) {
		case 3:
			System.out.println("zero");
			arrayList.add("Zero");
			break;
		case 13:
			System.out.println("one");
			arrayList.add("one");
		case 175:
			System.out.println("two");
			arrayList.add("two");
		default:
			System.out.println("default");
			arrayList.add("default");
		}
		return arrayList;
	}
	
	public int Exercise2(int n) {
		Scanner scan = new Scanner(System.in);
		int F0 = 1, F1 = 1, Fn = 0;
		System.out.println("Enter a number: ");
		n = scan.nextInt();
		for (int i = 1; i < n; i++) {
			Fn = F0 + F1;
			F0 = F1;
			F1 = Fn;
		}
		System.out.println(Fn);
		return Fn;
	}
	
	public int Exercise3() {
		int inner = 2, outer = 2, result = 0;
		for (int i = 1; i < outer; i++) {
			for (int j = 0; j<inner; j++) {
				result = (result*result)+1;
			}
		}
		return result;
	}
	
	public ArrayList<String> Exercise4() {
		ArrayList<String> arrayList2 = new ArrayList<String>();
		int x =3;
		int y=10;
		while(x<y) {
			System.out.println("Hello");
			arrayList2.add("Hello");
			x = x + 1;
			y = y - 1;
		}
		return arrayList2;
		
	}
	
	int integer_value = 60;
	public int Exercise7(int integer_value) {
		boolean done = false;
		int count = 1;
		int current = integer_value + 2;
		while(!done) {
			current = current/count;
			if(current % 3 == 0) {
				done = true;
			}
			else if (current<1) {
				done = true;
			}
			else {
				count +=1;
			}
			System.out.println(current);
		}
		System.out.println(count);
		return count;
	}
	
	public double Exercise10_A() {
		double count;
		int limit;
		count = 9.0;
		limit = 43/4;
		for(;count <= limit; count = count + 0.5) {
			System.out.println("in for: " + count);
		}
		System.out.println("after for: " + count);
		return count;
	}
	
	int value = 10;
	public ArrayList<Integer> Exercise10_B() {
		ArrayList<Integer> arrayInteger = new ArrayList<Integer>();
		System.out.println("Main before p1: " + value);
		value = p1(value);
		System.out.println("Main before p2: " + value);
		value = p2(value);
		System.out.println("Main at the end: " + value);
		arrayInteger.add(value);
		System.out.println("-------------");
		int value = 30;
		System.out.println("Main before p1: " + value);
		value = p1(value);
		System.out.println("Main before p2: " + value);
		value = p2(value);
		System.out.println("Main before end: " + value);
		arrayInteger.add(value);
		return arrayInteger;
	}
	
	public int p1(int input) {
		value = input * value;
		System.out.println("In p1: " + value);
		return value;
	}
	
	public int p2(int input) {
		int value = 5;
		value = input / value;
		System.out.println("In p2: " + value);
		return value;
	}
	
	public ArrayList<String> Exercise10_C() {
		ArrayList<String> arrayList = new ArrayList<String>();
		int value = 5;
		int value2 = 1;
		while(value2<4) {
			for(;value>=value2;value--) {
				arrayList.add("*");
				System.out.println("*");
			}
			value2++;
		}
		return arrayList;
	}
	
	boolean a,b,c;
	public ArrayList<Boolean> Exercise10_D() {
		ArrayList<Boolean> arrayList1 = new ArrayList<Boolean>();
		a = true;
		b = false;
		c = false;
		System.out.println(a + "," + b + "," + c);
		do {
			if(b == c)
				b = a;
			else if (a == c)
				b = c;
			else
				a = c;
			System.out.println(a + "," + b + "," + c);
		}
		while (a||b||c);
		arrayList1.add(a);
		arrayList1.add(b);
		arrayList1.add(c);
		return arrayList1;
	}
	
	/*public String[] Execercise10e(int x, int y, int z) {
		String[] a = new String[3];
		int one = x, two = y, three = z;
		do {
			one++;
			a[0] += "cart";
			System.out.println("cart");
		}
		while(one < 3);
		for(int i = 0; i<two; i++) {
			a[1] += "o";
			System.out.println("o");
		}
		while(true) {
			three++;
			if(three == 5) {
				break;
			}
			System.out.println("n");
			a[2] +="n";
		}
		return a;
	}
*/	
	
	public ArrayList<String> Exercise10_E(){
		ArrayList<String> arr = new ArrayList<String>();
		int one = 1, two = 2, three = 3;
		do {
			one++;
			System.out.println("cart");
			arr.add("cart");
		}while(one<3);
		for(int i = 0; i<two; i++) {
			System.out.println("o");
			arr.add("o");
		}
		while(true) {
			three ++;
			if (three == 5) {
				break;
			}
			System.out.println("n");
			arr.add("n");
		}
		return arr;
	}

}
