package by.itacademy.java.jd1.apetrov.practice.pak4_1.station;

import java.util.HashMap;

import by.itacademy.java.jd1.apetrov.practice.pak4_1.clients.Client;
import by.itacademy.java.jd1.apetrov.practice.pak4_1.clients.ClientsQueue;
import by.itacademy.java.jd1.apetrov.practice.pak4_1.util.ConsoleWriter;

public class Station implements Runnable {

	private static final int FILL_TIME = 1_000;
	private static int counter = 1;
	private int id;
	private HashMap<GasType, Storage> station;
	private ClientsQueue clients;

	public Station(final HashMap<GasType, Storage> gas,
			final ClientsQueue clients) {
		synchronized (this) {
			this.id = counter;
			counter++;
		}
		this.station = gas;
		this.clients = clients;
	}

	@Override
	public void run() {
		while (true) {
			if (!Thread.interrupted()) {
				Client client = clients.getClients().poll();
				GasType type = client.getType();
				Storage storage = station.get(type);
				int amount = client.getAmount();

				if (storage.acceptFill(amount)) {
					ConsoleWriter.printMessage(this, "Start fueling", client);
					try {
						fill(storage, amount, type);
					} catch (InterruptedException e) {
						return;
					}
				} else {
					ConsoleWriter.printMessage(this, "Deny fueling", client);
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						return;
					}
					if (isEmpty()) {
						GasStation.stopGasStation();
					}
					continue;
				}
				ConsoleWriter.printMessage(this, "End of fueling", client);
			} else {
				return;
			}
		}
	}

	private void fill(final Storage storage, final int amount, final GasType type)
			throws InterruptedException {
		for (int i = 1; i <= amount; i++) {
			Thread.sleep(FILL_TIME);
			storage.pump(id, type);
		}
	}

	private boolean isEmpty() {
		boolean result = true;
		for (Storage storage : station.values()) {
			if ((storage.getAmount().get()) >= 1) {
				return false;
			}
		}
		return result;
	}

	public int getId() {
		return id;
	}

	public HashMap<GasType, Storage> getGas() {
		return station;
	}

	public ClientsQueue getClients() {
		return clients;
	}

	@Override
	public String toString() {
		return String.format("Station #%s: %s", id, station);
	}

}
