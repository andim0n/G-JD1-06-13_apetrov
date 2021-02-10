package by.itacademy.java.jd1.apetrov.samples.threads;

public class BufferSample {
	static int counter = 0;
	static StringBuffer s = new StringBuffer();

	public static void main(String[] args) throws InterruptedException {
		new Thread() {

			public void run() {
				synchronized (s) {

					while (counter < 3) {
						s.append("A");
						System.out.println("> " + counter + " " + s);
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						counter++;
					}

				}
			}
		}.start();
		Thread.sleep(100);
		while (counter < 6) {
			s.append("B");
			System.out.println("> " + counter + " " + s);
			counter++;
		}

	}

}
