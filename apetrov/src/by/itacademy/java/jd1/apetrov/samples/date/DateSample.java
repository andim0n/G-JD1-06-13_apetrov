package by.itacademy.java.jd1.apetrov.samples.date;

import java.util.Calendar;

public class DateSample {

	public static void main(String[] args) {

		// Date date1 = new Date();
		// System.out.println(date1);

		Calendar instance = Calendar.getInstance();
		System.out.println("Initial date: ");
		System.out.println(instance.getTime());

		instance.add(Calendar.DATE, 3);
		System.out.println("After shift + 3 days:");
		System.out.println(instance.getTime());

		instance.add(Calendar.MINUTE, -4);
		System.out.println("After shift -4 minutes:");
		System.out.println(instance.getTime());
	}

}