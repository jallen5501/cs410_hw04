package edu.umb.cs.cs410.hw04;

import java.util.Collections;
import java.util.List;
import java.util.LinkedList;

public class Car {

	private int year;
	private int price;
	private int mileage;

	public Car(int year, int price, int mileage) {

		this.year = year;
		this.price = price;
		this.mileage = mileage;

	}

	public int getYear() {
		return this.year;
	}

	public int getPrice() {
		return this.price;
	}

	public int getMileage() {
		return this.mileage;
	}

	public String toString() {

		String result = "";

		result += "\n" + "Year: " + this.getYear() + ", ";
		result += "Price: " + this.getPrice() + "$, ";
		result += "Mileage: " + this.getMileage() + "mpg";

		return result;
	}

	public boolean equals(Car that) {
		return (this.getYear() == that.getYear() && 
				this.getPrice() == that.getPrice() &&
			    this.getMileage() == that.getMileage());
	}

	public static void main(String[] args) {

		List<Car> usedCars = new LinkedList<>();
		
		usedCars.add(new Car(2005, 2200, 20));
		usedCars.add(new Car(2006, 2000, 16));
		usedCars.add(new Car(2002, 2500, 17));
		usedCars.add(new Car(0, 100, 1000));
		usedCars.add(new Car(100, 1000, 0));
		usedCars.add(new Car(1000, 0, 100));

		Collections.sort(usedCars, new YearComparator());
		System.out.println("\nSorted by year.");
		System.out.println(usedCars);

		Collections.sort(usedCars, new PriceComparator());
		System.out.println("\nSorted by price.");
		System.out.println(usedCars);

		Collections.sort(usedCars, new MileageComparator());
		System.out.println("\nSorted by mileage.");
		System.out.println(usedCars);

	}

}