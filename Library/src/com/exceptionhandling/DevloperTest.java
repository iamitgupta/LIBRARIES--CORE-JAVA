package com.exceptionhandling;

public class DevloperTest {

	public static void main(String[] args) {
		Developer d=new Developer();
		d=null;
		try {
			d.code();
		}
		catch(NullPointerException np) {
			System.out.println("ref not initiated");
		}
	}

}
