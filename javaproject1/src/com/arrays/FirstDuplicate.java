package com.arrays;

public class FirstDuplicate {

	public static void main(String[] args) {
		int[] arr = { 10, 30, 4, 6, 10, 30, 55, 20, 40, 8 };
		boolean status=false;
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i + 1; j < arr.length; j++) {
				
				if (arr[i] == arr[j]) {
					
					System.out.println(arr[i]);
					status=true;
					break;
				}
			}
			if(status) {
				break;
			}
		}

	}

}
