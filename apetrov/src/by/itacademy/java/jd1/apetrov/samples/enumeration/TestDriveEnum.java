package by.itacademy.java.jd1.apetrov.samples.enumeration;

public class TestDriveEnum {

	public static void main(String[] args) {
		// to string
		System.out.println(DayEnum.TUESDAY.name());

		// to number
		System.out.println(DayEnum.WEDNESDAY.ordinal());

		// from string
		DayEnum monday = DayEnum.valueOf("MONDAY");
		System.out.println(monday);

		// from number
		DayEnum tuesday = DayEnum.values()[1];
		System.out.println(tuesday);
	}

}
