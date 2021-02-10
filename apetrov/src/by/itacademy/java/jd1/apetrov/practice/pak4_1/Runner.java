package by.itacademy.java.jd1.apetrov.practice.pak4_1;

import by.itacademy.java.jd1.apetrov.practice.pak4_1.station.GasStation;
import by.itacademy.java.jd1.apetrov.practice.pak4_1.util.MessageType;

public final class Runner {

	private Runner() {
	}

	public static void main(final String[] args) {
		GasStation.startGasStation(MessageType.STORAGE);
		// use STORAGE - to monitor storage info
	}

}
