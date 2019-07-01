package com.exceptionhandling;

public class Arith {

	public static void main(String[] args) {
		System.out.println("program started");
		try {
			System.out.println("Inside try block");
			System.out.println(10/0);
		}
		catch(ArithmeticException ae) {
			System.out.println("Something went wrong");
			System.out.println(ae);
		}
		System.out.println("Program ended");
	}

}
