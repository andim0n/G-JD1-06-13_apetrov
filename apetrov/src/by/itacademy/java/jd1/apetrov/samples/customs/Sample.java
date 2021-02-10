package by.itacademy.java.jd1.apetrov.samples.customs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Sample {

	public static void main(String[] args) {
		LinkedList<Car> carsBuffer = new LinkedList<Car>();

		List<BYEmployee> byEmployees = new ArrayList<>();
		List<PLEmployee> plEmployees = new ArrayList<>();

		createNewByEmployee(carsBuffer, byEmployees);

		createNewPlEmployee(carsBuffer, plEmployees);
		createNewPlEmployee(carsBuffer, plEmployees);

		createPeriodocalBufferStatusPrinter(carsBuffer);

		createByBoss(carsBuffer, byEmployees);
		createPLBoss(carsBuffer, plEmployees);

	}

	private static void createByBoss(LinkedList<Car> carsBuffer, List<BYEmployee> byEmployees) {

		String name = "BY Boss";
		ScheduledExecutorService scheduledExecutor = Executors.newSingleThreadScheduledExecutor();
		scheduledExecutor.scheduleAtFixedRate(new Runnable() {
			@Override
			public void run() {
				int size = carsBuffer.size();
				if (size > 8) {
					createNewByEmployee(carsBuffer, byEmployees);
					return;
				} else if (size < 3 && byEmployees.size() > 1) {
					AbstractEmployee hardworkingEmpl = findHardworkingEmployee(byEmployees);
					hardworkingEmpl.interrupt();
					byEmployees.remove(hardworkingEmpl);
					System.out.printf("delete rabotyaga %s \n", hardworkingEmpl);
					return;
				}
				System.out.printf("%s: in order: %s. without changes", name, size);
			}

		}, 1, 1, TimeUnit.MINUTES);

	}

	private static void createPLBoss(LinkedList<Car> carsBuffer, List<PLEmployee> plEmployees) {
		ScheduledExecutorService scheduledExecutor = Executors.newSingleThreadScheduledExecutor();
		scheduledExecutor.scheduleAtFixedRate(new Runnable() {
			@Override
			public void run() {
				int size = carsBuffer.size();
				if (size > 5) {
					createNewPlEmployee(carsBuffer, plEmployees);
				} else {
					AbstractEmployee hardworkingEmpl = findHardworkingEmployee(plEmployees);
					hardworkingEmpl.interrupt();
					plEmployees.remove(hardworkingEmpl);
					System.out.printf("minus rabotyaga %s \n", hardworkingEmpl);
				}
			}

		}, 2, 2, TimeUnit.MINUTES);

	}

	private static AbstractEmployee findHardworkingEmployee(List<? extends AbstractEmployee> employees) {
		AbstractEmployee hardworkingEmpl = null;
		for (AbstractEmployee employee : employees) {
			if (hardworkingEmpl == null || hardworkingEmpl.getcQuantity() < employee.getcQuantity()) {
				hardworkingEmpl = employee;
			}
		}
		return hardworkingEmpl;
	}

	private static void createPeriodocalBufferStatusPrinter(LinkedList<Car> carsBuffer) {
		ScheduledExecutorService scheduledExecutor = Executors.newSingleThreadScheduledExecutor();

		scheduledExecutor.scheduleAtFixedRate(new Runnable() {
			@Override
			public void run() {
				System.out.println("Buffer:" + carsBuffer);

			}
		}, 10, 10, TimeUnit.SECONDS);
	}

	private static void createNewByEmployee(LinkedList<Car> carsBuffer, List<BYEmployee> employees) {
		BYEmployee employee = new BYEmployee(carsBuffer);
		employee.start();
		employees.add(employee);
		System.out.printf("add new BY rabotyaga %s \n", employee);
	}

	private static void createNewPlEmployee(LinkedList<Car> carsBuffer, List<PLEmployee> employees) {
		PLEmployee employee = new PLEmployee(carsBuffer);
		employee.start();
		employees.add(employee);
		System.out.printf("add new PL rabotyaga %s \n", employee);
	}
}