package by.itacademy.java.jd1.apetrov.samples.threads;

public class Sample2 {
	public static class HelloThread extends Thread {

		@Override
		public void run() {
			System.out.println("Hello from a thread" + Thread.currentThread());
		}
	}

	public static void main(String[] args) {
		System.out.println("Hello from a thread" + Thread.currentThread());
		HelloThread helloThread = new HelloThread();
		helloThread.start();
	}

}
