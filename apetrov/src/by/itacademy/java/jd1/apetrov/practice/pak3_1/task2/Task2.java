package by.itacademy.java.jd1.apetrov.practice.pak3_1.task2;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

import org.jsoup.Jsoup;

public class Task2 {

	private String readFromUrl(final String url)
			throws MalformedURLException, IOException, ProtocolException {

		final URL obj = new URL(url);
		final HttpURLConnection connection = (HttpURLConnection) obj.openConnection();

		connection.setRequestMethod("GET");
		String htmlString = null;
		try (BufferedReader in = new BufferedReader(
				new InputStreamReader(connection.getInputStream()));) {
			String inputLine;
			final StringBuffer response = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
				htmlString = response.toString();
			}
		}
		return htmlString;
	}

	public void writeFile(final String url, final String fileName)
			throws MalformedURLException, ProtocolException, IOException {

		String content = readFromUrl(url);
		content = Jsoup.parse(content).text();
		String file = String.format("%s.txt", fileName);
		FileWriter fileWriter = new FileWriter(file);
		fileWriter.write(content);
		fileWriter.close();
	}

	private String readFile(final String fileName) throws IOException {

		String file = String.format("%s.txt", fileName);
		String content = new String(Files.readAllBytes(Paths.get(file)));
		content = content.toLowerCase();
		return content;
	}

	public Result selectWords(final String fileName) throws IOException {

		Set<String> words = new HashSet<String>();
		String textString = readFile(fileName);
		String[] textWords = textString.split(" ");

		for (String word : textWords) {
			word = word.replaceAll("[^A-Za-zА-Яа-я]", "");
			words.add(word);
		}
		return new Result(words);
	}
}
