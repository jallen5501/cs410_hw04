package edu.umb.cs.cs410.hw04;

import java.util.Comparator;

public class MileageComparator implements Comparator<Car> {

	public MileageComparator() {}
	
	public int compare(Car c1, Car c2){
		return Integer.compare(c1.getMileage(), c2.getMileage());
	}
}