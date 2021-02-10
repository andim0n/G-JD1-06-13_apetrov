package by.itacademy.java.jd1.apetrov.practice.pak3_1.task3;

import java.io.IOException;
import java.nio.file.NoSuchFileException;

class Task3TestDrive {

	public static void main(final String[] args) {

		Task3 task = new Task3();

		try {
			Result words = task.countWords("sample");
			System.out.println(words);
		} catch (NoSuchFileException e) {
			System.out.println("Illegal filename");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
