package com.firstWeek;

import java.util.ArrayList;

public class firstExam {
	static int value10B = 10;
	static Boolean a,b,c;	
	static int value = 10;
	
	public static void main(String[] args) {
		
		firstExam.question1();
		firstExam.question2(5);
		firstExam.question3(2, 2);
		firstExam.question4(3, 10);
		firstExam.question7(60);
		firstExam.question10A();
		firstExam.question10B();
		firstExam.question10C();
		firstExam.question10D();
		firstExam.question10E();
		firstExam.question6();
		//firstExam.question6a();
		
	}

	public static ArrayList<String> question1() {
		System.out.println("QUESTION 1:");	
		
		ArrayList<String> result =  new ArrayList<String>(); 
		
		int i = 1;
		for (int j = 0; j < 5; j = j + 2) {
			i = (i * i) + j;
		}
		switch (i) {
		case 3:
			System.out.println("zero");
			result.add("zero");
			break;
		case 13:
			System.out.println("one");
			result.add("one");
		case 175:
			System.out.println("two");
			result.add("two");
		default:
			System.out.println("default");
			result.add("default");
		}
		System.out.println("---------------" + "\n");
		return result;
		
		
	}

	public static int question2(int n) {
		System.out.println("QUESTION 2:\n");
		int F_0 = 1, F_1 = 1;
		int F_n = 0;
		/*System.out.println("Enter the number");
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt(); */
		for (int i = 1; i < n; i++) {
			F_n = F_0 + F_1;
			F_0 = F_1;
			F_1 = F_n;
		}
		System.out.println("F_n: "+F_n);
		System.out.println("\n---------------" + "\n");
		return F_n;
	}

	public static int question3(int inner, int outer) {
		
		System.out.println("QUESTION 3:\n");
		
		int result = 0;
		for (int i = 0; i < outer; i++) {
			for (int j = 0; j < inner; j++) {
				result = (result * result) + 1;
			}
		}
		System.out.println("result: "+result);
		System.out.println("\n---------------" + "\n");
		return result;
	}
	
	public static int question4(int x, int y) {
		
		System.out.println("QUESTION 4:\n");
		
		int count = 0;
		while (x < y)
		{
			System.out.println ("Hello");
			x = x + 1;
			y = y - 1;
			count++;
		}
		System.out.println("count: "+count);
		System.out.println("---------------" + "\n");
		return count;
	}
	

	public static int question6a() {
		
		System.out.println("QUESTION 6a:\n");
		double n =4;
		
		double i, j, sum = 0;
		
		for(i =1; i<=n; i++) {
			for(j =1; j<=n; j++) {
			sum = i/n + j/n;
			
			System.out.print(sum+" ");
			
		}
			System.out.print("\n");
		}
		System.out.println("\n\n---------------" + "\n");
		return (int) sum;
	}	
	
	public static double[][] question6() {
		
		System.out.println("QUESTION 6:\n");
		double n =4;
		double[][] num = new double [4][4];
		double i, j, sum = 0;
		
		for(i =1; i<=n; i++) {
			for(j =1; j<=n; j++) {
			sum = i/n + j/n;
			num[(int) i-1][(int) j-1] = sum;
			System.out.print(sum+",");
			
		}
			System.out.print("\n");
		}
		System.out.println("\n\n---------------" + "\n");
		return num;
	}
	
	public static int question7(int num) {
		
		System.out.println("QUESTION 7:\n");
		
		boolean done = false;
		int count=1;
		int current = num+2;
		while(!done){
			current=current/count;
			if(current%3 ==0) done=true;
			else if(current<1) 
				done=true;
			else
				count +=1;
			System.out.println(current);
		}
		System.out.println(count);
		
		System.out.println("\n---------------" + "\n");
		return count;
		}
	
	public static double question10A() {
		
		System.out.println("QUESTION 10A:\n");
		
		double count;
		int limit;
		count=9.0;
		limit=43/4;
		for(; count<=limit; count=count+0.5) {
			System.out.println("in for: " +  count);
		}
		System.out.println("after for: " + count);
		
		System.out.println("---------------" + "\n");
		return count;
	}
	public static int question10B() {
		
		System.out.println("QUESTION 10B:\n");
		
		System.out.println("Main before p1: " + value);
		value= p1(value);
		System.out.println("Main before p2: " + value);
		value= p2(value);
		System.out.println("Main at the end: " + value);
		System.out.println("-----------");
		int value=30;
		System.out.println("Main before p1: " + value);
		value= p1(value);
		System.out.println("Main before p2: " + value);
		value= p2(value);
		System.out.println("Main at the end: " + value);
		
		System.out.println("\n---------------" + "\n");
		return value;
	}
	static int p1(int input) {
		value = input * value;
		System.out.println("In p1: " + value);
		return value;
	}
	static int p2(int input) {
		int value = 5;
		value = input / value;
		System.out.println("In p2: " + value);
		
		
		return value;
	}
	public static int question10C() {
		
		System.out.println("QUESTION 10C:\n");
		int value = 5;
		int value2 = 1;
		int count = 0;
		while(value2<4) {
			for(;value>=value2;value--) {
				System.out.println("*");
				count++;
			}
			value2++;
		}
		System.out.print("Count of asterisks: " + count);
		
		System.out.println("\n\n---------------" + "\n");
		return count;
		
	}
	public static ArrayList<Boolean> question10D() {
		
		System.out.println("QUESTION 10D:\n");
		
		ArrayList<Boolean> result =  new ArrayList<Boolean>(); 
		a = true;
		b = false;
		c = false;
		System.out.println(a + " " + b +  " " + c + " ");
		do {
			if (b==c) b=a;
			else if(a == c) b = c;
			else a = c;
			System.out.println(a + " " + b +  " " + c + " ");
			result.add(a);
			result.add(b);
			result.add(c);
			
		}
		while(a || b || c);
		
		System.out.println("---------------" + "\n");
		return result;
	}
	
	public static String question10E() {

		System.out.println("QUESTION 10E: \n");
		
		int one = 1;
		int two = 2;
		int three = 3;
		String res = "";
		do {
			one ++;
			System.out.print("cart");
			res = res + "cart";
		}while(one<3);
		for(int i =0; i<two; i++) {
			System.out.print("o");
			res=res+"o";
		}while(true) {
			three++;
			if(three==5) {
				break;
			}
			System.out.print("n");
			res=res+"n";
		}
		
		System.out.println("\n\n---------------" + "\n");
		return res;
	}
	
	
}