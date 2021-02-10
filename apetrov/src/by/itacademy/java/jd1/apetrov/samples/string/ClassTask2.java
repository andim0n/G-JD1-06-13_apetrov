package by.itacademy.java.jd1.apetrov.samples.string;

import java.util.Scanner;

public class ClassTask2 {

	public static void main(String[] args) {
		while (true) {

			System.out.print("Enter string: ");

			@SuppressWarnings("resource")
			String str = new Scanner(System.in).next();

			if (str.matches("[a-zA-Z]+")) {
				System.out.println("String has symbols only!");
			} else if (str.matches("-?[0-9]+")) {
				System.out.println("String has digits only!");
			} else {
				System.out.println("String has digts and symbols!");
			}
		}
	}

}
