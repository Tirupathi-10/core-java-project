package com.languagefundamendals.Operators;

import java.util.Scanner;

public class TernaryOp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the Number:");
		 int num=sc.nextInt();
		 String result=(num >=0)?"positive":"negative";
		 
		 System.out.println("Result:"+result);
		 
		 System.out.println("Enter the marks:");
		 int marks=sc.nextInt();
		 
		 String grade=(marks>=90)?"A":
			 		  (marks>=75)?"B":
			 		  (marks>=60)?"C":
			 	      (marks>=40)?"D":"FAIL";
		 System.out.println("Grade:"+grade);
		
		
	}

}
