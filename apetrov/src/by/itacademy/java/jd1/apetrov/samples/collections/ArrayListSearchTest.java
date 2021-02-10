package by.itacademy.java.jd1.apetrov.samples.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSearchTest {

	private static int counter = 0;

	private static class Sample {

		private int number;

		public Sample() {
			super();
			counter++;
			this.number = counter;
		}

		@Override
		public boolean equals(Object obj) {
			Sample anotherSample = (Sample) obj;
			System.out
					.println(String.format("equals method called to compare %s and %s ", number, anotherSample.number));
			someLargeLogicAboutComparison();
			return super.equals(obj);
		}
	}

	public static void main(String[] args) {
		List<Sample> list = new ArrayList<Sample>();

		Sample s1 = new Sample();
		Sample s2 = new Sample();
		Sample s3 = new Sample();
		Sample s4 = new Sample();
		Sample s5 = new Sample();

		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);

		System.out.println("execute contains s2");
		list.contains(s2);

		System.out.println("execute indexOf s3");
		list.indexOf(s3);

		System.out.println("execute remove s5");
		list.remove(s5);

	}

	private static void someLargeLogicAboutComparison() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}