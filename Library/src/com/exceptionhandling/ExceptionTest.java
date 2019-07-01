package com.exceptionhandling;

public class ExceptionTest {
	public static int run(int a) {
		System.out.println("Called run() method");
		int b=5;
		int c=b/a;
		return c;
	}

	public static void main(String[] args) {
		System.out.println("Program started");
		run(0);
		System.out.println("Program ended");
	}

}
