package by.itacademy.java.jd1.apetrov.practice.pak2_1.car;

public class Engine {
	//
	private EngineType type;
	private int engineSize;
	private boolean started;

	public Engine(final int newEngine, final int newEngineSize) {
		this.type = EngineType.values()[newEngine];
		this.engineSize = newEngineSize;
		this.started = false;
	}

	public boolean isStart() {
		return started;
	}

	public void start() {
		this.started = true;
		System.out.println("\nEngine started");
	}

	public void stop() {
		this.started = false;
		System.out.println("\nEngine stoped");
	}

	public EngineType getType() {
		return type;
	}

	public void setType(final EngineType type) {
		this.type = type;
	}

	public double getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(final int engineSize) {
		this.engineSize = engineSize;
	}

	@Override
	public String toString() {
		return "Engine [type=" + type + ", engineSize=" + engineSize + ", isStart="
				+ started + "]";
	}

}
