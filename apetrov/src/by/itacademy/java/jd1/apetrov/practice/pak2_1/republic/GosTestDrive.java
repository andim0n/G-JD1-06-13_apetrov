package by.itacademy.java.jd1.apetrov.practice.pak2_1.republic;

import java.util.ArrayList;

public class GosTestDrive {
	//
	public static void main(final String[] args) {
		GosTestDrive gosTestDrive = new GosTestDrive();
		Gos belarus = gosTestDrive.makeNewGos();
		belarus.showCapital();
		belarus.showCountObl();
		belarus.showArea();
		belarus.showOblCenters();

	}

	public Gos makeNewGos() {

		// cities
		City minsk = new City("Минск", 1_982_444);
		City grodno = new City("Гродно", 370_919);
		City lida = new City("Лида", 101_616);
		City gomel = new City("Гомель", 535_693);
		City mozir = new City("Мозырь", 111_733);

		ArrayList<City> grodnoSities = new ArrayList<>();
		grodnoSities.add(lida);
		grodnoSities.add(grodno);

		ArrayList<City> gomelSities = new ArrayList<>();
		gomelSities.add(gomel);
		gomelSities.add(mozir);

		// raions
		Raion volkoviskiy = new Raion("Волковысский", 69_720);
		Raion dyatlovski = new Raion("Дятловский", 24_351);

		ArrayList<Raion> grodnoRayons = new ArrayList<>();
		grodnoRayons.add(volkoviskiy);
		grodnoRayons.add(dyatlovski);

		Raion braginskiy = new Raion("Брагинский", 11_912);
		Raion gomelskiy = new Raion("Гомельский", 68_210);

		ArrayList<Raion> gomelRayons = new ArrayList<>();
		gomelRayons.add(braginskiy);
		gomelRayons.add(gomelskiy);

		// obl
		Region grodnenskaya = new Region("Гродненская", 25_126, 1_043_697, grodno, grodnoSities, grodnoRayons);
		Region gomelskaya = new Region("Гомельская", 40_371, 1_415_761, gomel, gomelSities, gomelRayons);

		ArrayList<Region> oblasti = new ArrayList<>();
		oblasti.add(gomelskaya);
		oblasti.add(grodnenskaya);

		// gos
		Gos newGos = new Gos();
		newGos.setNameGos("Belarus");
		newGos.setPopulationGos(9_491_823);
		newGos.setAreaGos(207_600);
		newGos.setCapitalGos(minsk);
		newGos.setOblasti(oblasti);

		return newGos;
	}

}
