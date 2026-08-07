package com.LogicalStatements;

import java.util.Scanner;

public class ECommerce {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double cartTotal = 0;
		int laptopQty = 0;
		int mobileQty = 0;
		int headphonesQty = 0;
		int watchQty = 0;
		while (true) {
			System.out.println("------------------------");
			System.out.println("E-Commerce Online Shopping ");
			System.out.println("------------------------");
			System.out.println("1.View Products");
			System.out.println("2.Add Product To cart");
			System.out.println("3.Remove Product from Cart");
			System.out.println("4.View Cart");
			System.out.println("5.Checkout");
			System.out.println("6.Exit");
			System.out.println("------------------------");
			System.out.println("Enter Your Choise");
			int choise = sc.nextInt();
			switch (choise) {
			case 1:
				System.out.println("Available  Products");
				System.out.println("1.Laptop      70000");
				System.out.println("2.mobile      20000");
				System.out.println("3.HeadPhones  10000");
				System.out.println("4.SmartWatch   5000");
				break;
			case 2:
				System.out.println("Select Product");
				System.out.println("1. Laptop");
				System.out.println("2. Mobile");
				System.out.println("3. HeadPhones");
				System.out.println("4. SmartWatch");
				System.out.println("Enter The Product");
				int add = sc.nextInt();
				switch (add) {
				case 1:
					laptopQty++;
					cartTotal += 50000;
					System.out.println("Laptop Added Successfully");
					break;
				case 2:
					mobileQty++;
					cartTotal += 20000;
					System.out.println("Mobile Added Successfully");
					break;
				case 3:
					headphonesQty++;
					cartTotal += 10000;
					System.out.println("Headphones Added Successfully");
					break;
				case 4:
					watchQty++;
					cartTotal += 5000;
					System.out.println("Smart Watch Added Successfully");
					break;
				default:
					System.out.println("Invalid Product");
				}
				break;
			case 3:
				System.out.println("Select Product To Remove");
				System.out.println("1. Laptop");
				System.out.println("2. Mobile");
				System.out.println("3. HeadPhones");
				System.out.println("4. SmartWatch");

				int remove = sc.nextInt();
				switch (remove) {
				case 1:
					if (laptopQty > 0) {
						laptopQty--;
						cartTotal -= 50000;
						System.out.println("Laptop Removed Successfully");
					} else {
						System.out.println("Laptop Not Found In Cart");
					}
					break;
				case 2:
					if (mobileQty > 0) {
						mobileQty--;
						cartTotal -= 20000;
						System.out.println("Mobile Removed Successfully");
					} else {
						System.out.println("Mobile Not Found In Cart");
					}
					break;
				case 3:
					if (headphonesQty > 0) {
						headphonesQty--;
						cartTotal -= 10000;
						System.out.println("Headphones Removed Successfully");
					} else {
						System.out.println("Headphones Not Found In Cart");
					}
					break;
				case 4:
					if (watchQty > 0) {
						watchQty--;
						cartTotal -= 5000;
						System.out.println("Smart Watch Removed Successfully");
					} else {
						System.out.println("Smart Watch Not Found In Cart");
					}
					break;
				default:
					System.out.println("Invalid Product");
				}
				break;
			case 4:
				System.out.println("======= MY CART========");
				System.out.println("Laptop      : " + laptopQty);
				System.out.println("Mobile      : " + mobileQty);
				System.out.println("Headphones  : " + headphonesQty);
				System.out.println("Smart Watch : " + watchQty);
				System.out.println("-----------------------------");
				System.out.println("Cart Total : ₹" + cartTotal);
				break;
			case 5:
				if (cartTotal == 0) {
					System.out.println("Cart is Empty");
				} else {
					double gst = cartTotal * 0.18;
					double finalAmount = cartTotal + gst;

					System.out.println("========== BILL ==========");
					System.out.println("Laptop      : " + laptopQty);
					System.out.println("Mobile      : " + mobileQty);
					System.out.println("Headphones  : " + headphonesQty);
					System.out.println("Smart Watch : " + watchQty);
					System.out.println("--------------------------");
					System.out.println("Cart Total  : ₹" + cartTotal);
					System.out.println("GST (18%)   : ₹" + gst);
					System.out.println("Final Amount: ₹" + finalAmount);
					System.out.println("==========================");
					System.out.println("Order Placed Successfully!");

					cartTotal = 0;
					laptopQty = 0;
					mobileQty = 0;
					headphonesQty = 0;
					watchQty = 0;
				}
				break;
			case 6:
				System.out.println("Thank You for Shopping!!!");
				System.exit(0);
			default:
				System.out.println("Invalid Choise");
			}
		}
	}

}
