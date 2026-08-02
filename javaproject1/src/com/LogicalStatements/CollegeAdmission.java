package com.LogicalStatements;

import java.util.Scanner;

public class CollegeAdmission {

	public static void main(String[] args) {
		System.out.println("=======College Admission Form======");
		Scanner sc = new Scanner(System.in);
		System.out.println("Application Submitted?");
		String applicationSubmitted = sc.next();
		if (applicationSubmitted.equalsIgnoreCase("yes")) {
			System.out.println("Verifies 10th Certificates?");
			String verifies10th = sc.next();
			if (verifies10th.equalsIgnoreCase("yes")) {
				System.out.println("Verifies 12th Certificates?");
				String verifies12th = sc.next();
				if (verifies12th.equalsIgnoreCase("yes")) {
					System.out.println("Are You Qualified Entrance test?");
					String qualified = sc.next();
					if (qualified.equalsIgnoreCase("yes")) {
						System.out.println("Enter Your percentage:");
						double percentage = sc.nextDouble();
						if (percentage >= 70) {
							System.out.println("Seats Available?");
							String seatAvailable = sc.next();
							if (seatAvailable.equalsIgnoreCase("yes")) {
								System.out.println("Admission Fee Paid?");
								String feepaid = sc.next();
								if (feepaid.equalsIgnoreCase("yes")) {
									System.out.println("Congratulations.");
									System.out.println("Admission Confirmed.");

									System.out.println("========================================");
									System.out.println("         ADMISSION SUMMARY");
									System.out.println("========================================");
									System.out.println("Application : Submitted");
									System.out.println("10th        : Verified");
									System.out.println("12th        : Verified");
									System.out.println("Entrance    : Qualified");
									System.out.println("Percentage  : " + percentage + "%");
									System.out.println("Seat        : Available");
									System.out.println("Fee         : Paid");
									System.out.println("----------------------------------------");
									System.out.println("Status      : Admission Confirmed");
									System.out.println("========================================");
								} else {
									System.out.println(" Please Pay the Admission Fee.");
								}
							} else {
								System.out.println(" No Seat Available.");
							}
						} else {
							System.out.println(" Admission Rejected: Minimum 70% Required.");
						}
					} else {
						System.out.println(" Entrance Test Not Qualified.");
					}
				} else {
					System.out.println(" 12th Certificates Not Verified.");
				}
			} else {
				System.out.println(" 10th Certificates Not Verified.");
			}
		} else {
			System.out.println(" Application Not Submitted.");
		}

	}

}
