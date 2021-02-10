package by.itacademy.java.jd1.apetrov.practice.pak2_1.republic;

import java.util.ArrayList;
import java.util.List;

public class Region {
	//
	private String regionName;
	private int regionArea;
	private int regionPopulation;
	private City regionCenter;
	private List<City> regionCities = new ArrayList<>();
	private List<Raion> regionRaions = new ArrayList<>();

	public Region(final String nameObl, final int areaObl, final int populationObl,
			final City centerObl, final ArrayList<City> citiesObl,
			final ArrayList<Raion> rayonsObl) {
		super();
		this.regionName = nameObl;
		this.regionArea = areaObl;
		this.regionPopulation = populationObl;
		this.regionCenter = centerObl;
		this.regionCities = citiesObl;
		this.regionRaions = rayonsObl;
	}

	@Override
	public String toString() {
		return "Obl [nameObl=" + regionName + ", areaObl=" + regionArea
				+ ", populationObl=" + regionPopulation + ", centerObl=" + regionCenter
				+ ", citiesObl=" + regionCities + ", rayonsObl=" + regionRaions + "]";
	}

	public String getNameObl() {
		return regionName;
	}

	public void setNameObl(final String nameObl) {
		this.regionName = nameObl;
	}

	public int getAreaObl() {
		return regionArea;
	}

	public void setAreaObl(final int areaObl) {
		this.regionArea = areaObl;
	}

	public int getPopulationObl() {
		return regionPopulation;
	}

	public void setPopulationObl(final int populationObl) {
		this.regionPopulation = populationObl;
	}

	public City getCenterObl() {
		return regionCenter;
	}

	public void setCenterObl(final City centerObl) {
		this.regionCenter = centerObl;
	}

	public List<City> getCitiesObl() {
		return regionCities;
	}

	public void setCitiesObl(final ArrayList<City> citiesObl) {
		this.regionCities = citiesObl;
	}

	public List<Raion> getRayonsObl() {
		return regionRaions;
	}

	public void setRayonsObl(final ArrayList<Raion> rayonsObl) {
		this.regionRaions = rayonsObl;
	}

}
