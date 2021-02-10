package by.itacademy.java.jd1.apetrov.samples.io_file;

import java.io.File;

public class FileSample {

	public static void main(final String[] args) {
		showSamples(new File("input"));
		System.out.println("--------------");
		showSamples(new File("src/by/itacademy"));
	}

	private static void showSamples(final File file) {
		// apply File class methods on File object
		System.out.println("File name " + file.getName());
		System.out.println("Path: " + file.getPath());
		System.out.println("Absolute path: " + file.getAbsolutePath());
		System.out.println("Parent: " + file.getParent());
		System.out.println("Exists: " + file.exists());
		if (file.exists()) {
			System.out.println("Is writeable: " + file.canWrite());
			System.out.println("Is readable: " + file.canRead());
			System.out.println("Is a directory: " + file.isDirectory());
			System.out.println("File size in bytes: " + file.length());
		}
	}
}
