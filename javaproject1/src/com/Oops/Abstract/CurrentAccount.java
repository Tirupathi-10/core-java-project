package com.Oops.Abstract;

public class CurrentAccount implements BankAccount {
	double balance = 10000;

	@Override
	public void deposit(double amount) {

		if (amount > 0) {
			balance = balance + amount;
			System.out.println("Deposited Amount: " + amount);
			System.out.println("Balance: " + balance);
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
		System.out.println("Current Account Balance: " + balance);
		System.out.println();

	}

	@Override
	public void miniStatement() {
		System.out.println("----- Mini Statement -----");
		System.out.println("Bank Name: " + BankAccount.BANK_NAME);
		System.out.println("Account Type: Current Account");
		System.out.println("Balance: " + balance);
		System.out.println("Thank you for choosing our bank");

	}
	@Override
	public void accountStatus() {
		System.out.println("Current Account Status: Active");
	}

}
