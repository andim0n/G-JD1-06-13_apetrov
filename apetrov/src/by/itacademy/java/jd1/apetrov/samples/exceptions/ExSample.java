package by.itacademy.java.jd1.apetrov.samples.exceptions;

import java.io.FileNotFoundException;
import java.net.UnknownHostException;

public class ExSample {
	static int i = 1;

	public static void main(String[] args) {
		try {
			method1();
		} catch (FileNotFoundException | UnknownHostException e) {
			e.printStackTrace();
		}

	}

	private static void method1() throws FileNotFoundException, UnknownHostException {
		method2();
	}

	private static void method2() throws FileNotFoundException, UnknownHostException {
		method3();
	}

	private static void method3() throws FileNotFoundException, UnknownHostException {
		if (i == 0) {
			throw new RuntimeException();
		} else if (i == 1) {
			throw new FileNotFoundException();
		} else if (i == 2) {
			throw new UnknownHostException();
		}
	}

}
