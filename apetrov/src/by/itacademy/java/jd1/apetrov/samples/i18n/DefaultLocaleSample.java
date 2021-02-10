package by.itacademy.java.jd1.apetrov.samples.i18n;

import java.util.Locale;

public class DefaultLocaleSample {

	public static void main(String[] args) {

		Locale locale = Locale.getDefault();

		System.out.println(locale.getLanguage());
		System.out.println(locale.getCountry());
		System.out.println(locale.getDisplayName());

	}

}
