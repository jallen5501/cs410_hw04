package edu.umb.cs.cs410.hw04;

import java.util.Comparator;

public class YearComparator implements Comparator<Car> {

	public YearComparator () {}

	public int compare(Car c1, Car c2){
		return Integer.compare(c1.getYear(), c2.getYear());
	}
}