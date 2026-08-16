package com.LogicalStatements.loops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		boolean status=isPalin(n);
		if(status) {
			System.out.println("Given Number is Palindrome");
		}else {
			System.out.println("Given Number is Not a Palindrome");
		}
	}
	static boolean isPalin(int n) {
		boolean status=false;
		int temp=n;
		int rev=0;
		while(n!=0) {
			int rem=n%10;
			n=n/10;
			rev=rev*10+rem;
		}
		if(temp==rev) {
			status=true;
		}
		return status;
		
		
	}

}
