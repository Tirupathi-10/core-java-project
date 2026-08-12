package com.LogicalStatements.loops;

import java.util.Scanner;

public class DigitCount {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=s.nextInt();
		int count= findCount(n);
		System.out.println("Digit Count of a Given Number is:"+count);
	}
	static int findCount(int n) {
		int count=0;
		while(n>0) {
			n=n/10;
			count++;
		}
		return count;
	}

}
