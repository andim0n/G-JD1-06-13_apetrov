package by.itacademy.java.jd1.apetrov.samples.threads;

public class Sample3 {
	public static class HelloRunnable implements Runnable {
		@Override
		public void run() {
			System.out.println("Hello from a thread!" + Thread.currentThread());
		}
	}

	public static void main(String[] args) {
		System.out.println("Hello from a thread!" + Thread.currentThread());
		HelloRunnable helloRunnable = new HelloRunnable();
		Thread thread = new Thread(helloRunnable);
		thread.setName("My First thread");
//		thread.setDaemon(true);
		thread.start();
		System.out.println();
	}

}
