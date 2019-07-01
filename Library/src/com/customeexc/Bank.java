package com.customeexc;

public class Bank {
	private int pin=1234;
	private double balance;
	
	public void setBalance(double balance) {
		this.balance=balance;
	}
	
	public double getBalance(int pin) throws PinException {
		if(this.pin==pin) {
			return balance;
		}
		else {
			PinException p=new PinException();
			throw p;
	
		}
	}

}
