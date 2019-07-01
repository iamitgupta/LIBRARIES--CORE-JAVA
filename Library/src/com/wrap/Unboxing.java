package com.wrap;

public class Unboxing {

	public static void main(String[] args) {
		//object to primitive
		
		Integer i1=new Integer(20);
		
		//using obj.<datatype>Value()
		
		int i=i1.intValue();
		System.out.println(i);
		
		//autoUnboxing
		int ai=i1;
		System.out.println(ai);
	}

}
