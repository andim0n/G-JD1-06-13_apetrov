package by.itacademy.java.jd1.apetrov.practice.pak3_1.task2;

import java.util.HashSet;
import java.util.Set;

public class Result {

	private Set<String> words = new HashSet<String>();

	public Result(final Set<String> words) {
		super();
		this.words = words;
	}

	@Override
	public String toString() {
		return "Words: " + words;
	}
}
