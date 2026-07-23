package com.javaintro;

public class Bank {
	static int count=0;
	long acNumber;
	static String ifscCode="SBIN000820";
	double balance;
	static String bankName="State Bank of India";
	{
		count++;
	}
	public static void main(String[] args) {
		Bank b=new Bank();
		b.acNumber=1001201;
		b.balance=76137;
		Bank b1= new Bank();
		b1.balance=23456;
		Bank b2=new Bank();
		b2.balance=2345;
		System.out.println("IFSC code:"+ifscCode);
		System.out.println(bankName);
		System.out.println(b.acNumber);
		System.out.println("account Number:"+count+(b.acNumber));
		System.out.println("account Number:"+count+(b1.acNumber));
		System.out.println("account Number"+count+(b2.acNumber));
	}

}
