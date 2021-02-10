package by.itacademy.java.jd1.apetrov.samples.horses;

import java.util.Random;

public class Utils {

	private Utils() {
		super();
	}

	public static int getRandomInt(int min, int max) {
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

}