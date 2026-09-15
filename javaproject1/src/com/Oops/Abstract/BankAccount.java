package com.Oops.Abstract;

public interface BankAccount {

	public static final String BANK_NAME = "State Bank of India";

	void deposit(double amount);

	void withdraw(double amount);

	void checkBalance();

	void miniStatement();

	default void bankRules() {
		System.out.println("WelCome To " + BankAccount.BANK_NAME);
		System.out.println();
		System.out.println("--------Bank Rules---------:");
		System.out.println("1. Maintain minimum balance");
		System.out.println("2. Provide valid KYC documents");
		System.out.println("3. Do not share ATM PIN or OTP");
		System.out.println("4. Follow bank transaction limits");
		System.out.println("---------------------------------");
		welcome();

	}
	default void accountStatus() {
	    System.out.println("Account Status: Active");
	    System.out.println("Account is ready for transactions");
	    System.out.println("--------------------------------");
	}

	static void bankTimings() {
		System.out.println("Bank working hours: 9 AM to 4 PM");
		System.out.println("--------------------------------");
	}

	private static void welcome() {
		System.out.println("Thank you for banking with us");
	}
}