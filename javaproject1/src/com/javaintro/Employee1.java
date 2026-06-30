package com.javaintro;

public class Employee1 {
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object is eligible for Garbage Collection");
		System.out.println("Garbage Collector Called");
		System.out.println("Object Destroyed");
	}

	public static void main(String[] args) {
		Employee1 e = new Employee1();
		Employee1 e1=new Employee1();
		Employee1 e2=new Employee1();
		System.out.println(e1);
		System.out.println(e);
		
		
		e= null;
		e1=null;
		System.gc();
		System.out.println(e2);
	
	
	}

}