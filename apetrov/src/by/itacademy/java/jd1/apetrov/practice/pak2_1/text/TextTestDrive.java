package by.itacademy.java.jd1.apetrov.practice.pak2_1.text;

import java.util.ArrayList;

public class TextTestDrive {
	//
	public static void main(final String[] args) {
		TextTestDrive textTestDrive = new TextTestDrive();
		Text text1 = textTestDrive.makeNewText();
		System.out.print("\nTitle of the text:");
		text1.showTitle();

		System.out.print("\nText:");
		text1.showText();

		text1.addText("");
		System.out.print("\nResult:\n");
		text1.showTitle();
		text1.showText();

		text1.addText("");
		System.out.print("\nResult:\n");
		text1.showTitle();
		text1.showText();
	}

	public Text makeNewText() {

		// words
		Word dot = new Word(".");
		Word titleText = new Word("Title of text");
		Word word1 = new Word("The");
		Word word2 = new Word("first");
		Word word3 = new Word("sentence");
		Word word4 = new Word("Second");
		Word word5 = new Word("sentence");
		Word word6 = new Word("The");
		Word word7 = new Word("end");
		ArrayList<Word> newSentence1 = new ArrayList<>();
		newSentence1.add(word1);
		newSentence1.add(word2);
		newSentence1.add(word3);
		newSentence1.add(dot);
		ArrayList<Word> newSentence2 = new ArrayList<>();
		newSentence1.add(word4);
		newSentence1.add(word5);
		newSentence1.add(dot);
		ArrayList<Word> newSentence3 = new ArrayList<>();
		newSentence1.add(word6);
		newSentence1.add(word7);
		newSentence1.add(dot);

		// sentences
		Sentence sentence1 = new Sentence(newSentence1);
		Sentence sentence2 = new Sentence(newSentence2);
		Sentence sentence3 = new Sentence(newSentence3);
		ArrayList<Sentence> sentencec = new ArrayList<>();
		sentencec.add(sentence1);
		sentencec.add(sentence2);
		sentencec.add(sentence3);

		// text
		Text newText = new Text(titleText, sentencec);

		return newText;
	}

}
