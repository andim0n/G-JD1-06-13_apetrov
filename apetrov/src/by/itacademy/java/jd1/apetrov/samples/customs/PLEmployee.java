package by.itacademy.java.jd1.apetrov.samples.customs;

import java.util.LinkedList;

public class PLEmployee extends AbstractEmployee {
	private static int counter;

	public PLEmployee(LinkedList<Car> carsBuffer) {
		super(carsBuffer);
	}

	@Override
	public void run() {
		while (true) {

			if (getCarsBuffer().isEmpty()) {
				try {
					System.out.printf("%s wait \n", this);
					Thread.sleep(5_000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				continue;
			}

			Car car = getCarsBuffer().removeFirst();
			System.out.printf("%s start %s \n", this, car);
			try {
				Thread.sleep(15_000);
				System.out.printf("%s stop %s \n", this, car);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public int incrementAndGetCounter() {
		counter++;
		return counter;
	}
}