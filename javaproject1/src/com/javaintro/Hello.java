package com.javaintro;

public class Hello {
	static int count=0;
	{
		count++;
	}

	public static void main(String[] args) {
//		Hello h = new Hello();
//		Hello h1 = new Hello();
//		Hello h2 = new Hello();
//		Hello h3 = new Hello();
//		Hello h4= new Hello();
//		Hello h5=new Hello();
		System.out.println("Number of Objects:"+count);
	}

}
