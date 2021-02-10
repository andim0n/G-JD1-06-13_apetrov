package by.itacademy.java.jd1.apetrov.samples.customs;

public class Car {

	private static int counter = 0;

	private int number;

	public Car() {
		super();
		synchronized (Car.class) {
			counter++;
			number = counter;
		}
	}

	public int getNumber() {
		return number;
	}

	@Override
	public String toString() {
		return "Car#" + number;
	}

}