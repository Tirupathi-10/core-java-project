package com.javaintro;

public class Test1 {
	static {
		System.out.println("Static block1 loaded");
		
	}
	
	{
		System.out.println("Instance Block loaded");
	}
	static {
		System.out.println("well come");
		
	}
	{
		System.out.println("Instance Block loaded");
	}
	static Test1 t = new Test1();
	public static void main(String[] args) {
		System.out.println("main method started");
		
		
		{
			System.out.println("Instance Block loaded");
		}
		
	}
	static {
		System.out.println("Static Block2 loaded");
		
	}

}
