package com.customeexc;

public class BankTest {

	public static void main(String[] args) {
		Bank b=new Bank();
		b.setBalance(5000);
		try {
			System.out.println(b.getBalance(123224));
		}catch(PinException p) {
			System.out.println("Pin is Incorrect");
			p.printStackTrace();
		}
		
	}

}
