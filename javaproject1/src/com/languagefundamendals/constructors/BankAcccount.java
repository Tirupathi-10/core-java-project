package com.languagefundamendals.constructors;

public class BankAcccount {
	String accountHolder;
	long accountNumber;
	double balance;
	
	public BankAcccount() {
		this("Unknown");
		
	}
	public BankAcccount(String accountHolder) {
	this(accountHolder,0);

	}
	public BankAcccount(String accountHolder, long accountNumber) {
		this(accountHolder,accountNumber,0.0);
	}
	
	public BankAcccount(String accountHolder, long accountNumber, double balance) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public static void main(String[] args) {
		BankAcccount b=new BankAcccount();
		BankAcccount b1=new BankAcccount("Tiru");
		BankAcccount b2=new BankAcccount("Tiru",12345678765l);
		BankAcccount b3=new BankAcccount("Tiru",123456787651l,50000);
		b.display();
		b1.display();
		b2.display();
		b3.display();
		
	}
	void display() {
		System.out.println("Account Holder:"+accountHolder);
		System.out.println("Account Number:"+accountNumber);
		System.out.println("Balance:"+balance);
		System.out.println();
	}

}
