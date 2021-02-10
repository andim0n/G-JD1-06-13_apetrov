package by.itacademy.java.jd1.apetrov.samples.i18n;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatterSample {

	public static void main(String[] args) throws Throwable {

		Locale ruLocale = new Locale("ru", "RU");
		NumberFormat numFormat = NumberFormat.getNumberInstance(ruLocale);
		Number num = numFormat.parse("10,5");
		System.out.println(num.doubleValue());

		Locale enLocale = new Locale("en", "US");
		NumberFormat numFormat2 = NumberFormat.getNumberInstance(enLocale);
		Number num2 = numFormat2.parse("10,5");
		System.out.println(num2.doubleValue());
	}

}
