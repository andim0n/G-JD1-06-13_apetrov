package by.itacademy.java.jd1.apetrov.samples.serialization;

import java.io.Serializable;

public class Car implements Serializable {
	private int vin;
	private String name;
	private int year;

	public Car(final int vin, final String name, final int year) {
		super();
		this.vin = vin;
		this.name = name;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Car [vin=" + vin + ", name=" + name + ", year=" + year + "]";
	}

}
