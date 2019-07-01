package com.exceptionhandling;

public class ThrowsTest {
	public static void run(int a,int b) throws Exception {
		play(a,b);
	}
	public static void play(int a,int b)throws Exception {
		division(a,b);
	}
	public static void division(int a,int b)throws Exception {
		int c=a/b;
		System.out.println(c);
	}


	public static void main(String[] args) {
		System.out.println("Program started");

		try {
			run(10,0);
		}catch(Exception e) {
			System.err.println("Error occured");
		}
		System.out.println("Program ended ");
	}

}
