package by.itacademy.java.jd1.apetrov.practice.pak2_1.car;

public class Car {
	//
	private String mark;
	private String color;
	private int fuel;
	private int mileage;
	private int year;
	private int fuelRate;
	private Engine engine;
	private Wheel wheel;

	public void fillCar(final int liters) {
		if (fuel + liters < 100) {
			fuel += liters;
			System.out.printf("\nCar refilled to %d liters", fuel);
		} else {
			System.out.printf("\nCar refill only %d liters to full gas tank", (100 - fuel));
			fuel = 100;
		}
	}

	public void pumpingWheel(final double rightPressure) {
		double pressure = wheel.getPressure();
		if (rightPressure > 3 && rightPressure < 1.5) {
			System.out.print("\nIncorrect pressure (use 1,5-3)");
		} else {
			if (pressure >= 1.5) {
				System.out.print("\nWheels don't need pumping!");
			} else {
				System.out.printf("\nWheels are pumped up to %f atmospheres", rightPressure);
				wheel.setPressure(rightPressure);
			}
		}
	}

	public void startEngine() {
		engine.start();
	}

	public void move(final int distance) {

		int maxDistance = 100 * fuel / fuelRate;
		double pressureWheel = wheel.getPressure();

		if (!engine.isStart()) {
			System.out.println("\nStart engine for moving!");
			return;
		}

		if (pressureWheel < 1.5) {
			System.out.printf("\nCar can't move! Need to pump the wheel");
			return;
		}

		if (distance > maxDistance) {
			System.out.printf("\nCar move only %d km ", maxDistance);
			System.out.print("to move next you need refuel!");
			mileage += maxDistance;
			fuel -= maxDistance * fuelRate / 100;
		} else {
			System.out.printf("\nCar passed %d km", distance);
			mileage += distance;
			fuel -= distance * fuelRate / 100;
		}
	}

	public void printMark() {
		System.out.printf("\nMark auto: %s", mark);
	}

	@Override
	public String toString() {
		return "Car [mark=" + mark + ", color=" + color + ", fuel=" + fuel + ", mileage=" + mileage + ", year=" + year
				+ ", fuelRate=" + fuelRate + ", engine=" + engine + ", wheel=" + wheel + "]";
	}

	// unused methods
	public String getMark() {
		return mark;
	}

	public void setMark(final String mark) {
		this.mark = mark;
	}

	public String getColor() {
		return color;
	}

	public void setColor(final String color) {
		this.color = color;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(final int mileage) {
		this.mileage = mileage;
	}

	public int getYear() {
		return year;
	}

	public void setYear(final int year) {
		this.year = year;
	}

	public int getFuel() {
		return fuel;
	}

	public void setFuel(final int fuel) {
		this.fuel = fuel;
	}

	public int getFuelRate() {
		return fuelRate;
	}

	public void setFuelRate(final int fuelRate) {
		this.fuelRate = fuelRate;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(final Engine engine) {
		this.engine = engine;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(final Wheel wheel) {
		this.wheel = wheel;
	}

}
