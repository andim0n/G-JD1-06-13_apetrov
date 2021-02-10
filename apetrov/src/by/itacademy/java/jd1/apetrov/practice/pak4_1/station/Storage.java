package by.itacademy.java.jd1.apetrov.practice.pak4_1.station;

import java.util.concurrent.atomic.AtomicInteger;

import by.itacademy.java.jd1.apetrov.practice.pak4_1.util.ConsoleWriter;

public class Storage {

	private AtomicInteger amount;
	private AtomicInteger reserve;

	public Storage(final int amount) {
		super();
		this.amount = new AtomicInteger(amount);
		this.reserve = new AtomicInteger(amount);
	}

	public boolean acceptFill(final int amount) {
		int reserveInt = reserve.get();
		if (reserveInt >= amount) {
			reserve.set(reserveInt - amount);
			return true;
		} else {
			return false;
		}
	}

	public void pump(final int stationID, final GasType type) {
		int before = amount.get();
		int after = amount.decrementAndGet();
		ConsoleWriter.printMessage(stationID, type, before, after);
	}

	@Override
	public String toString() {
		return String.format("%s [%s]", amount, reserve);
	}

	public AtomicInteger getAmount() {
		return amount;
	}

}
