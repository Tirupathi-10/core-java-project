package com.LogicalStatements;

import java.util.Scanner;

public class PlacementEligibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Is Student Registred?");
		boolean registred = sc.nextBoolean();

		if (registred) {
			System.out.println("Is Completed Degree?");
			boolean degreeCompleted = sc.nextBoolean();

			if (degreeCompleted) {
				System.out.println("Enter Your CGPA:");
				double cgpa = sc.nextDouble();

				if (cgpa >= 7.0) {
					System.out.println("Enter Your number of Active Backlogs");
					int backlogs = sc.nextInt();

					if (backlogs == 0) {
						System.out.println("Is Resume Uploaded?");
						boolean resumeuploaded = sc.nextBoolean();

						if (resumeuploaded) {
							System.out.println("Has Completed Appitude Test?");
							boolean appitudepassed = sc.nextBoolean();

							if (appitudepassed) {
								System.out.println("Has Technical Interview Cleared?");
								boolean technicalpassed = sc.nextBoolean();

								if (technicalpassed) {
									System.out.println("Has HR Interview Cleared?");
									boolean hrpassed = sc.nextBoolean();

									if (hrpassed) {
										System.out.println("Congratulations! You are Selected. ");
									} else {
										System.out.println("HR Interview Failed.");
									}
								} else {
									System.out.println("technical Interview Failed.");
								}
							} else {
								System.out.println("Appitude Test Failed.");
							}
						} else {
							System.out.println("Please Upload Your Resume.");
						}
					} else {
						System.out.println("Active Backlogs Found :Not Eligible.");
					}
				} else {
					System.out.println(" CGPA must be Above 7.0 or Above.");
				}
			} else {
				System.out.println("Degree not Completed.");
			}
		} else {
			System.out.println("Please Registre the Placement Drive.");
		}
	}

}
