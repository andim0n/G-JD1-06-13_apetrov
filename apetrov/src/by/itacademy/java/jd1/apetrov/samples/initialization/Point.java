package by.itacademy.java.jd1.apetrov.samples.initialization;

public class Point extends Object {
	private int x1, y;

	public Point(int x, int y) {
		super();
		x1 = x;
		this.y = y;
	}

	public Point() {
		this(-1, -1);
		System.out.println(x1 + y);
	}

}