package by.itacademy.java.jd1.apetrov.samples.annotation.method;

public class Sample1 {

	public void test1() {
		System.out.println("execute method 1_1");
	}

	public void test2() {
		System.out.println("execute method 1_2");
	}

	@Autoexecutable
	public void test3() {
		System.out.println("execute method 1_3");
	}

}
