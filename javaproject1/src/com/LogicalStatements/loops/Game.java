package com.LogicalStatements.loops;

import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Random r = new Random();
		int random = r.nextInt(1, 5);
		Scanner sc = new Scanner(System.in);
		int chances = 3;
//		int random = (int) (Math.floor(Math.random() * 5) + 1);

		for (int i = 1; i <= chances; i++) {
			System.out.println("Guess The Number: ");
			int n = sc.nextInt();
			if (random == n) {
				System.out.println("You Won!!!");
				break;
			} else if (i == 1) {
				System.out.println("Try Again....");
				System.out.println("You Have Only Two Chances");
			} else if (i == 2) {
				System.out.println("Try Again.....");
				System.out.println("Your Last Chance...");
			} else {
				System.out.println("Better Luck Next Time");
			}
		}

	}

}
