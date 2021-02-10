package by.itacademy.java.jd1.apetrov.practice.excel;

public class Test {

	public static void main(final String[] args) {
		String key = "Z444";
		key = key.toUpperCase();
		// String pattern = "[A-Z][0-9]+";
		String pattern = "^[A-Z]([1-9][0-9]{0,2}|1000)$";
		System.out.println(key.matches(pattern));
	}

}
