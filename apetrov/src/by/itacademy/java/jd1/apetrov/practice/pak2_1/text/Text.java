package by.itacademy.java.jd1.apetrov.practice.pak2_1.text;

import java.util.ArrayList;

public class Text {
	//
	private Word title;
	private ArrayList<Sentence> sentences;

	public Text(final Word title, final ArrayList<Sentence> sentences) {
		super();
		this.title = title;
		this.sentences = sentences;
	}

	public void showTitle() {
		String titleText = title.toString();
		System.out.printf("\n\t%s", titleText);
	}

	public void showText() {
		String text = sentences.toString();
		text = text.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll(",", "");
		System.out.printf("\n%s", text);
	}

	public void addText(String addText) {
		System.out.print("\n\nAdd text: ");
		String[] addWords = addText.split("\\s");
		ArrayList<Word> addSentence = new ArrayList<>();
		for (String addWord : addWords) {
			Word newWord = new Word(addWord);
			addSentence.add(newWord);
		}
		Word dot = new Word(".");
		addSentence.add(dot);
		Sentence addStentences = new Sentence(addSentence);
		sentences.add(addStentences);
	}

	@Override
	public String toString() {
		return sentences.toString();
	}

}
