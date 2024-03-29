package by.itacademy.java.jd1.apetrov.practice.pak1_1;

import java.util.Scanner;

public class Task1 {

	private Scanner inputMonth;

	public static void main(final String[] args) {
		Task1 objectMonth = new Task1();
		int monthNum = objectMonth.inputMonth();
		objectMonth.getMonth(monthNum);
	}

	private int inputMonth() {
		inputMonth = new Scanner(System.in);
		int inputNumber;
		do {
			System.out.println("Please enter number of the month (1-12): ");
			while (!inputMonth.hasNextInt()) {
				System.out.println("This not a number! Try again: ");
				inputMonth.next();
			}
			inputNumber = inputMonth.nextInt();
		} while (!(inputNumber >= 1 && inputNumber <= 12));
		return inputNumber;
	}

	private void getMonth(int numberMonth) {
		String[] numberOfMonths = { "January", "February", "March", "April", "May", "June", "July", "August",
				"September", "October", "November", "December" };
		System.out.println(numberOfMonths[numberMonth - 1]);
	}

}