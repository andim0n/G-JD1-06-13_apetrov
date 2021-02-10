package by.itacademy.java.jd1.apetrov.samples.i18n;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatSample {

	public static void main(String[] args) {

		Locale ruLocale = new Locale("ru", "RU");
		NumberFormat rubFormat = NumberFormat.getCurrencyInstance(ruLocale);
		System.out.println(rubFormat.format(10000));

		Locale enLocale = new Locale("en", "US");
		NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(enLocale);
		System.out.println(dollarFormat.format(10000));
		
		Locale gbLocale = new Locale("en", "GB");
		NumberFormat poundFormat = NumberFormat.getCurrencyInstance(gbLocale);
		System.out.println(poundFormat.format(10000));

	}

}
