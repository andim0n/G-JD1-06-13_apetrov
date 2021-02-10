package by.itacademy.java.jd1.apetrov.samples.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorSample {

	public static void main(String[] args) {
		Set<String> words = new HashSet<String>();
		words.add("one");
		words.add("two");
		words.add("three");

		Iterator<String> iterator = words.iterator();
		while (iterator.hasNext()) {
			String next = iterator.next();
			System.out.println(next);
		}
	}

}
