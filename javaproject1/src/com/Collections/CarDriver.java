package com.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarDriver {

	public static void main(String[] args) {
		Car c1 = new Car("Creta", "Hyundai", 1450000.00);
		Car c2 = new Car("Nexon", "Tata", 1100000.00);
		Car c3 = new Car("XUV700", "Mahindra", 1950000.00);
		Car c4 = new Car("Brezza", "Maruti Suzuki", 980000.00);
		Car c5 = new Car("Fortuner", "Toyota", 3800000.00);
		Car c6 = new Car("City", "Honda", 1350000.00);
		Car c7 = new Car("Kushaq", "Skoda", 1520000.00);
		Car c8 = new Car("Virtus", "Volkswagen", 1480000.00);
		Car c9 = new Car("Hector", "MG", 1750000.00);
		Car c10 = new Car("Harrier", "Tata", 2100000.00);
		
		List<Car> carList=new ArrayList<>();
		
		carList.add(c1);
		carList.add(c2);
		carList.add(c3);
		carList.add(c4);
		carList.add(c5);
		carList.add(c6);
		carList.add(c7);
		carList.add(c8);
		carList.add(c9);
		carList.add(c10);
		Collections.sort(carList);
		
		for(Car car:carList) {
			System.out.println(car);
		}
		
		
		
	}

}
