package com.languagefundamendals.Operators;

public class Swapping {

	public static void main(String[] args) {
		int a =10;
		int b=20;
		System.out.println("Before Swapping");
		System.out.println(a);
		System.out.println(b);
		
		a=a+b;//--->10+20=30
		b=a-b;//--->30-10=20
		a=a-b;//--->30-20=10
		System.out.println("after Swapping");
		System.out.println(a);
		System.out.println(b);
		
		
		int temp=a;
		a=b;
		b=temp;
		System.out.println("with temp");
		System.out.println(a);
		System.out.println(b);
	}

}
