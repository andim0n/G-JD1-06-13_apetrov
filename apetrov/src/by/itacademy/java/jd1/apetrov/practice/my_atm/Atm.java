package by.itacademy.java.jd1.apetrov.practice.my_atm;

public class Atm {

	private int fiftyBills;
	private int twentyBills;
	private int tenBills;

	public int getMoney50() {
		return fiftyBills;
	}

	public void addMoney50(int addValue) {
		this.fiftyBills += addValue;
	}

	public void takeMoney50(int takeValue) {
		this.fiftyBills -= takeValue;
	}

	public int getMoney20() {
		return twentyBills;
	}

	public void addMoney20(int addValue) {
		this.twentyBills += addValue;
	}

	public void takeMoney20(int takeValue) {
		this.twentyBills -= takeValue;
	}

	public int getMoney10() {
		return tenBills;
	}

	public void addMoney10(int addValue) {
		this.tenBills += addValue;
	}

	public void takeMoney10(int takeValue) {
		this.tenBills -= takeValue;
	}

	public void getAtmBalance() {
		System.out.printf("\nIn atm: %dx50, %dx20, %dx10", getMoney50(), getMoney20(), getMoney10());
	}

	public void withdrawMoney(int sum) {

		if (!checkCorrectSum(sum)) {
			printError(1);
			return;
		}

		int sumLeft = sum;
		int giveFifty = 0;
		int giveTwenty = 0;
		int giveTen = 0;

		while (sumLeft - 50 >= 0 && getMoney50() > 0) {
			giveFifty++;
			takeMoney50(1);
			sumLeft -= 50;
		}
		while (sumLeft - 20 >= 0 && getMoney20() > 0) {
			giveTwenty++;
			takeMoney20(1);
			sumLeft -= 20;
		}
		while (sumLeft - 10 >= 0 && getMoney10() > 0) {
			giveTen++;
			takeMoney10(1);
			sumLeft -= 10;
		}

		if (checkSum(sum, giveFifty, giveTwenty, giveTen)) {
			giveMoney(giveFifty, giveTwenty, giveTen);
		} else {
			dontGiveMoney(giveFifty, giveTwenty, giveTen);
		}

	}

	public boolean checkCorrectSum(int sum) {
		if (sum % 10 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public void printError(int numberError) {
		switch (numberError) {
		case 1:
			System.out.print("\nWrong amount!");
			System.out.print("\nATM gives only 10, 20 and 50 banknotes!");
			break;
		case 2:
			System.out.print("\nSorry, there are not enough banknotes in the ATM!");
			break;
		default:
			System.out.print("\nError!");
			break;
		}

	}

	public boolean checkSum(int sum, int valueFifty, int valueTwenty, int valueTen) {
		if (sum == (valueFifty * 50) + (valueTwenty * 20) + (valueTen * 10)) {
			return true;
		} else {
			return false;
		}
	}

	public void giveMoney(int valueFifty, int valueTwenty, int valueTen) {
		System.out.printf("\nput your's %dx50, %dx20, %dx10", valueFifty, valueTwenty, valueTen);
	}

	public void dontGiveMoney(int valueFifty, int valueTwenty, int valueTen) {
		printError(2);
		addMoney50(valueFifty);
		addMoney20(valueTwenty);
		addMoney10(valueTen);
	}
}
