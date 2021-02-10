package by.itacademy.java.jd1.apetrov.samples.parametrization;

public class Box<T, K> {

	private T value1;
	private K value2;

	public T getValue1() {
		return value1;
	}

	public void setValue1(T value) {
		this.value1 = value;
	}

	public K getValue2() {
		return value2;
	}

	public void setValue2(K value2) {
		this.value2 = value2;
	}

}
