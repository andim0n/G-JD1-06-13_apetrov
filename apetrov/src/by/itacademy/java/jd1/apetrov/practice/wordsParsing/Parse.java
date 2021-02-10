package by.itacademy.java.jd1.apetrov.practice.wordsParsing;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Parse {

	public void parse(String fileName) throws IOException {

		String textString = readFile(fileName);
		textString = textString.toLowerCase();
		String[] textWords = textString.split(" ");

		for (String word : textWords) {
			word = word.replaceAll("[^A-Za-zА-Яа-я]", "");
			getFirstLetter(word);
		}

	}

	private String readFile(final String fileName) throws IOException {

		String file = String.format("%s.txt", fileName);
		String content = new String(Files.readAllBytes(Paths.get(file)));
		return content;
	}

	private void getFirstLetter(final String word) throws IOException {
		char firstSymbol = word.charAt(0);
		checkFolder(firstSymbol, word);
	}

	private void checkFolder(final char firstSymbol, final String word) throws IOException {
		String fs = Character.toString(firstSymbol);
		File folder = new File(fs);
		if (!(folder.exists())) {
			folder.mkdir();
		}
		writeWord(folder.getAbsolutePath(), word);
	}

	private void writeWord(final String path, final String word) throws IOException {
		String fileToAppend = String.format("%s/words.txt", path);
		File words = new File(fileToAppend);
		if (!(words.exists())) {
			PrintWriter writer = new PrintWriter(fileToAppend, "UTF-8");
			writer.close();
		}
		String addWord = word + "\n";
		Files.write(Paths.get(fileToAppend), addWord.getBytes(), StandardOpenOption.APPEND);
	}
}
