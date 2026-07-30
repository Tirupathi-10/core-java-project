package com.languagefundamendals.Operators;

public class TernaryOp1 {

	public static void main(String[] args) {
		int a=90;
		String result=(a>=0)?"Positive":"Negative";
		System.out.println("Result:"+result);
		
		int marks=35;
		String Grade=(marks>=90)?"A":(marks>=75)?"B":(marks>=60)?"C":(marks>=40)?"D":"fail";
		System.out.println("Grade:"+Grade);
	}

}
