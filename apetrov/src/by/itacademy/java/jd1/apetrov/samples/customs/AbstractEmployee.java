package by.itacademy.java.jd1.apetrov.samples.customs;

import java.util.LinkedList;

public abstract class AbstractEmployee extends Thread {

	private int number;
	private int cQuantity;

	private LinkedList<Car> carsBuffer;

	public AbstractEmployee(LinkedList<Car> carsBuffer) {
		this.carsBuffer = carsBuffer;
		synchronized (AbstractEmployee.class) {
			number = incrementAndGetCounter();
		}
	}

	public abstract int incrementAndGetCounter();

	public LinkedList<Car> getCarsBuffer() {
		return carsBuffer;
	}

	public int getcQuantity() {
		return cQuantity;
	}

	@Override
	public String toString() {
		return String.format("%s#%s", getClass().getSimpleName(), number);
	}
}