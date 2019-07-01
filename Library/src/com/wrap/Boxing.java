package com.wrap;

public class Boxing {

	public static void main(String[] args) {
		//primitive to object
		int a=20;
		double d=25.20;
		
		
		//using new keyword
		Integer a1=new Integer(a);
		System.out.println(a1);
		System.out.println(a1.hashCode());
		
		
		//using method ie. valueof()
		
		Double d1=Double.valueOf(d);
		System.out.println(d1);
		System.out.println(d1.toString());
		
		//autoboxing
		
		Integer a3=a;
		System.out.println(a3);
		System.out.println(a3.toString());
		
		
	}

}
