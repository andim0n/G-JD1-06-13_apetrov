package by.itacademy.java.jd1.apetrov.practice.pak3_1.task1;

import java.util.Comparator;

public class CarComporator implements Comparator<Car> {

	@Override
	public int compare(final Car car1, final Car car2) {
		return car1.getVin() - car2.getVin();
	}

}
