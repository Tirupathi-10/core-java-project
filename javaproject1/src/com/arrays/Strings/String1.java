package com.arrays.Strings;

public class String1 {

	public static void main(String[] args) {
		String[] name = { "java", "python", "Sql","html","css" };
		
		for(int i=name.length-1;i>=0;i--) {
			System.out.print(name[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i].length());
		}
	}

}
