package edu.umb.cs.cs410.hw04;

import java.util.Collections;
import java.util.List;
import java.util.LinkedList;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class CarTest {

	@Test
	public void yearComparator() {
		
		List<Car> usedCars = new LinkedList<>();

		usedCars.add(new Car(2478, 0, 0));
		usedCars.add(new Car(34, 0, 0));
		usedCars.add(new Car(123, 0, 0));
		usedCars.add(new Car(1598, 0, 0));
		usedCars.add(new Car(1215, 0, 0));

		Collections.sort(usedCars, new YearComparator());

		int actual = usedCars.get(3).getYear();
		int expected = 1598;
		assertThat(actual, is(expected));
	}

	@Test
	public void priceComparator() {
		
		List<Car> usedCars = new LinkedList<>();

		usedCars.add(new Car(0, 2000, 0));
		usedCars.add(new Car(0, 10000, 0));
		usedCars.add(new Car(0, 1000, 0));
		usedCars.add(new Car(0, 8000, 0));
		usedCars.add(new Car(0, 0, 0));

		Collections.sort(usedCars, new PriceComparator());

		int actual = usedCars.get(2).getPrice();
		int expected = 2000;
		assertThat(actual, is(expected));
	}@Test


	public void mileageComparator() {
		
		List<Car> usedCars = new LinkedList<>();

		usedCars.add(new Car(0, 0, 12));
		usedCars.add(new Car(0, 0, 56));
		usedCars.add(new Car(0, 0, 30));
		usedCars.add(new Car(0, 0, 112));
		usedCars.add(new Car(0, 0, 36));

		Collections.sort(usedCars, new MileageComparator());

		int actual = usedCars.get(4).getMileage();
		int expected = 112;
		assertThat(actual, is(expected));
	}

}