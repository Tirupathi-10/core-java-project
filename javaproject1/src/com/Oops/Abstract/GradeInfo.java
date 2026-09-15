package com.Oops.Abstract;

import java.util.Scanner;

public class GradeInfo extends Student {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Student s;
		String continues = "yes";

		System.out.println("Welcome To Student  Marks Info");
		do {
			System.out.println("Choose Your Category");
			System.out.println("1. Engineering Student");
			System.out.println("2. Medical Student");
			System.out.println("3. Management Student");

			System.out.println("Enter your choice: ");

			int choice = sc.nextInt();
			System.out.println("Enter Your Marks: ");
			int marks = sc.nextInt();

			switch (choice) {
			case 1:
				s = new EngineeringStudent();
				s.calculateGrade(marks);
				break;

			case 2:
				s = new MedicalStudent();
				s.calculateGrade(marks);
				break;

			case 3:
				s = new ManagementStudent();
				s.calculateGrade(marks);
				break;

			default:
				System.out.println("Invalid Choice.....PLease Enter Correct Choice....");
			}
			if (choice != 3) {

				System.out.println("Do you want to continue? (yes/no)");

				continues = sc.next();
			}
		} while (continues.equalsIgnoreCase("yes"));
		System.out.println("Thank You😊😊😊");
		sc.close();

	}

}
