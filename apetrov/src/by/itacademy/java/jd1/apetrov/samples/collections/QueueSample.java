package by.itacademy.java.jd1.apetrov.samples.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueSample {

	public static void main(String[] args) {
		 Queue<String> queue = new LinkedList<String>();
		queue.add("element 1");
		queue.add("element 2");
		queue.add("element 3");
		System.out.println(queue.peek());
	}

}
