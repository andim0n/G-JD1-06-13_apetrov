package by.itacademy.java.jd1.apetrov.practice.pak2_1.car;

public class CarTestDrive {
	//
	public static void main(final String[] args) {

		CarTestDrive carTestDrive = new CarTestDrive();

		Car car1 = carTestDrive.makeNewCar();
		car1.printMark();
		car1.move(30);
		car1.startEngine();
		car1.move(50);
		car1.pumpingWheel(2);
		car1.fillCar(10);
		car1.move(150);
		car1.fillCar(50);
		car1.fillCar(100);
		car1.move(500);
		car1.move(400);
	}

	private Car makeNewCar() {
		Car newCar = new Car();
		Engine engineNewCar = new Engine(EngineType.GAS.ordinal(), 3000);
		Wheel wheelNewCar = new Wheel(DiscType.CAST.ordinal(), 18, 1.0);

		newCar.setMark("Audi");
		newCar.setColor("black");
		newCar.setYear(2018);
		newCar.setMileage(1_000);
		newCar.setEngine(engineNewCar);
		newCar.setWheel(wheelNewCar);
		newCar.setFuelRate(15);

		return newCar;
	}

}
