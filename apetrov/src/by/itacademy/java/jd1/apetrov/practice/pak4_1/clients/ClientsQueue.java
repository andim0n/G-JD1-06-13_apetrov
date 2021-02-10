package by.itacademy.java.jd1.apetrov.practice.pak4_1.clients;

import java.util.concurrent.ArrayBlockingQueue;

public class ClientsQueue extends Thread {
	private static final int QUEUE_LENGTH = 50;
	private ArrayBlockingQueue<Client> clients;

	public ClientsQueue() {
		this.clients = new ArrayBlockingQueue<>(QUEUE_LENGTH);
		for (int i = 0; i < QUEUE_LENGTH; i++) {
			this.clients.add(new Client());
		}
	}

	@Override
	public void run() {
		while (true) {
			if (clients.size() < QUEUE_LENGTH) {
				clients.offer(new Client());
			}
		}
	}

	public ArrayBlockingQueue<Client> getClients() {
		return clients;
	}

}
