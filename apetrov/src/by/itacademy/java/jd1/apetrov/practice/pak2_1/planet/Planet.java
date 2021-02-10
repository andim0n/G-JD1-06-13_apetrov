
package by.itacademy.java.jd1.apetrov.practice.pak2_1.planet;

import java.util.ArrayList;
import java.util.List;

public class Planet {
	//
	private String name;
	private List<Continent> continents;
	private List<Island> islands;
	private List<Ocean> oceans;

	public void showPlanetName() {
		System.out.printf("Name planet: %s", name);
	}

	public void showContinentName() {
		System.out.printf("\nNames of continents planet %s:", name);
		for (Continent continent : continents) {
			System.out.printf("\nName continent: %s", continent.getContinentName());
		}
	}

	public void showContinentCount() {
		int numberCont = continents.size();
		System.out.printf("\nNumber of continents of the planet %s: %d", name,
				numberCont);
	}

	public Planet(final String planetName, final ArrayList<Continent> continents,
			final ArrayList<Island> islands, final ArrayList<Ocean> oceans) {
		super();
		this.name = planetName;
		this.continents = continents;
		this.islands = islands;
		this.oceans = oceans;
	}

	@Override
	public String toString() {
		return "Planet [planetName=" + name + ", \ncontinents=" + continents
				+ ", \nislands=" + islands + ", \noceans=" + oceans + "]";
	}

	public String getPlanetName() {
		return name;
	}

	public void setPlanetName(final String planetName) {
		this.name = planetName;
	}

	public List<Continent> getContinents() {
		return continents;
	}

	public void setContinents(final ArrayList<Continent> continents) {
		this.continents = continents;
	}

	public List<Island> getIslands() {
		return islands;
	}

	public void setIslands(final ArrayList<Island> islands) {
		this.islands = islands;
	}

	public List<Ocean> getOceans() {
		return oceans;
	}

	public void setOceans(final ArrayList<Ocean> oceans) {
		this.oceans = oceans;
	}

}
