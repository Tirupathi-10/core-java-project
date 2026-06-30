package com.chartgpt;

public class Bank {
	static String bankname;
	static String branch;
	String accountHolderName;
	int  accountNumber;
	float balance;
	static {
		bankname ="State Bank of India";
		branch = "Vizag";
	}

	public static void main(String[] args) {
		Bank b = new Bank();
		Bank b1 = new Bank();
		Bank b2 = new Bank();
		
		b.accountHolderName = "Vasu";
		b.accountNumber =123456789;
		b.balance = 12312.34f;
		b1.accountHolderName = "Tiru";
		b1.accountNumber =124566789;
		b1.balance = 124554.34f;
		b2.accountHolderName = "Ravi";
		b2.accountNumber =567266789;
		b2.balance = 22233.34f;
		b.display();
		b1.display();
		b2.display();
	}
	void display() {
		System.out.println("Bank Name:" + bankname);
		System.out.println("Branch:" + branch);
		System.out.println("AccountHolderName:" +accountHolderName);
		System.out.println("Account Number:" +accountNumber);
		System.out.println("Balance:" +balance);
	}

}
