package by.itacademy.java.jd1.apetrov.samples.threads;

class ExceptThread extends Thread {
	@Override
	public void run() {
		boolean flag = true;
		if (flag) {
			throw new RuntimeException();
		}
		System.out.println("end of exception");
	}
}

public class ExThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		new ExceptThread().start();
		Thread.sleep(1000);
		System.out.println("end of main");
	}

}
