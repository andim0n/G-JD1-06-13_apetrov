package by.itacademy.java.jd1.apetrov.practice.pak4_1.station;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import by.itacademy.java.jd1.apetrov.practice.pak4_1.clients.ClientsQueue;
import by.itacademy.java.jd1.apetrov.practice.pak4_1.util.ConsoleWriter;
import by.itacademy.java.jd1.apetrov.practice.pak4_1.util.MessageType;

public final class GasStation {

	private static MessageType message;
	private static List<Thread> threads = new ArrayList<Thread>();

	private GasStation() {
	}

	public static void startGasStation(final MessageType typeOfMessage) {
		message = typeOfMessage;
		createGasStation();
		for (Thread thread : threads) {
			thread.start();
		}
	}

	public static void stopGasStation() {
		for (Thread thread : threads) {
			thread.interrupt();
		}
		ConsoleWriter.printEndMessage();
	}

	private static void createGasStation() {
		HashMap<GasType, Storage> gas = new HashMap<GasType, Storage>();
		gas.put(GasType.A95, new Storage(200));
		gas.put(GasType.A92, new Storage(200));
		gas.put(GasType.DT, new Storage(200));

		ClientsQueue clients = new ClientsQueue();
		clients.setDaemon(true);
		clients.start();

		for (int i = 0; i < 105; i++) {
			threads.add(new Thread(new Station(gas, clients)));
		}
	}

	public static MessageType getMessage() {
		return message;
	}

}
