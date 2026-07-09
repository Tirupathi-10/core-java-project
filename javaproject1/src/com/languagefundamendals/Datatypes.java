package com.languagefundamendals;

public class Datatypes {
	byte b = (byte)129;
	short s =(short)37687;
	int i=(int)2147483647355L;
	long l=1234567890987654323L;
	float f=3.509999489f;
	double d = 9.38325079209;
	char c = 99;
	boolean bo=true;
	double d1=2147483647;

	public static void main(String[] args) {
		Datatypes t = new Datatypes();
		System.out.println("Byte: "+t.b);
		System.out.println("short: "+t.s);
		System.out.println("int: "+t.i);
		System.out.println("long: "+t.l);
		System.out.println("float: "+t.f);
		System.out.println("double: "+t.d);
		System.out.println("char: "+t.c);
		System.out.println("boolean: "+t.bo);
		System.out.println("double: "+t.d1);
		if(t.bo) {
			System.out.println("hello world");
		}
	}

}
