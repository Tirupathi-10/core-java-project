package com.Oops.Abstract;

public class AccountInfo {

	public static void main(String[] args) {
		BankAccount sa = new SavingsAccount();
		System.out.println();
		sa.bankRules();
		BankAccount.bankTimings();
		sa.accountStatus();
		sa.deposit(5000);
		sa.withdraw(3000);
		sa.checkBalance();
		sa.miniStatement();
		System.out.println("==============================");
		System.out.println();

		BankAccount ca = new CurrentAccount();
		ca.bankRules();
		BankAccount.bankTimings();
		ca.accountStatus();
		ca.deposit(1000);
		ca.checkBalance();
		ca.withdraw(3000);
		ca.checkBalance();
		ca.miniStatement();
	}

}
