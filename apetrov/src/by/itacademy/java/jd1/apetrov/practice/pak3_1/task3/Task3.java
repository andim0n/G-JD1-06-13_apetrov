package by.itacademy.java.jd1.apetrov.practice.pak3_1.task3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

	private String readFile(final String fileName) throws IOException {

		String file = String.format("%s.txt", fileName);
		String content = new String(Files.readAllBytes(Paths.get(file)));
		content = content.toLowerCase();
		return content;
	}

	public Result countWords(final String fileName) throws IOException {

		Map<String, Integer> words = new HashMap<String, Integer>();
		String textString = readFile(fileName);
		String[] textWords = textString.split(" ");

		for (String word : textWords) {
			word = word.replaceAll("[^A-Za-zА-Яа-я]", "");
			Pattern p = Pattern.compile(word);
			Matcher matcher = p.matcher(textString);
			int i = 1;

			while (matcher.find()) {
				i++;
			}

			words.put(word, i);
		}
		return new Result(words);
	}
}
