
package by.itacademy.java.jd1.apetrov.samples.annotation.sample1;

public class Test {

	public static void main(String[] args) {
		Sample1 sample1 = new Sample1();
		Sample2 sample2 = new Sample2();
		Sample3 sample3 = new Sample3();

		printClassVersion(sample1);
		printClassVersion(sample2);
		printClassVersion(sample3);
	}

	private static void printClassVersion(Object sample) {
		Class<? extends Object> clazz = sample.getClass();
		Version versionAnnotation = clazz.getAnnotation(Version.class);
		if (versionAnnotation != null) {
			String versionNumber = versionAnnotation.versionNumber();
			System.out.printf("version of class %s = %s\n", clazz.getSimpleName(), versionNumber);
		} else {
			System.out.println("annotation version not found!");
		}
	}

}