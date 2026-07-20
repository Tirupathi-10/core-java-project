package com.languagefundamendals.methods;

import java.util.Scanner;

		public class LoneInterest {
			double calculateInterest(double principal,double rate,int time) {
				double interest=(principal*rate*time)/100;
				return interest;
				
			}

			 void main(String[] args) {
				System.out.println("main method started");
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the Principa Amount: ");
				double PA=sc.nextDouble();
				System.out.println("Enter the Rate of interest: ");
				double rate=sc.nextDouble();
				System.out.println("Enter the Time: ");
				int time=sc.nextInt();
				
				double Simpleinterest=calculateInterest(PA,rate,time);
				System.out.println("simple interest: "+Simpleinterest);
				
	}

}
