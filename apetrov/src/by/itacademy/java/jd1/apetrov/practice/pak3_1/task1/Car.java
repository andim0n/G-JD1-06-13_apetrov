package by.itacademy.java.jd1.apetrov.practice.pak3_1.task1;

public class Car implements Comparable<Car> {

	private String name;
	private int vin;

	public Car(final String name, final int vin) {
		super();
		this.name = name;
		this.vin = vin;
	}

	public String getName() {
		return name;
	}

	public int getVin() {
		return vin;
	}

	@Override
	public String toString() {
		return "\nCar [name=" + name + ", vin=" + vin + "]";
	}

	@Override
	public int compareTo(final Car car1) {
		return getName().compareTo(car1.getName());
	}

}
