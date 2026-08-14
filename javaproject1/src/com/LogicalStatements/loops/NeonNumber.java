package com.LogicalStatements.loops;

import java.util.Scanner;

public class NeonNumber {

	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num = sc.nextInt();
		
		int n=num*num;
		int sum=0;
		 for(;n>0;) {
			  int rem=n%10;
			 sum=sum+rem;
			 n=n/10;
		 }
		 if(num==sum) {
			 System.out.println("Given Number is a Neon Number");
		 }else {
			 System.out.println("Given Number Is a Not Neon Number");
		 }

	}
}
