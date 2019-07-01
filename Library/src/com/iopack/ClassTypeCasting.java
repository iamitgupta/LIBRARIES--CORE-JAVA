package com.iopack;

class SuperClass{
	public void run() {
		System.out.println("Running");
	}
}
class Subclass extends SuperClass{
	public void play() {
		System.out.println("Playing");
	}
}


public class ClassTypeCasting {

	public static void main(String[] args) {
		//upcasting
		
		SuperClass s1=new Subclass();
		s1.run();
		
		
		
		//downcasting
		
		Subclass s2=(Subclass) s1;
		s2.run();
		s2.play();
		
		//trying to downcast superclass
		SuperClass s=new Subclass();

		
		Subclass s5=(Subclass) s;
		
	}

}
