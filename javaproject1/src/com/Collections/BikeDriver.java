package com.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BikeDriver {

	public static void main(String[] args) {
		Bike b1 = new Bike("SF150", "Gixer", 150000.00);
		Bike b2 = new Bike("Pulsar  NS200", "Bajaj", 160000.00);
		Bike b3 = new Bike("Apache RTR 160", "TVS", 125000.00);
		Bike b4 = new Bike("Duke 200", "KTM", 200000.00);
		Bike b5 = new Bike("R15 V4", "Yamaha", 185000.00);
		Bike b6 = new Bike("Classic 350", "Royal Enfield", 195000.00);
		Bike b7 = new Bike("Unicorn", "Honda", 115000.00);
		Bike b8 = new Bike("Gixxer 250", "Suzuki", 190000.00);
		Bike b9 = new Bike("Xtreme 160R", "Hero", 120000.00);
		Bike b10 = new Bike("Ronin", "TVS", 150000.00);

		List<Bike> bikeList = new ArrayList<>();
		bikeList.add(b1);
		bikeList.add(b2);
		bikeList.add(b3);
		bikeList.add(b4);
		bikeList.add(b5);
		bikeList.add(b6);
		bikeList.add(b7);
		bikeList.add(b8);
		bikeList.add(b9);
		bikeList.add(b10);

		Comparator<Bike> c = new Comparator<Bike>() {

			@Override
			public int compare(Bike o1, Bike o2) {
//				if(o1.price<o2.price) {
//					return -1;
//				}else if(o1.price>o2.price) {
//					return 1;
//				}else {
//					return 0;
//				}

				return o1.brand.compareTo(o2.brand);
			}
		};

		Collections.sort(bikeList, c);
		for (Bike b : bikeList) {
			System.out.println(b);
		}

	}

}
