package by.itacademy.java.jd1.apetrov.practice.pak2_1.car;

public class Wheel {
	//
	private DiscType type;
	private int radius;
	private double pressure;

	public Wheel(final int discType, final int radius, final double pressure) {
		super();
		this.type = DiscType.values()[discType];
		this.radius = radius;
		this.pressure = pressure;
	}

	public DiscType getType() {
		return type;
	}

	public void setType(final DiscType type) {
		this.type = type;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(final int radius) {
		this.radius = radius;
	}

	public double getPressure() {
		return pressure;
	}

	public void setPressure(final double pressure) {
		this.pressure = pressure;
	}

	@Override
	public String toString() {
		return "Wheel [type=" + type + ", radius=" + radius + ", pressure=" + pressure + "]";
	}

}
