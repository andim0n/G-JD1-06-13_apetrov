package by.itacademy.java.jd1.apetrov.practice.pak3_1.task3;

import java.util.HashMap;
import java.util.Map;

public class Result {

	private Map<String, Integer> words = new HashMap<String, Integer>();

	public Result(final Map<String, Integer> words) {
		super();
		this.words = words;
	}

	@Override
	public String toString() {
		return "Result [words=" + words + "]";
	}

	public Map<String, Integer> getWords() {
		return words;
	}
}
