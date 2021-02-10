package by.itacademy.java.jd1.apetrov.samples.i18n;

import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class TimeZoneExample {

	public static void main(String[] args) {
		String[] ids = TimeZone.getAvailableIDs();

		for (String id : ids) {
			TimeZone timeZone = TimeZone.getTimeZone(id);
			System.out.println(timeZoneToString(timeZone));
		}
		System.out.println("Total TimeZone Id " + ids.length);
	}

	private static String timeZoneToString(TimeZone tz) {
		long hours = TimeUnit.MILLISECONDS.toHours(tz.getRawOffset());

		long minutes = TimeUnit.MILLISECONDS.toMinutes(tz.getRawOffset()) - TimeUnit.HOURS.toMinutes(hours);

		minutes = Math.abs(minutes);

		return String.format("(GMT%s%d:%02d) %s", (hours > 0 ? "+" : ""), hours, minutes, tz.getID());
	}

}
