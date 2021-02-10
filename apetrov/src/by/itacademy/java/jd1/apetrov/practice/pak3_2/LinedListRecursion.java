package by.itacademy.java.jd1.apetrov.practice.pak3_2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinedListRecursion {

	public static void main(final String[] args) {
		long timeStart = System.currentTimeMillis();

		int n = 10000;
		List<Integer> list = new LinkedList<Integer>();
		fillList(n, list);
		System.out.println("intial list:" + list);

		killEachEven(list, 1);

		System.out.println("list after filtering:" + list);

		long timeWork = System.currentTimeMillis() - timeStart;
		System.out.println(timeWork);

	}

	private static void killEachEven(final List<Integer> list, final int intiialIndex) {

		int index = intiialIndex;
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			iterator.next();
			if (isEven(index)) {
				iterator.remove();
			}
			index++;
		}

		if (list.size() > 1) {
			killEachEven(list, index);
		}
	}

	private static boolean isEven(final int index) {
		return index % 2 == 0;
	}

	private static void fillList(final int n, final List<Integer> list) {
		for (int i = 1; i <= n; i++) {
			list.add(i);
		}
	}

}
