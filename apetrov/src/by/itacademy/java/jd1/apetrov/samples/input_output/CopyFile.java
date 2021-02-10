package by.itacademy.java.jd1.apetrov.samples.input_output;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(final String[] args) throws IOException {
		// try with resources
		try (FileInputStream reader = new FileInputStream("input");
				FileOutputStream writerr = new FileOutputStream("output.txt");) {
			int c;
			while ((c = reader.read()) != -1) {
				writerr.write(c);
			}

		}
	}
}