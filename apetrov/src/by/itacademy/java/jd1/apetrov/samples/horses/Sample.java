package by.itacademy.java.jd1.apetrov.samples.horses;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		int horsesCount = 10;

		List<Horse> allHorses = new ArrayList<>();
		for (int i = 0; i < horsesCount; i++) {
			Horse horse = new Horse("horse-" + i);
			allHorses.add(horse);
			horse.start();
		}

		ScheduledExecutorService scheduledExecutor = Executors.newSingleThreadScheduledExecutor();

		scheduledExecutor.scheduleAtFixedRate(new Runnable() {
			@Override
			public void run() {
				boolean isAnyAlive = false;

				for (Horse horse : allHorses) {
					isAnyAlive = isAnyAlive || horse.isAlive();
					printCurrentState(allHorses);
				}

				if (!isAnyAlive) {
					scheduledExecutor.shutdown();
				}
			}
		}, 0, 1, TimeUnit.SECONDS);

		Thread.currentThread().sleep(20000);
		Horse horseToKill = allHorses.get(Utils.getRandomInt(0, allHorses.size() - 1));
		horseToKill.interrupt();
	}

	private static void printCurrentState(List<Horse> allHorses) {
		for (int i = 0; i < 10; i++) {
			System.out.println();
		}

		for (Horse h : allHorses) {
			int steps = h.getSteps();
			for (int i = 0; i < steps; i++) {
				System.out.print('-');
			}
			System.out.print(h.getName());

			if (h.isKilled()) {
				System.out.print("dead");
			}

			System.out.print('>');

			for (int i = 0; i < Horse.MAX_STEPS - steps; i++) {
				System.out.print(' ');
			}
			System.out.print('|');
			if (h.getFinishTime() != null) {
				System.out.print(h.getFinishTime() - h.getStartTime() + "s.");
			}

			System.out.println();
		}

	}

}