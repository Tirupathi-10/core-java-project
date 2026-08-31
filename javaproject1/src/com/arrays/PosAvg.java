package com.arrays;

public class PosAvg {

	public static void main(String[] args) {
		int [] num= {10,30,-10,40,-50,-9,82};
		int sum=0;
		int count=0;
		for(int n:num) {
			if(n>0) {
				sum+=n;
				count++;
				System.out.println(n+" ");
			}
		}
		double avg=(double)sum/count;
		System.out.println("Positive Numbers Avg: "+avg);
	}

}
