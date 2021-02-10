package by.itacademy.java.jd1.apetrov.practice.pak4_1.util;

import java.util.Random;

import by.itacademy.java.jd1.apetrov.practice.pak4_1.station.GasType;

public final class Utils {

	private Utils() {
	}

	public static int getRandomInt(final int min, final int max) {
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

	public static GasType getRandomGasType() {
		int randomInt = getRandomInt(1, 3);
		GasType randomGasType = GasType.A92;
		switch (randomInt) {
		case 1:
			randomGasType = GasType.A95;
			break;
		case 2:
			randomGasType = GasType.A92;
			break;
		case 3:
			randomGasType = GasType.DT;
			break;
		default:
			break;
		}
		return randomGasType;
	}

}
