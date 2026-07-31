package com.LogicalStatements;

import java.util.Scanner;

public class LoneLS {
	String loneinfo(int age,double salary,int cibil) {
		String result="";
		if(age<21) {
			result= "Rejected: Age should be 21 or above";
		}else if(salary<30000) {
			result= "Rejected: Salary Should be at least 30000";
		}else if(cibil<750) {
			result="Rejected: Cibil Score Should be 750 or above";
		}else {
			result="Loan Approved";
		}
		return result;
	}

	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age:");
		int age = sc.nextInt();
		System.out.println("Enter the Salary:");
		double sal = sc.nextDouble();
		System.out.println("Enter the Cibil Score:");
		int cibil = sc.nextInt();
		
		String result=loneinfo(age,sal,cibil);
		System.out.println(result);

		

	}

}
