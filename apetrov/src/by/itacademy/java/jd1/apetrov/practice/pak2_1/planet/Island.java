
package by.itacademy.java.jd1.apetrov.practice.pak2_1.planet;

public class Island {
	//
	private String name;
	private int area;

	public Island(final String islandName, final int islandArea) {
		super();
		this.name = islandName;
		this.area = islandArea;
	}

	@Override
	public String toString() {
		return "\nIsland [islandName=" + name + ", islandArea=" + area + "]";
	}

	public String getIslandName() {
		return name;
	}

	public void setIslandName(final String islandName) {
		this.name = islandName;
	}

	public int getIslandArea() {
		return area;
	}

	public void setIslandArea(final int islandArea) {
		this.area = islandArea;
	}

}
