package com.LogicalStatements.loops;

import java.util.Scanner;

public class PerfectNum {

	 void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number To Find Perfect Or Not");
		int n=sc.nextInt();
		boolean status= perfectNum(n);
		if(status) {
			System.out.println("Number is a Perfect Number");
		}else {
			System.out.println("Number Is a Not Perfect Number");
		}
	}
	boolean perfectNum(int n) {
		int sum=0;
		boolean result=false;
		for(int i=1;i<=n/2;i++) {
			if(n % i==0) {
				sum+=i;
			}
		}
		if(sum==n) {
			result=true;
		}
		
		return result;
	}

}
