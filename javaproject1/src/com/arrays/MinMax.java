package com.arrays;

public class MinMax {

	public static void main(String[] args) {
		int[] m = { 10,3,6,8,11,20,-4 };
		int Min = m[0];
		int Max = m[0];
		for (int m1 : m) {
			if (m1 < Min) {
				Min = m1;
			} else if (m1 > Max) {
				Max = m1;
			}
		}
		for (int i = 0; i < m.length; i++) {
			if (m[i] < Min) {
				Min = m[i];
			} else if (m[i] > Max) {
				Max = m[i];
			}
		}
		System.out.println("Minimum Value is: " + Min);
		System.out.println("Maximum Value is: " + Max);
	}

}
