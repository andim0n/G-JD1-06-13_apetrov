package by.itacademy.java.jd1.apetrov.practice.pak2_1.text;

import java.util.ArrayList;

public class Sentence {
	//
	private ArrayList<Word> words;

	public Sentence(final ArrayList<Word> words) {
		super();
		this.words = words;
	}

	@Override
	public String toString() {
		return words.toString();
	}

}
