package by.itacademy.java.jd1.apetrov.samples.threads;

class JoinThread extends Thread {
	public JoinThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		String name = getName();

		System.out.println("start t" + name);
		try {
			switch (name) {
			case "1":
				Thread.sleep(5_000);
				break;
			case "2":
				Thread.sleep(1_000);
				break;
			}
			System.out.println("end t" + name);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class JoinRunner {

	public static void main(String[] args) {
		System.out.println("start main thread");
		JoinThread t1 = new JoinThread("1");
		JoinThread t2 = new JoinThread("2");
		t1.start();
		t2.start();

		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("end main thread");
	}

}