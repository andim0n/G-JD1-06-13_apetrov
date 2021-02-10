package by.itacademy.java.jd1.apetrov.samples.collections;

import java.util.HashMap;
import java.util.Map;

public class MapSample {

	public static void main(String[] args) {
		Map<String, String> words = new HashMap<String, String>();
		words.put("a", "first");
		words.put("b", "two");
		words.put("c", "three");
		System.out.println("Map: " + words);
		System.out.println("Word is " + words.get("c"));
	}

}
