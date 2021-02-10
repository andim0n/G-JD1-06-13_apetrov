package by.itacademy.java.jd1.apetrov.practice.pak3_1.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class CarTestDrive {

	public static void main(final String[] args) {
		List<Car> cars = new ArrayList<Car>();
		cars.add(new Car("Opel", 909));
		cars.add(new Car("Volvo", 303));
		cars.add(new Car("Volkswagen", 808));
		cars.add(new Car("Kia", 404));
		cars.add(new Car("Honda", 202));
		System.out.printf("Cars: %s\n", cars);

		Collections.sort(cars);
		System.out.printf("\nCars compare by name: %s\n", cars);

		Collections.sort(cars, new CarComporator());
		System.out.printf("\nCars compare by vin: %s\n", cars);

	}

}
