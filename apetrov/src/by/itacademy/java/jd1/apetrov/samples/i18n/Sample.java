package by.itacademy.java.jd1.apetrov.samples.i18n;

import java.util.Locale;
import java.util.ResourceBundle;

public class Sample {

	public static void main(String[] args) {

		Locale.setDefault(new Locale("ru"));
		Locale defLocale = Locale.getDefault();

		ResourceBundle bundle = ResourceBundle.getBundle("text", new UTF8Control());

		System.out.printf("%s %s", bundle.getString("excel.home.phrase1"), defLocale);

	}

}
