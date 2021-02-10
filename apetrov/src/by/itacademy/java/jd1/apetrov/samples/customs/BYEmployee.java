package by.itacademy.java.jd1.apetrov.samples.customs;

import java.util.LinkedList;

import by.itacademy.java.jd1.apetrov.samples.horses.Utils;

public class BYEmployee extends AbstractEmployee {
	private static int counter;

	public BYEmployee(LinkedList<Car> carsBuffer) {
		super(carsBuffer);
	}

	@Override
	public void run() {
		while (true) {
			if (interrupted()) {
				endWork();
				return;
			}

			Car car = new Car();
			System.out.printf("%s start %s  \n", this, car);
			try {
				Thread.sleep(Utils.getRandomInt(10, 20) * 1000);
			} catch (InterruptedException e) {
				endWork();
				return;
			} finally {
				System.out.printf("%s stop %s  \n", this, car);
				getCarsBuffer().add(car);
			}
		}
	}

	private void endWork() {
		System.out.printf("%s end \n", this);
	}

	@Override
	public int incrementAndGetCounter() {
		counter++;
		return counter;
	}

}