package by.itacademy.java.jd1.apetrov.samples.input_output;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileReaderWriter {

	public static void main(final String[] args) throws IOException {
		// try with resources
		try (FileReader fis = new FileReader("input");
				FileWriter fos = new FileWriter("output.txt");) {
			int c;
			while ((c = fis.read()) != -1) {
				fos.write(c);
			}

		}
	}
}