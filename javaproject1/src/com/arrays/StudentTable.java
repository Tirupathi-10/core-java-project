package com.arrays;

public class StudentTable {

	public static void main(String[] args) {
		int[] arr = { 35, 41, 29, 56, 72, 87 };// 30,40,30,60,70,90
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (arr[i] / 10) * 10;
			System.out.print(arr[i] + " ");
		}

	}

}
