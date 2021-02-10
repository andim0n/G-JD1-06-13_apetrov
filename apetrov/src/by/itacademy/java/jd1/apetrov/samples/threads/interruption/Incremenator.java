package by.itacademy.java.jd1.apetrov.samples.threads.interruption;

public class Incremenator extends Thread {
	private volatile boolean isIncrement = true;
	private volatile boolean toBeFinished = false;
	public int mValue = 0;

	public void changeAction() {
		isIncrement = !isIncrement;
	}

	public void finish() {
		this.toBeFinished = true;
	}

	@Override
	public void run() {
		System.out.print("value = ");
		do {
			// if (!toBeFinished) {
			if (!Thread.interrupted()) {
				if (isIncrement) {
					mValue++;
				} else {
					mValue--;
				}
				System.out.print(mValue + " ");
			} else {
				return;
			}
			try {
				Thread.sleep(1000);
			} catch (final InterruptedException e) {
				System.out.println("Interrupted!");
				return;
			}
		} while (true);
	}
}