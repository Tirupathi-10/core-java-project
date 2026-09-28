package com.ExceptionHandling;

import java.util.Scanner;

public class BankingExce {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        try {

            int senderAccount = 1001;
            int receiverAccount = 1002;

            double senderBalance = 10000;
            double receiverBalance = 5000;

            
            System.out.print("Enter Sender Account Number: ");
            int sender = sc.nextInt();

            
            System.out.print("Enter Receiver Account Number: ");
            int receiver = sc.nextInt();

            System.out.print("Enter Transfer Amount: ");
            double amount = sc.nextDouble();

            if (sender != senderAccount) {
                throw new Exception("Invalid Sender Account Number");
            }

            if (receiver != receiverAccount) {
                throw new Exception("Invalid Receiver Account Number");
            }

            if (amount <= 0) {
                throw new Exception("Transfer amount must be greater than zero");
            }


            if (amount > senderBalance) {
                throw new Exception("Insufficient Balance");
            }


            senderBalance = senderBalance - amount;


            receiverBalance +=amount;


            System.out.println("----- Transaction Successful -----");
            System.out.println("Sender Account   : " + sender);
            System.out.println("Receiver Account : " + receiver);
            System.out.println("Transferred      : ₹" + amount);
            System.out.println("Sender Balance   : ₹" + senderBalance);
            System.out.println("Receiver Balance : ₹" + receiverBalance);

        } 
        catch (Exception e) {
            System.out.println("Transaction Failed: " + e.getMessage());
        }

        sc.close();
	}

}
