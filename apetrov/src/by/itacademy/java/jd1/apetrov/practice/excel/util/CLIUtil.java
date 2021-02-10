package by.itacademy.java.jd1.apetrov.practice.excel.util;

import java.util.List;
import java.util.Scanner;

import by.itacademy.java.jd1.apetrov.practice.excel.commands.other.ICommand;

public class CLIUtil {
	private static Scanner scanner = new Scanner(System.in);

	private CLIUtil() {
	}

	public static String readConsole() {
		return scanner.nextLine();
	}

	public static String readAdress() {
		String adress = readConsole();
		adress = adress.toUpperCase();
		String pattern = "^[A-Z]([1-9][0-9]{0,2}|1000)$";
		while (!adress.matches(pattern)) {
			System.out.printf("\nIncorrect adress, try again:\n");
			adress = readConsole();
			adress = adress.toUpperCase();
		}
		return adress;
	}

	public static void selectAndExecute(final List<ICommand> commands) {

		System.out.print("\nselect next command:\n");

		ICommand selectedCommand = null;
		while (selectedCommand == null) {
			for (ICommand iCommand : commands) {
				System.out.println("-" + iCommand.getName());
			}
			String selectedCommandName = CLIUtil.readConsole();
			for (ICommand iCommand : commands) {
				if (iCommand.getName().equals(selectedCommandName)) {
					selectedCommand = iCommand;
					break;
				}
			}

			if (selectedCommand == null) {
				System.out.println("wrong command. please try again");
			}
		}
		selectedCommand.execute();
	}
}
