package by.itacademy.java.jd1.apetrov.practice.pak2_1.republic;

import java.util.ArrayList;
import java.util.List;

public class Gos {
	//
	private String nameGos;
	private int populationGos;
	private int areaGos;
	private City capitalGos;
	private List<Region> oblasti = new ArrayList<>();

	// task methods
	public void showCapital() {
		String capital = capitalGos.getNameCity();
		System.out.printf("\nСтолица %s - %s", nameGos, capital);
	}

	public void showCountObl() {
		System.out.printf("\nКоличство областей %s - %d", nameGos, oblasti.size());
	}

	public void showArea() {
		System.out.printf("\nПлащадь %s - %d км2", nameGos, areaGos);
	}

	public void showOblCenters() {
		System.out.printf("\nОбластные центры %s:", nameGos);
		for (Region obl : oblasti) {
			City city = obl.getCenterObl();
			String nameSity = city.getNameCity();
			System.out.printf("\n%s", nameSity);
		}
	}

	// unused methods
	@Override
	public String toString() {
		return "Gos [nameGos=" + nameGos + ", populationGos=" + populationGos
				+ ", areaGos=" + areaGos + ", capitalGos=" + capitalGos + ", oblasti="
				+ oblasti + "]";
	}

	public String getNameGos() {
		return nameGos;
	}

	public void setNameGos(final String nameGos) {
		this.nameGos = nameGos;
	}

	public int getPopulationGos() {
		return populationGos;
	}

	public void setPopulationGos(final int populationGos) {
		this.populationGos = populationGos;
	}

	public int getAreaGos() {
		return areaGos;
	}

	public void setAreaGos(final int areaGos) {
		this.areaGos = areaGos;
	}

	public City getCapitalGos() {
		return capitalGos;
	}

	public void setCapitalGos(final City capitalGos) {
		this.capitalGos = capitalGos;
	}

	public List<Region> getOblasti() {
		return oblasti;
	}

	public void setOblasti(final ArrayList<Region> oblasti) {
		this.oblasti = oblasti;
	}

}
