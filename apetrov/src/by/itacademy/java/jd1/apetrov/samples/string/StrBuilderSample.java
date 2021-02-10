package by.itacademy.java.jd1.apetrov.samples.string;

public class StrBuilderSample {
	public static void main(String argv[]) {
		String str = "Im learning Java";
		StringBuilder strBuilder = new StringBuilder(str);
		strBuilder.append(" and english need too");
		System.out.println(strBuilder);
		
	}

}
