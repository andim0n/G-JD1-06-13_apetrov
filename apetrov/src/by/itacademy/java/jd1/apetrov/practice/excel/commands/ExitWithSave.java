package by.itacademy.java.jd1.apetrov.practice.excel.commands;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import by.itacademy.java.jd1.apetrov.practice.excel.commands.other.AbstractDocumentCommand;
import by.itacademy.java.jd1.apetrov.practice.excel.document.ExcelDocument;

public class ExitWithSave extends AbstractDocumentCommand {

	public ExitWithSave(final ExcelDocument doc) {
		super(doc);
	}

	@Override
	public String getName() {
		return "exit and save";
	}

	@Override
	public void execute() {
		// save doc
		ExcelDocument doc = getDoc();
		String fileName = String.format("%s.tmp", doc.getName());

		try (FileOutputStream fos = new FileOutputStream(fileName);
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {

			oos.writeObject(doc);
		} catch (IOException e) {
			e.printStackTrace();
		}
		//
		System.out.println("document saved");
		System.out.println("programm closed");
		System.exit(0);
	}
}
