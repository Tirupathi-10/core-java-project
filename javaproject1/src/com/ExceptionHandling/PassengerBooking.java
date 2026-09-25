package com.ExceptionHandling;

import java.util.Scanner;

public class PassengerBooking {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Passenger Id:");
		String passengerId = sc.next();

		System.out.println("Enter the Age:");
		String age = sc.next();

		System.out.println("Enter the Seat Number:");
		String seatNumber = sc.next();

		System.out.println("Number of Passengers:");
		int nOfPass = sc.nextInt();

		// 1. NumberFormatException
		try {

			int pId = Integer.parseInt(passengerId);
			int age1 = Integer.parseInt(age);
			int sNum = Integer.parseInt(seatNumber);

			System.out.println("Passenger Id: " + pId);
			System.out.println("Age: " + age1);
			System.out.println("Seat Number: " + sNum);

		} catch (NumberFormatException nfe) {

			System.out.println("NumberFormatException: " + nfe.getMessage());
		}

		// Object Array
		System.out.println("Enter the size:");
		int size = sc.nextInt();

		Object[] arr = new Object[size];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter passenger data:");
			arr[i] = sc.next();
		}

		// 2. ArrayIndexOutOfBoundsException
		System.out.println("Enter index:");
		int index = sc.nextInt();

		try {

			System.out.println("Passenger: " + arr[index]);

		} catch (ArrayIndexOutOfBoundsException ai) {

			System.out.println("ArrayIndexOutOfBoundsException: " + ai.getMessage());
		}

		// 3. StringIndexOutOfBoundsException
		System.out.println("Enter character index:");
		int position = sc.nextInt();

		try {

			System.out.println("Character: " + seatNumber.charAt(position));

		} catch (StringIndexOutOfBoundsException sie) {

			System.out.println("StringIndexOutOfBoundsException: " + sie.getMessage());
		}

		// 4. ClassCastException
		try {

			Integer value = (Integer) arr[0];

			System.out.println("Integer value: " + value);

		} catch (ClassCastException cce) {

			System.out.println("ClassCastException: " + cce.getMessage());
		}

		// 5. NullPointerException
		try {

			String passengerName = null;

			System.out.println("Passenger Name Length: " + passengerName.length());

		} catch (NullPointerException npe) {

			System.out.println("NullPointerException: " + npe.getMessage());
		}

		// 6. Average Baggage
		System.out.println("Enter the baggage:");
		double baggage = sc.nextDouble();

		try {

			if (nOfPass == 0) {
				throw new ArithmeticException("Number of passengers cannot be zero");
			}

			double avg = baggage / nOfPass;

			System.out.println("Average Baggage: " + avg);

		} catch (ArithmeticException ae) {

			System.out.println("ArithmeticException: " + ae.getMessage());
		}

		// 7. Booking Average
		System.out.println("Enter the amount:");
		double amount = sc.nextDouble();

		System.out.println("Enter Number of Seats:");
		int numOfSeat = sc.nextInt();

		try {

			if (numOfSeat == 0) {
				throw new ArithmeticException("Number of seats cannot be zero");
			}

			double bookingAverage = amount / numOfSeat;

			System.out.println("Booking Average: " + bookingAverage);

		} catch (ArithmeticException ae1) {

			System.out.println("ArithmeticException: " + ae1.getMessage());
		}

		System.out.println("Program continues after exception handling.");

		sc.close();
	}

}
