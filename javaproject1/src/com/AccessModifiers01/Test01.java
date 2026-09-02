package com.AccessModifiers01;

public class Test01 {
	private int id = 101;
	private String name = "Tiru";

	int id1 = 10;
	String name1 = "Raju";

	public int id2 = 100;
	public String name2 = "Sai";

	protected int id3 = 909;
	protected String name3 = "John";

	protected void method4() {
		System.out.println("Method---4");
	}

	public void method3() {
		System.out.println("Method---3");
	}

	private void method1() {
		System.out.println("methdo 1");
	}

	void method2() {
		System.out.println("Method---02");
	}

	public Test01() {
		System.out.println("No-Arg");
	}

	public static void main(String[] args) {
		Test01 t = new Test01();

		System.out.println(t.id);
		System.out.println(t.name);
		t.method1();

		System.out.println(t.id1);
		System.out.println(t.name1);
		t.method2();

	}

}
