package by.itacademy.java.jd1.apetrov.practice.pak2_1.planet;

import java.util.ArrayList;

public class PlanetTestDrive {
	//
	public static void main(final String[] args) {
		PlanetTestDrive planetTestDrive = new PlanetTestDrive();
		Planet earth = planetTestDrive.makeNewPlanet();
		// System.out.println(earth.toString());
		earth.showPlanetName();
		earth.showContinentName();
		earth.showContinentCount();
	}

	public Planet makeNewPlanet() {

		// oceans
		Ocean atlantic = new Ocean("Atlantic", 91, 329);
		Ocean indian = new Ocean("Indian", 73, 292);
		Ocean arctic = new Ocean("Arctic", 14, 18);
		Ocean pacific = new Ocean("Pacific Ocean", 169, 710);
		Ocean south = new Ocean("South ocean", 20, 0);
		ArrayList<Ocean> newOceans = new ArrayList<>();
		newOceans.add(atlantic);
		newOceans.add(indian);
		newOceans.add(arctic);
		newOceans.add(pacific);
		newOceans.add(south);

		// continents
		Continent asia = new Continent("Asia", 43, 4_366);
		Continent africa = new Continent("Africa", 30, 1_200);
		Continent europe = new Continent("Europe", 10, 742);
		Continent northAmerica = new Continent("North America", 24, 566);
		Continent southAmerica = new Continent("South America", 17, 418);
		Continent australia = new Continent("Australia", 7, 39);
		Continent antarctida = new Continent("Antarctida", 14, 0);
		ArrayList<Continent> newContinents = new ArrayList<>();
		newContinents.add(asia);
		newContinents.add(africa);
		newContinents.add(europe);
		newContinents.add(northAmerica);
		newContinents.add(southAmerica);
		newContinents.add(australia);
		newContinents.add(antarctida);

		// islands
		Island greenland = new Island("Greenland", 2_130);
		Island newGuinea = new Island("New Guinea", 785);
		Island kalimantan = new Island("Kalimantan", 748);
		Island madagascar = new Island("Madagascar", 587);
		Island baffinLand = new Island("Baffin Land", 507);
		Island sumatra = new Island("Sumatra", 433);
		ArrayList<Island> newIslands = new ArrayList<>();
		newIslands.add(greenland);
		newIslands.add(newGuinea);
		newIslands.add(kalimantan);
		newIslands.add(madagascar);
		newIslands.add(baffinLand);
		newIslands.add(sumatra);

		// planet
		Planet newPlanet = new Planet("Earth", newContinents, newIslands, newOceans);

		return newPlanet;
	}

}
