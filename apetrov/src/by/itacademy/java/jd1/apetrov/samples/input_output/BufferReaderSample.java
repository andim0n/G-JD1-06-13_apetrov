package by.itacademy.java.jd1.apetrov.samples.input_output;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReaderSample {

	public static void main(final String[] args) {
		String thisLine = null;

		try (BufferedReader bufferedReader = new BufferedReader(
				new FileReader("input"));) {

			while ((thisLine = bufferedReader.readLine()) != null) {
				System.out.println(thisLine);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
