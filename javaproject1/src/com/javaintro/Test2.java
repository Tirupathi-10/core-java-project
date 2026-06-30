package com.javaintro;

public class Test2 {
	

	public static void main(String[] args) {
		System.out.println("main method started");
		method1();
		System.out.println("main method ended ");
		
	}
	 static void method1() {
		 Test2 t1= new Test2();
		 method3();
		 t1.method2();
		 System.out.println("method 1");
	 }
	 void method2(){
		 System.out.println("method 2");
	 }
	 static void method3() {
		 Test2 t=new Test2();
		 t.method4();
		 System.out.println("method 3");
	 }
	 void method4() {
		 method6();
		 method5();
		 System.out.println("method 4");
	 }
	 void method5() {
		 System.out.println("method 5");
	 }
	 static void method6() {
		 System.out.println("method 6");
	 }
}
