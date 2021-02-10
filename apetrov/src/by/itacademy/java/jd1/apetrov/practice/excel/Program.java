package by.itacademy.java.jd1.apetrov.practice.excel;

import java.util.ArrayList;
import java.util.List;

import by.itacademy.java.jd1.apetrov.practice.excel.commands.CreateDoc;
import by.itacademy.java.jd1.apetrov.practice.excel.commands.Exit;
import by.itacademy.java.jd1.apetrov.practice.excel.commands.OpenDoc;
import by.itacademy.java.jd1.apetrov.practice.excel.commands.other.ICommand;
import by.itacademy.java.jd1.apetrov.practice.excel.util.CLIUtil;

public class Program {

	public static void main(String[] args) {
		System.out.println("program started...");

		List<ICommand> rootCommands = new ArrayList<>();
		rootCommands.add(new OpenDoc());
		rootCommands.add(new CreateDoc());
		rootCommands.add(new Exit());

		CLIUtil.selectAndExecute(rootCommands);
	}

}
