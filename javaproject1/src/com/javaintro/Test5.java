package com.javaintro;

public class Test5 {
	@Override
	protected void finalize()  {
		System.out.println("destroyed");
	}
	public static void main(String[] args) {
		Test5 t1 = new Test5();
		Test5 t2 = new Test5();
		Test5 t3 = new Test5();
		Test5 t4 = new Test5();
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		System.out.println();
		
		t1 = null;
		t2 = null;
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		
		System.gc();
	}

}
