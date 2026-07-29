package com.languagefundamendals.Operators;

public class UnaryOp {

	public static void main(String[] args) {
		int a=25;
		int b=20;
		
		System.out.println(+a);
		System.out.println(-a);
		System.out.println(+b);
		System.out.println(-b);
		System.out.println(++a);//26
		System.out.println(++a);//27
		System.out.println(a++);//27---28
		System.out.println(a--);//28--27
		System.out.println(a--);//27--26
		System.out.println(--a);//25
		System.out.println(b--);//20--19
		System.out.println(b++);//19--20
		
		
		System.out.println(a+b);
		System.out.println(a-b);
		
		
		
		
		System.out.println(a-- + b++ + a++ + b--);
	    System.out.println(--b + a++ + b++ + b++ -a++ -b++);
	    System.out.println(a);
		System.out.println(b);
 	
        System.out.println(a++ -(--b) );
	   
	   
       System.out.println(a++ * b++);
	}

}
