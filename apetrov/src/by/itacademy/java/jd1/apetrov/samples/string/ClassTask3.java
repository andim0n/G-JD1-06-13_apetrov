package by.itacademy.java.jd1.apetrov.samples.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassTask3 {

	public static void main(String[] args) throws MalformedURLException, ProtocolException, IOException {
		String htmlContent = readFromUrl("https://tut.by");
		System.out.println(htmlContent);
		
		Pattern p = Pattern.compile("</div>");
		Matcher matcher = p.matcher(htmlContent);
		
		int divCount = 0;
		while (matcher.find()) {
			divCount++;
		}
		System.out.println(divCount);
	}

	// метод для запроса по http
	private static String readFromUrl(final String url) throws MalformedURLException, IOException, ProtocolException {
		final URL obj = new URL(url);
		final HttpURLConnection connection = (HttpURLConnection) obj.openConnection();

		connection.setRequestMethod("GET");
		String htmlString = null;
		try (final BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));) {
			String inputLine;
			final StringBuffer response = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
				htmlString = response.toString();
			}
		}
		return htmlString;
	}
}
