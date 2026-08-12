package com.LogicalStatements.loops;

import java.util.Scanner;

public class ProductofNum {

	 void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int pro=findProduct(n);
		System.out.println("Product of the Given Number is: "+pro);
	}
	 int findProduct(int n) {
		 int product=1;
		 int rem=0;
		 while(n!=0) {
			rem=n%10;
			product*=rem;
			n=n/10;
		 }
		 return product;
	 }

}
