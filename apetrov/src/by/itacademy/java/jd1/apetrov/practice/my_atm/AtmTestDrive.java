package by.itacademy.java.jd1.apetrov.practice.my_atm;

public class AtmTestDrive {

	public static void main(String[] args) {
		Atm atm = new Atm();

		atm.getAtmBalance();
		atm.addMoney10(2);
		atm.getAtmBalance();
		atm.withdrawMoney(11);
	}

}
