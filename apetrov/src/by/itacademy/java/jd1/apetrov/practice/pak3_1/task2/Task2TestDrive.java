package by.itacademy.java.jd1.apetrov.practice.pak3_1.task2;

import java.io.IOException;
import java.net.UnknownHostException;
import java.nio.file.NoSuchFileException;

class Task2TestDrive {

	public static void main(final String[] args) {

		Task2 task = new Task2();

		try {
			task.writeFile("https://tut.by", "tutbyText");
			Result words = task.selectWords("tutbyText");
			System.out.println(words);
		} catch (UnknownHostException e) {
			System.out.println("Incorrect url");
			e.printStackTrace();
		} catch (NoSuchFileException e) {
			System.out.println("Incorrect filename");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
