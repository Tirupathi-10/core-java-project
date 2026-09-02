package com.AccessModifiers02;

import com.AccessModifiers01.Test01;

public class Test03 extends Test01 {

	public static void main(String[] args) {
		Test01 t = new Test01();

		Test03 t1 = new Test03();

		System.out.println(t.id2);
		System.out.println(t.name2);
		t.method3();

		System.out.println(t1.id3);
		System.out.println(t1.name3);
		t1.method4();

		System.out.println(t1.getClass());
	}

}
