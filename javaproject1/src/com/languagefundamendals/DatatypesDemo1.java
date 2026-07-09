package com.languagefundamendals;
import java.math.BigInteger;
import java.math.BigDecimal;

public class DatatypesDemo1 {
	Integer i = 2433;
	Character c='C';
	
	String s="Tiru";
	StringBuffer sb1=new StringBuffer("Hello");
	StringBuilder sb2= new StringBuilder("World");
	
	BigInteger bi= new BigInteger("9876543212345678765432345678876542345");
	BigInteger bi1= new BigInteger("9876543212345678765432345678876542340");
	BigDecimal bd=new BigDecimal("2345678900987654.09873456");
	BigDecimal bd1=new BigDecimal("2345678900987654.09873456");
	

	public static void main(String[] args) {
		DatatypesDemo1 t1=new DatatypesDemo1();
		System.out.println("main method started");
		System.out.println(t1.i);
		System.out.println(t1.c);
		System.out.println(t1.s);
		System.out.println(t1.sb1);
		System.out.println(t1.sb2);
		System.out.println(t1.bi);
		System.out.println(t1.bd);
		System.out.println(t1.bi.add(t1.bi1));
		System.out.println(t1.bi.multiply(t1.bi1));
		System.out.println(t1.bi.mod(t1.bi1));
		System.out.println(t1.bd.add(t1.bd1));
		System.out.println(t1.bd.multiply(t1.bd1));
		System.out.println(t1.bd.divide(t1.bd1));
		System.out.println(t1.bi.max(t1.bi1));
		System.out.println(t1.bi.subtract(t1.bi1));
		
		
	}

}
