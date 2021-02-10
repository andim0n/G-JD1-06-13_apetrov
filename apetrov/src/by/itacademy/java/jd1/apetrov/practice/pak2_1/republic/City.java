package by.itacademy.java.jd1.apetrov.practice.pak2_1.republic;

public class City {
	//
	private String nameCity;
	private int populationCity;

	public City(final String nameCity, final int populationCity) {
		super();
		this.nameCity = nameCity;
		this.populationCity = populationCity;
	}

	@Override
	public String toString() {
		return "City [nameCity=" + nameCity + ", populationCity=" + populationCity + "]";
	}

	public String getNameCity() {
		return nameCity;
	}

	public void setNameCity(final String nameCity) {
		this.nameCity = nameCity;
	}

	public int getPopulationCity() {
		return populationCity;
	}

	public void setPopulationCity(final int populationCity) {
		this.populationCity = populationCity;
	}

}
