package by.itacademy.java.jd1.apetrov.samples.i18n;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZonedDateTimeExample {

	private static final String DATE_FORMAT = "dd-M-yyy hh:mm:ss a";

	public static void main(String[] args) {

		String dateInString = "22-1-2015 10:15:55 AM";
		LocalDateTime ldt = LocalDateTime.parse(dateInString, DateTimeFormatter.ofPattern(DATE_FORMAT));

		ZoneId singaporeZoneId = ZoneId.of("Asia/Singapore");
		System.out.println("TimeZone : " + singaporeZoneId);

		// local datetime + zoneid = zonedatetime
		ZonedDateTime asiaZonedDateTime = ldt.atZone(singaporeZoneId);
		System.out.println("Date (Singapore) : " + asiaZonedDateTime);

		ZoneId newYorkZoneId = ZoneId.of("America/New_York");
		System.out.println("TimeZone : " + newYorkZoneId);

		ZonedDateTime nyDateTime = asiaZonedDateTime.withZoneSameInstant(newYorkZoneId);
		System.out.println("Date (New York) : " + nyDateTime);

		DateTimeFormatter format = DateTimeFormatter.ofPattern(DATE_FORMAT);
		System.out.println("\n---DateTimeFormatter---");
		System.out.println("Date Singapore : " + format.format(asiaZonedDateTime));
		System.out.println("Date NewYork : " + format.format(nyDateTime));

	}

}
