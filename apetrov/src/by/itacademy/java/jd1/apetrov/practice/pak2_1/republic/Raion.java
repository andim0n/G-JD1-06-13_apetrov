package by.itacademy.java.jd1.apetrov.practice.pak2_1.republic;

public class Raion {
	//
	private String raionName;
	private int raionPopulation;

	public Raion(final String nameRayon, final int populationRayon) {
		super();
		this.raionName = nameRayon;
		this.raionPopulation = populationRayon;
	}

	@Override
	public String toString() {
		return " Rayon [nameRayon=" + raionName + ", populationRayon=" + raionPopulation
				+ "]";
	}

	public String getNameRayon() {
		return raionName;
	}

	public void setNameRayon(final String nameRayon) {
		this.raionName = nameRayon;
	}

	public int getPopulationRayon() {
		return raionPopulation;
	}

	public void setPopulationRayon(final int populationRayon) {
		this.raionPopulation = populationRayon;
	}

}
