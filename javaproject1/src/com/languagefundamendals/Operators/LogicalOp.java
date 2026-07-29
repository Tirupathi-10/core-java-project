package com.languagefundamendals.Operators;

public class LogicalOp {

	public static void main(String[] args) {
		int a=250;
		int b=300;
		int c=100;
		System.out.println("------&&-------");
		System.out.println(true&&true);
		System.out.println(true&&false);
		System.out.println(false&&true);
		System.out.println(false&&false);
		System.out.println();
		
		System.out.println(a<b&&b>c);
		System.out.println(a>c&&a>b);
		System.out.println(a>b&&c<a);
		System.out.println(a>b&&c>a);
		System.out.println();
		
		System.out.println(a++>b++&&++a<++b);
		System.out.println(++a<++b&&++c<++a);
		System.out.println("------||-------");
		System.out.println(true||true);//true
		System.out.println(true||false);//true
		System.out.println(false||true);//true
		System.out.println(false||false);//false
	}

}
