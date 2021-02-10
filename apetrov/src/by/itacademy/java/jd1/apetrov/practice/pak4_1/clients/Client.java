package by.itacademy.java.jd1.apetrov.practice.pak4_1.clients;

import by.itacademy.java.jd1.apetrov.practice.pak4_1.station.GasType;
import by.itacademy.java.jd1.apetrov.practice.pak4_1.util.Utils;

public class Client {

	private static int counter = 0;
	private int id;
	private GasType type;
	private int amount;

	public Client() {
		this.id = counter;
		counter++;
		this.type = Utils.getRandomGasType();
		this.amount = Utils.getRandomInt(1, 10);
	}

	@Override
	public String toString() {
		return String.format("Client[%s] %s liters of %s", id, amount, type);
	}

	public GasType getType() {
		return type;
	}

	public int getAmount() {
		return amount;
	}

}
