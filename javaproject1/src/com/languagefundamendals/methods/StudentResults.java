package com.languagefundamendals.methods;
import java.util.Scanner;

public class StudentResults {
	void displyStudent(String name) {
		System.out.println("Name of the Student: "+name);
	}
	void calculateTotal(int m1,int m2,int m3) {
		int total=m1+m2+m3;
		System.out.println("Total Marks : "+total );
	}
	void calculateAvg(int m1,int m2,int m3) {
		double avg=(m1+m2+m3)/3.0;
		System.out.println("Average marks: "+avg);
	}
		
		

	 void main() {
		System.out.println("main method started");
		Scanner sc= new Scanner(System.in); 
		System.out.println("Enter the Name: ");
		String s=sc.nextLine();
		System.out.println("Enter the first subject Marks: ");
		int m1=sc.nextInt();
		System.out.println("Entre the Second Subject Marks: ");
		int m2=sc.nextInt();
		System.out.println("Enter the Third Subject Marks: ");
		int m3=sc.nextInt();
		
		displyStudent(s);
		calculateTotal(m1,m2,m3);
		calculateAvg(m1,m2,m3);
		
		System.out.println("main method ended");
	}

}
