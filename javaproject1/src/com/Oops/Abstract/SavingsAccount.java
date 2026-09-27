package com.Oops.Abstract;

public class SavingsAccount implements BankAccount {
	double balance;

	@Override
	public void deposit(double amount) {

		if (amount > 0) {
			balance = balance + amount;
			System.out.println("Deposited Amount: " + amount);
		} else {
			System.out.println("Invalid Amount");
		}

	}

	@Override
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance = balance - amount;
			System.out.println("Withdraw Amount: " + amount);
		} else {
			System.out.println("Insufficient Balance");
		}
	}

	@Override
	public void checkBalance() {
		System.out.println("Savings Account Balance: " + balance);
		System.out.println();

	}

	@Override
	public void miniStatement() {
		System.out.println("----- Mini Statement -----");
		System.out.println("Bank Name: " + BankAccount.BANK_NAME);
		System.out.println("Account Type: Savings Account");
		System.out.println("Balance: " + balance);
		System.out.println("Thank you for choosing our bank");

	}

}
