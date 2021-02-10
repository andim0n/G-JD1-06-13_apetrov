package by.itacademy.java.jd1.apetrov.samples.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetSearchTest {

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

		@Override
		public int hashCode() {
			System.out.println(String.format("hashCode method called for %s ", number));
			return super.hashCode();
		}

	}

	public static void main(String[] args) {
		Set<Sample> set = new HashSet<Sample>();

		Sample s1 = new Sample();
		Sample s2 = new Sample();
		Sample s3 = new Sample();
		Sample s4 = new Sample();
		Sample s5 = new Sample();

		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);

		System.out.println("execute contains s2");
		set.contains(s2);

		System.out.println("execute contains s3");
		set.contains(s3);

		System.out.println("execute remove s5");
		set.remove(s5);
		// 
		System.out.println("execute contains s2");
		set.contains(s2);

		System.out.println("execute contains s3");
		set.contains(s3);

		System.out.println("execute remove s5");
		set.remove(s5);

	}

	private static void someLargeLogicAboutComparison() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}