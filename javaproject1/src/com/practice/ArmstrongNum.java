package com.practice;

public class ArmstrongNum {

	public static void main(String[] args) {
		int num = 154;
		int temp = num;
		int sum = 0;

		int digit = String.valueOf(num).length();

		while (num > 0) {
			int rem = num % 10;
			sum = sum + (int) Math.pow(rem, digit);
			num = num / 10;
		}
		if (temp == sum) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not Armstrong");
		}
	}

}
