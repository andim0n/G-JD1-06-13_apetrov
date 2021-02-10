package by.itacademy.java.jd1.apetrov.samples.horses;

public class Horse extends Thread {

	public static final int MAX_STEPS = 70;
	private int steps = 0;
	private Long startTime;
	private Long finishTime;
	private boolean killed;

	public Horse(String name) {
		super(name);
	}

	@Override
	public void run() {
		startTime = System.currentTimeMillis();
		while (steps < MAX_STEPS) {
			if (Thread.interrupted()) {
				kill();
				return;
			} else {
				steps += Utils.getRandomInt(1, 3);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					kill();
					return;
				}
			}

		}
		finishTime = System.currentTimeMillis();
	}

	private void kill() {
		killed = true;

	}

	public boolean isKilled() {
		return killed;
	}

	public int getSteps() {
		return steps;
	}

	public Long getStartTime() {
		return startTime;
	}

	public Long getFinishTime() {
		return finishTime;
	}

	@Override
	public String toString() {
		return "Horse [steps=" + steps + ", getName()=" + getName() + "]";
	}
}