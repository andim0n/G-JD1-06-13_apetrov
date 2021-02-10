package by.itacademy.java.jd1.apetrov.samples.string;

import java.io.IOException;

public class BuilderVSBuffer {

	public static void main(String[] args) throws IOException {
		executeTest(new StringBuilder()); // 		23595813
		executeTest(new StringBuffer());	//  	22509134
	}

	protected static void executeTest(Appendable sb) throws IOException {
		long ns1 = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			sb.append(i + "");
		}
		long ns2 = System.nanoTime();
		long duration = ns2 - ns1;

		System.out.printf("%s:%s", sb.getClass().getSimpleName(), duration);
		System.out.println();
	}
}