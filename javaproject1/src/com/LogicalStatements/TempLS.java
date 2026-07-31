package com.LogicalStatements;

import java.util.Scanner;

public class TempLS {

	String tempinfo(double temp) {
		String temperature = "";
		if (temp >= 100 || temp < -10) {
			temperature = "Invalid";
		} else if (temp >= 40) {
			temperature = "Very Hot";
		} else if (temp >= 30) {
			temperature = "Hot";
		} else if (temp >= 20) {
			temperature = "Pleasent";
		} else if (temp >= 10) {
			temperature = "Cool";
		} else {
			temperature = "Cold";
		}
		return temperature;
	}

	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Temperature:");
		double temp = sc.nextDouble();
		String temperature = tempinfo(temp);
		if(temperature.equals("Invalid")) {
			System.out.println("Invalid");
		}else {
			System.out.println("Climate:" + temperature);
		}
		sc.close();
	}

}
