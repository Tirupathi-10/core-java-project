package com.arrays;

public class SumofEven {

	public static void main(String[] args) {
		int[] num = { 10, 29, 4, 7, 80, 20, 55 };
		int evensum = 0;
		int oddsum = 0;
		int ecount = 0;
		int oCount = 0;
		for (int n : num) {
			if (n % 2 == 0) {
				evensum += n;
				ecount++;
			} else {
				oddsum += n;
				oCount++;
			}
		}
		System.out.println("Even Count: " + ecount);
		System.out.println("Odd Count: " + oCount);
		System.out.println("Sum of even Numbers is: " + evensum);
		System.out.println("Sum of  Odd Numbers is :" + oddsum);

	}

}
