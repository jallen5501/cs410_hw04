package edu.umb.cs.cs410.hw04;

import java.util.Comparator;

public class PriceComparator implements Comparator<Car> {

	public PriceComparator() {}
	
	public int compare(Car c1, Car c2){
		return Integer.compare(c2.getPrice(), c1.getPrice());
	}
}