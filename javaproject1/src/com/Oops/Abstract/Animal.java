package com.Oops.Abstract;

public interface Animal {

	void sound();

	void eat();

	void walk();

	default void run() {
		System.out.println("All Animals can run");
		hello();

	}

	public static void sleep() {
		System.out.println("All Animals can sleep");
		hello();
	}

	private static void hello() {
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");

	}

}
