package by.itacademy.java.jd1.apetrov.samples.annotation.method;

public class Sample3 {

	public void test1() {
		System.out.println("execute method 3_1");
	}

	@Autoexecutable
	public void test2() {
		System.out.println("execute method 3_2");
	}

	public void test3() {
		System.out.println("execute method 3_3");
	}

}
