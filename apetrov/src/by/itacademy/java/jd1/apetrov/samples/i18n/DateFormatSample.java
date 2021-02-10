package by.itacademy.java.jd1.apetrov.samples.i18n;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatSample {

	public static void main(String[] args) {

		Locale ruLocale = new Locale("ru", "RU");

		Date currentDate = new Date();
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, ruLocale);
		System.out.println(df.format(currentDate));
	}

}
