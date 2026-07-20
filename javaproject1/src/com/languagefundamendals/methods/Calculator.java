package com.languagefundamendals.methods;

import java.util.Scanner;

public class Calculator {
	int add(int a,int b) {
		return a+b;
	}
	int sub(int a, int b) {
		return a-b;
	}
	int mul(int a,int b) {
		return a*b;
	}
	int div(int a,int b) {
		return a/b;
	}

	public static void main(String[] args) {
		Calculator c=new Calculator();
		Scanner sc=new Scanner(System.in);
		System.out.println("Simple Input");
		System.out.println("Enter the First Number: ");
		int a=sc.nextInt();
		System.out.println("Enter the Second Number: ");
		int b=sc.nextInt();
		int addition=c.add(a, b);
		int substraction=c.sub(a, b);
		int multiplication=c.mul(a, b);
		int division=c.div(a, b);
		System.out.println("Simple Output");
		System.out.println("Addition: "+addition);
		System.out.println("Substraction: "+substraction);
		System.out.println("Multiplication: "+multiplication);
		System.out.println("Division: "+division);
		
	}

}
