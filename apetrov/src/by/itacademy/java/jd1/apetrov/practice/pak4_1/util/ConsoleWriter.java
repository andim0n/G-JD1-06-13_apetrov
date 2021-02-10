package by.itacademy.java.jd1.apetrov.practice.pak4_1.util;

import java.util.Date;

import by.itacademy.java.jd1.apetrov.practice.pak4_1.clients.Client;
import by.itacademy.java.jd1.apetrov.practice.pak4_1.station.GasStation;
import by.itacademy.java.jd1.apetrov.practice.pak4_1.station.GasType;
import by.itacademy.java.jd1.apetrov.practice.pak4_1.station.Station;

public final class ConsoleWriter {

	private ConsoleWriter() {
	}

	public static void printMessage(final Station station, final String status,
			final Client client) {
		Date date = new Date();
		if (GasStation.getMessage() == MessageType.STATION) {
			System.out.printf("\n%tT | %s\n %s %s\n", date, station, status, client);
		}
	}

	public static void printMessage(final int stationID, final GasType type,
			final int before, final int after) {
		String additional = "";
		switch (type) {
		case A92:
			additional = "\t\t\t";
			break;
		case A95:
			additional = "\t\t\t\t\t";
			break;
		default:
			break;
		}
		Date date = new Date();
		if (GasStation.getMessage() == MessageType.STORAGE) {
			System.out.printf("\n%tT | [%s] %s %s: %s", date, stationID, additional, type,
					after);
		}
	}

	public static void printEndMessage() {
		System.out.println("\nGas station was stoped, because staroges is empty!");
	}

}
