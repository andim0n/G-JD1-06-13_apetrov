package by.itacademy.java.jd1.apetrov.practice.wordsParsing;

import java.io.IOException;

class ParseTest {

	public static void main(final String[] args) {

		Parse task = new Parse();

		try {
			task.parse("sample");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
