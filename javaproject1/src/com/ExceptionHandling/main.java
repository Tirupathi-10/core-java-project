package com.ExceptionHandling;

class Book {
	void book() {
		System.out.println("Book method");
	}
}

class Magazine {
	void magezine() {
		System.out.println("Magezine method");
	}
}

public class main {

	public static void main(String[] args) {
		Object obj=new Magazine();
		Book b=new Book();
		try {
			Book b1=(Book)obj;
			
		} catch (ClassCastException cc) {
			System.out.println(cc.getMessage());
		}

	}

}
