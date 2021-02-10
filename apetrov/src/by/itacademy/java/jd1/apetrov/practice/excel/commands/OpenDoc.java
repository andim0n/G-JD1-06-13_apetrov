package by.itacademy.java.jd1.apetrov.practice.excel.commands;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import by.itacademy.java.jd1.apetrov.practice.excel.commands.other.ICommand;
import by.itacademy.java.jd1.apetrov.practice.excel.document.ExcelDocument;
import by.itacademy.java.jd1.apetrov.practice.excel.util.CLIUtil;

public class OpenDoc implements ICommand {

	@Override
	public String getName() {
		return "open document";
	}

	@Override
	public void execute() {

		ExcelDocument doc = null;
		while (doc == null) {
			System.out.println("\nenter document name");
			String fileName = CLIUtil.readConsole();
			try {
				doc = loadDoc(fileName);
			} catch (ClassNotFoundException | IOException e) {
				System.out.printf("\nError! File doesnt exist, try again");
			}
		}

		System.out.printf("document %s opened successfully", doc.getName());

		List<ICommand> commands = new ArrayList<>();
		commands.add(new SaveDoc(doc));
		commands.add(new ReadCell(doc));
		commands.add(new WriteCell(doc));

		CLIUtil.selectAndExecute(commands);
	}

	private ExcelDocument loadDoc(final String fileName)
			throws IOException, ClassNotFoundException {
		String file = String.format("%s.tmp", fileName);
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		ExcelDocument doc = (ExcelDocument) ois.readObject();
		ois.close();
		return doc;
	}

}
