
package by.itacademy.java.jd1.apetrov.practice.pak2_1.planet;

public class Ocean {
	//
	private String name;
	private int area;
	private int size;

	public Ocean(final String oceanName, final int oceanArea, final int ocieanSize) {
		super();
		this.name = oceanName;
		this.area = oceanArea;
		this.size = ocieanSize;
	}

	@Override
	public String toString() {
		return "\nOcean [oceanName=" + name + ", oceanArea=" + area
				+ ", ocieanSize=" + size + "]";
	}

	public String getOceanName() {
		return name;
	}

	public void setOceanName(final String oceanName) {
		this.name = oceanName;
	}

	public int getOceanArea() {
		return area;
	}

	public void setOceanArea(final int oceanArea) {
		this.area = oceanArea;
	}

	public int getOcieanSize() {
		return size;
	}

	public void setOcieanSize(final int ocieanSize) {
		this.size = ocieanSize;
	}

}
