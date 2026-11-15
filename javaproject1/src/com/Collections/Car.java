package com.Collections;

public class Car implements Comparable<Car> {
	String model;
	String brand;
	double price;

	public String toString() {
		return "Car [ model =" + model + " brand = " + brand + "Price =" + price + "]";

	}

	public Car(String model, String brand, double price) {
		super();
		this.model = model;
		this.brand = brand;
		this.price = price;
	}

	@Override
	public int compareTo(Car o) {
		if (this.price < o.price) {
			return -1;
		} else if (this.price > o.price) {
			return 1;
		} else {
			return 0;
		}
	}

}
