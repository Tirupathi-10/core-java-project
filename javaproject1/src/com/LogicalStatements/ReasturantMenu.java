package com.LogicalStatements;

import java.util.Scanner;

public class ReasturantMenu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String category;
		String items = "";
		String subCategory;
		int price = 0;
		double totalBill = 0;
		int totalItems = 0;
		String bill="";
		String choice = "yes";
		while (choice.equalsIgnoreCase("yes")) {
			System.out.println("========== WELCOME TO GOLDEN RESTAURANT ==========");
			System.out.println("1. Veg");
			System.out.println("2. Nonveg");
			System.out.println("3. Desserts");
			System.out.println("4. Beverages");

			System.out.println("Enter Your Category:");
			category = sc.next();

			switch (category) {
			case "Veg":
				System.out.println("------ VEG MENU ------");
				System.out.println("Tiffins");
				System.out.println("Starters");
				System.out.println("Meals");
				System.out.println("Rotis");
				System.out.println("Curries");

				System.out.print("Enter Sub Category: ");
				subCategory = sc.next();
				switch (subCategory) {
				case "Tiffins":
					System.out.println("------ TIFFINS ------");
					System.out.println("1. Idly");
					System.out.println("2. Dosa");
					System.out.println("3. Poori");
					System.out.println("4. Vada");
					System.out.println("5. Upma");
					System.out.println("6. Pongal");
					System.out.println("7. Pesarattu");
					System.out.println("8. MasalaDosa");

					System.out.print("Enter Tiffin Name: ");
					items = sc.next();
					System.out.println("Item = " + items);
					switch (items) {
					case "Idly":
						System.out.println("Price of Idly is 50rs");
						price = 50;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "Dosa":
						System.out.println("Price of Dosa is ₹70");
						price = 70;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "Poori":
						System.out.println("Price of Poori is ₹60");
						price = 60;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "Vada":
						System.out.println("Price of Vada is ₹40");
						price = 40;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "Upma":
						System.out.println("Price of Upma is ₹50");
						price = 50;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "Pongal":
						System.out.println("Price of Pongal is ₹80");
						price = 80;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "Pesarattu":
						System.out.println("Price of Pesarattu is ₹90");
						price = 90;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "MasalaDosa":
						System.out.println("Price of Masala Dosa is ₹100");
						price = 100;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;
					default:
						System.out.println("Invalid Tiffin");
					}
					break;

				case "Starters":
					System.out.println("------ VEG STARTERS ------");
					System.out.println("GobiManchurian");
					System.out.println("Paneer65");
					System.out.println("Mushroom65");
					System.out.println("CrispyCorn");
					System.out.println("VegSpringRoll");
					System.out.println("BabyCornManchurian");
					System.out.println("VegManchurian");
					System.out.println("PaneerTikka");
					System.out.println("ChilliPaneer");
					System.out.println("VegCutlet");

					System.out.print("Enter Starter Name: ");
					items = sc.next();
					System.out.println("Item = " + items);
					switch (items) {
					case "GobiManchurian":
						System.out.println("Price of Gobi Manchurian is 180rs");
						price = 180;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "Paneer65":
						System.out.println("Price of Paneer 65 is 220rs");
						price = 220;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "Mushroom65":
						System.out.println("Price of Mushroom 65 is 200rs");
						price = 200;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "CrispyCorn":
						System.out.println("Price of Crispy Corn is 170rs");
						price = 170;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "VegSpringRoll":
						System.out.println("Price of Veg Spring Roll is 190rs");
						price = 190;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "BabyCornManchurian":
						System.out.println("Price of Baby Corn Manchurian is 210rs");
						price = 210;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "VegManchurian":
						System.out.println("Price of Veg Manchurian is 180rs");
						price = 180;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "PaneerTikka":
						System.out.println("Price of Paneer Tikka is 250rs");
						price = 250;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					default:
						System.out.println("Invalid Veg Starter");
					}
					break;

				case "Meals":
					System.out.println("------ VEG MEALS ------");
					System.out.println("1. VegMeals");
					System.out.println("2. VegBiryani");
					System.out.println("3. PaneerButterMasala");
					System.out.println("4. MushroomCurry");
					System.out.println("5. VegFriedRice");
					System.out.println("6. JeeraRice");
					System.out.println("7. CurdRice");
					System.out.println("8. MealsCombo");

					System.out.print("Enter Veg Meal Name: ");
					items = sc.next();
					System.out.println("Item = " + items);
					switch (items) {
					case "VegMeals":
						System.out.println("Price of VegMeals is 180rs");
						price = 180;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "VegBiryani":
						System.out.println("Price of Veg Biryani is 220rs");
						price = 220;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "PaneerButterMasala":
						System.out.println("Price of Paneer Butter Masala is 250rs");
						price = 250;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "MushroomCurry":
						System.out.println("Price of Mushroom Curry is 230rs");
						price = 230;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "VegFriedRice":
						System.out.println("Price of Veg Fried Rice is 190rs");
						price = 190;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "JeeraRice":
						System.out.println("Price of Jeera Rice is 160rs");
						price = 160;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "CurdRice":
						System.out.println("Price of Curd Rice is 120rs");
						price = 120;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "MealsCombo":
						System.out.println("Price of Meals Combo is 280rs");
						price = 280;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					default:
						System.out.println("Invalid Veg Meal");
					}
					break;
				case "Rotis":
					System.out.println("------ ROTIS ------");
					System.out.println("PlainRoti");
					System.out.println("ButterRoti");
					System.out.println("TandooriRoti");
					System.out.println("Naan");
					System.out.println("ButterNaan");
					System.out.println("GarlicNaan");
					System.out.println("Kulcha");
					System.out.println("StuffedKulcha");
					System.out.println("LachhaParatha");
					System.out.println("AlooParatha");

					System.out.print("Enter Roti Name: ");
					items = sc.next();
					System.out.println("Item = " + items);
					switch (items) {

					case "PlainRoti":
						System.out.println("Price of Plain Roti is 20rs");
						price = 20;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "ButterRoti":
						System.out.println("Price of Butter Roti is 30rs");
						price = 30;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "TandooriRoti":
						System.out.println("Price of Tandoori Roti is 35rs");
						price = 35;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "Naan":
						System.out.println("Price of Naan is 40rs");
						price = 40;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "ButterNaan":
						System.out.println("Price of Butter Naan is 50rs");
						price = 50;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "GarlicNaan":
						System.out.println("Price of Garlic Naan is 60rs");
						price = 60;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "Kulcha":
						System.out.println("Price of Kulcha is 55rs");
						price = 55;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "StuffedKulcha":
						System.out.println("Price of Stuffed Kulcha is 70rs");
						price = 70;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "LachhaParatha":
						System.out.println("Price of Lachha Paratha is 65rs");
						price = 65;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "AlooParatha":
						System.out.println("Price of Aloo Paratha is 80rs");
						price = 80;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					default:
						System.out.println("Invalid Roti");
					}
					break;
				case "Curries":
					System.out.println("------ VEG CURRIES ------");
					System.out.println("PaneerButterMasala");
					System.out.println("KadaiPaneer");
					System.out.println("PalakPaneer");
					System.out.println("MushroomMasala");
					System.out.println("MixVegCurry");
					System.out.println("VegKolhapuri");
					System.out.println("AlooGobi");
					System.out.println("DalTadka");
					System.out.println("DalFry");
					System.out.println("ChanaMasala");

					System.out.print("Enter Veg Curry Name: ");
					items = sc.next();
					System.out.println("Item = " + items);
					switch (items) {

					case "PaneerButterMasala":
						System.out.println("Price of Paneer Butter Masala is 250rs");
						price = 250;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "KadaiPaneer":
						System.out.println("Price of Kadai Paneer is 240rs");
						price = 240;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "PalakPaneer":
						System.out.println("Price of Palak Paneer is 230rs");
						price = 230;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "MushroomMasala":
						System.out.println("Price of Mushroom Masala is 220rs");
						price = 220;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "MixVegCurry":
						System.out.println("Price of Mix Veg Curry is 200rs");
						price = 200;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "VegKolhapuri":
						System.out.println("Price of Veg Kolhapuri is 230rs");
						price = 230;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "AlooGobi":
						System.out.println("Price of Aloo Gobi is 180rs");
						price = 180;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "DalTadka":
						System.out.println("Price of Dal Tadka is 170rs");
						price = 170;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "DalFry":
						System.out.println("Price of Dal Fry is 160rs");
						price = 160;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "ChanaMasala":
						System.out.println("Price of Chana Masala is 190rs");
						price = 190;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					default:
						System.out.println("Invalid Veg Curry");
					}
					break;

				}
				break;

			case "Nonveg":
				System.out.println("------ NON-VEG MENU ------");
				System.out.println("1. Starters");
				System.out.println("2. Biryanis");
				System.out.println("3. Curries");

				System.out.print("Enter Sub Category: ");
				subCategory = sc.next();

				switch (subCategory) {
				case "Starters":
					System.out.println("------ NON-VEG STARTERS ------");
					System.out.println("Chicken65");
					System.out.println("ChickenLollipop");
					System.out.println("ChickenManchurian");
					System.out.println("DragonChicken");
					System.out.println("PepperChicken");
					System.out.println("ChickenTikka");
					System.out.println("TandooriChicken");
					System.out.println("ApolloFish");
					System.out.println("FishFinger");
					System.out.println("Prawns65");

					System.out.print("Enter Starter Name: ");
					items = sc.next();
					System.out.println("Item = " + items);

					switch (items) {
					case "Chicken65":
						System.out.println("Price of Chicken 65 is 220rs");
						price = 220;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "ChickenLollipop":
						System.out.println("Price of Chicken Lollipop is 260rs");
						price = 260;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "ChickenManchurian":
						System.out.println("Price of Chicken Manchurian is 240rs");
						price = 240;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "DragonChicken":
						System.out.println("Price of Dragon Chicken is 280rs");
						price = 280;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "PepperChicken":
						System.out.println("Price of Pepper Chicken is 270rs");
						price = 270;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "ChickenTikka":
						System.out.println("Price of Chicken Tikka is 300rs");
						price = 300;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "TandooriChicken":
						System.out.println("Price of Tandoori Chicken is 350rs");
						price = 350;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "ApolloFish":
						System.out.println("Price of Apollo Fish is 320rs");
						price = 320;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "FishFinger":
						System.out.println("Price of Fish Finger is 280rs");
						price = 280;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "Prawns65":
						System.out.println("Price of Prawns 65 is 360rs");
						price = 360;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					default:
						System.out.println("Invalid Starter");
					}
					break;
				case "Biryanis":
					System.out.println("------ NON-VEG BIRYANIS ------");
					System.out.println("ChickenBiryani");
					System.out.println("ChickenDumBiryani");
					System.out.println("MuttonBiryani");
					System.out.println("MuttonDumBiryani");
					System.out.println("FishBiryani");
					System.out.println("PrawnsBiryani");
					System.out.println("EggBiryani");
					System.out.println("MixedBiryani");

					System.out.print("Enter Biryani Name: ");
					items = sc.next();
					System.out.println("Item = " + items);
					switch (items) {
					case "ChickenBiryani":
						System.out.println("Price of Chicken Biryani is 250rs");
						price = 250;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "ChickenDumBiryani":
						System.out.println("Price of Chicken Dum Biryani is 280rs");
						price = 280;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "MuttonBiryani":
						System.out.println("Price of Mutton Biryani is 350rs");
						price = 350;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "MuttonDumBiryani":
						System.out.println("Price of Mutton Dum Biryani is 380rs");
						price = 380;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "FishBiryani":
						System.out.println("Price of Fish Biryani is 320rs");
						price = 320;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "PrawnsBiryani":
						System.out.println("Price of Prawns Biryani is 380rs");
						price = 380;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "EggBiryani":
						System.out.println("Price of Egg Biryani is 180rs");
						price = 180;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "MixedBiryani":
						System.out.println("Price of Mixed Biryani is 450rs");
						price = 450;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;
					default:
						System.out.println("Invalid Biryani");
					}
					break;
				case "Curries":
					System.out.println("------ NON-VEG CURRIES ------");
					System.out.println("ButterChicken");
					System.out.println("ChickenCurry");
					System.out.println("ChickenMasala");
					System.out.println("KadaiChicken");
					System.out.println("ChickenKorma");
					System.out.println("MuttonCurry");
					System.out.println("MuttonMasala");
					System.out.println("FishCurry");
					System.out.println("PrawnsCurry");
					System.out.println("EggCurry");

					System.out.print("Enter Curry Name: ");
					items = sc.next();
					System.out.println("Item = " + items);
					switch (items) {

					case "ButterChicken":
						System.out.println("Price of Butter Chicken is 320rs");
						price = 320;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "ChickenCurry":
						System.out.println("Price of Chicken Curry is 280rs");
						price = 280;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "ChickenMasala":
						System.out.println("Price of Chicken Masala is 300rs");
						price = 300;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "KadaiChicken":
						System.out.println("Price of Kadai Chicken is 320rs");
						price = 320;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "ChickenKorma":
						System.out.println("Price of Chicken Korma is 350rs");
						price = 350;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "MuttonCurry":
						System.out.println("Price of Mutton Curry is 380rs");
						price = 380;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "MuttonMasala":
						System.out.println("Price of Mutton Masala is 400rs");
						price = 400;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "FishCurry":
						System.out.println("Price of Fish Curry is 340rs");
						price = 340;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "PrawnsCurry":
						System.out.println("Price of Prawns Curry is 420rs");
						price = 420;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					case "EggCurry":
						System.out.println("Price of Egg Curry is 180rs");
						price = 180;
						totalBill += price;
						totalItems++;
						
						bill += items + " - ₹" + price + "\n";
						break;

					default:
						System.out.println("Invalid Non-Veg Curry");
					}
					break;
				}
				break;
			case "Desserts":

				System.out.println("------ DESSERTS ------");
				System.out.println("IceCream");
				System.out.println("GulabJamun");
				System.out.println("Rasmalai");
				System.out.println("Brownie");
				System.out.println("ChocolateCake");
				System.out.println("FruitSalad");
				System.out.println("Falooda");
				System.out.println("Kulfi");
				System.out.println("DoubleKaMeetha");
				System.out.println("CarrotHalwa");

				System.out.print("Enter Dessert Name: ");
				items = sc.next();
				System.out.println("Item = " + items);
				switch (items) {
				case "IceCream":
					System.out.println("Price of Ice Cream is 80rs");
					price = 80;
					totalBill += price;
					totalItems++;
					
					bill += items + " - ₹" + price + "\n";
					break;

				case "GulabJamun":
					System.out.println("Price of Gulab Jamun is 60rs");
					price = 60;
					totalBill += price;
					totalItems++;
					
					bill += items + " - ₹" + price + "\n";
					break;

				case "Rasmalai":
					System.out.println("Price of Rasmalai is 90rs");
					price = 90;
					totalBill += price;
					totalItems++;
					
					bill += items + " - ₹" + price + "\n";
					break;

				case "Brownie":
					System.out.println("Price of Brownie is 120rs");
					price = 120;
					totalBill += price;
					totalItems++;
					
					bill += items + " - ₹" + price + "\n";
					break;

				case "ChocolateCake":
					System.out.println("Price of Chocolate Cake is 150rs");
					price = 150;
					totalBill += price;
					totalItems++;
					
					bill += items + " - ₹" + price + "\n";
					break;

				case "FruitSalad":
					System.out.println("Price of Fruit Salad is 100rs");
					price = 100;
					totalBill += price;
					totalItems++;
					
					bill += items + " - ₹" + price + "\n";
					break;

				case "Falooda":
					System.out.println("Price of Falooda is 140rs");
					price = 140;
					totalBill += price;
					totalItems++;
					
					bill += items + " - ₹" + price + "\n";
					break;

				case "Kulfi":
					System.out.println("Price of Kulfi is 80rs");
					price = 80;
					totalBill += price;
					totalItems++;
					
					bill += items + " - ₹" + price + "\n";
					break;

				case "DoubleKaMeetha":
					System.out.println("Price of Double Ka Meetha is 110rs");
					price = 110;
					totalBill += price;
					totalItems++;
					
					bill += items + " - ₹" + price + "\n";
					break;

				case "CarrotHalwa":
					System.out.println("Price of Carrot Halwa is 130rs");
					price = 130;
					totalBill += price;
					totalItems++;
					
					bill += items + " - ₹" + price + "\n";
					break;

				default:
					System.out.println("Invalid Dessert");
				}
				break;
			case "Beverages":
				System.out.println("------ BEVERAGES ------");
				System.out.println("Tea");
				System.out.println("Coffee");
				System.out.println("GreenTea");
				System.out.println("BlackCoffee");
				System.out.println("LimeSoda");
				System.out.println("Coke");
				System.out.println("Pepsi");
				System.out.println("Sprite");
				System.out.println("MangoJuice");
				System.out.println("OrangeJuice");

				System.out.print("Enter Beverage Name: ");
				items = sc.next();
				System.out.println("Item = " + items);
				switch (items) {

				case "Tea":
					System.out.println("Price of Tea is 20rs");
					price = 20;
					totalBill += price;
					totalItems++;
					
					bill += items + " - ₹" + price + "\n";
					break;

				case "Coffee":
					System.out.println("Price of Coffee is 30rs");
					price = 30;
					totalBill += price;
					totalItems++;
					
					bill += items + " - ₹" + price + "\n";
					break;

				case "GreenTea":
					System.out.println("Price of Green Tea is 40rs");
					price = 40;
					totalBill += price;
					totalItems++;
					
					bill += items + " - ₹" + price + "\n";
					break;

				case "BlackCoffee":
					System.out.println("Price of Black Coffee is 50rs");
					price = 50;
					totalBill += price;
					totalItems++;
					
					bill += items + " - ₹" + price + "\n";
					break;

				case "LimeSoda":
					System.out.println("Price of Lime Soda is 60rs");
					price = 60;
					totalBill += price;
					totalItems++;
					
					bill += items + " - ₹" + price + "\n";
					break;

				case "Coke":
					System.out.println("Price of Coke is 40rs");
					price = 40;
					totalBill += price;
					totalItems++;
					
					bill += items + " - ₹" + price + "\n";
					break;

				case "Pepsi":
					System.out.println("Price of Pepsi is 40rs");
					price = 40;
					totalBill += price;
					totalItems++;
					
					bill += items + " - ₹" + price + "\n";
					break;

				case "Sprite":
					System.out.println("Price of Sprite is 40rs");
					price = 40;
					totalBill += price;
					totalItems++;
					
					bill += items + " - ₹" + price + "\n";
					break;

				case "MangoJuice":
					System.out.println("Price of Mango Juice is 80rs");
					price = 80;
					totalBill += price;
					totalItems++;
					
					bill += items + " - ₹" + price + "\n";
					break;

				case "OrangeJuice":
					System.out.println("Price of Orange Juice is 80rs");
					price = 80;
					totalBill += price;
					totalItems++;
					
					bill += items + " - ₹" + price + "\n";
					break;

				default:
					System.out.println("Invalid Beverage");
				}
				break;

			default:
			    System.out.println("Invalid Category");
			}
			System.out.print("Do you want to order another item (yes/no): ");
		    choice = sc.next();
		}
	    System.out.println("========== FINAL BILL ==========");
	    System.out.print(bill);
	    System.out.println("Total Items Ordered : " + totalItems);
	    System.out.println("Total Bill          : ₹" + totalBill);
	    System.out.println("================================");
	    System.out.println("Thank You! Visit Again...");
	}
  
    
}
