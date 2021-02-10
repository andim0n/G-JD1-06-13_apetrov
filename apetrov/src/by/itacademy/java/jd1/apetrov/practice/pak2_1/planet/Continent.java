package by.itacademy.java.jd1.apetrov.practice.pak2_1.planet;

public class Continent {
	//
	private String name;
	private int area;
	private int population;

	public Continent(final String continentName, final int continentArea,
			final int continentPopulation) {
		super();
		this.name = continentName;
		this.area = continentArea;
		this.population = continentPopulation;
	}

	@Override
	public String toString() {
		return "\nContinent [continentName=" + name + ", continentArea="
				+ area + ", continentPopulation=" + population + "]";
	}

	public String getContinentName() {
		return name;
	}

	public void setContinentName(final String continentName) {
		this.name = continentName;
	}

	public int getContinentArea() {
		return area;
	}

	public void setContinentArea(final int continentArea) {
		this.area = continentArea;
	}

	public int getContinentPopulation() {
		return population;
	}

	public void setContinentPopulation(final int continentPopulation) {
		this.population = continentPopulation;
	}

}
