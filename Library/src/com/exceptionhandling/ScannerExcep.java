package com.exceptionhandling;
import java.util.Scanner;

class Demo{
	public void division(int a,int b) {
		try {
			int c=a/b;
			System.out.println("Result = "+c);
		}
		catch(ArithmeticException ae) {
			System.out.println("Exception occured");
		}
	}
}
public class ScannerExcep {

	public static void main(String[] args) {
		
		System.out.println("Program started");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1st Number");
		int a=sc.nextInt();
		System.out.println("Enter 2nd Number");
		int b=sc.nextInt();
		
		try {
	
		Demo d=new Demo();
		d.division(a, b);
		}
		catch(ArithmeticException e) {
			
			System.out.println("Exception");
		}


		
		
		System.out.println("Program ended");
		


	}

}
