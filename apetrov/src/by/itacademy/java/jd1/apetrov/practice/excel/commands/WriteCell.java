package by.itacademy.java.jd1.apetrov.practice.excel.commands;

import java.util.ArrayList;
import java.util.List;

import by.itacademy.java.jd1.apetrov.practice.excel.commands.other.AbstractDocumentCommand;
import by.itacademy.java.jd1.apetrov.practice.excel.commands.other.ICommand;
import by.itacademy.java.jd1.apetrov.practice.excel.document.ExcelDocument;
import by.itacademy.java.jd1.apetrov.practice.excel.util.CLIUtil;

public class WriteCell extends AbstractDocumentCommand {

	public WriteCell(final ExcelDocument doc) {
		super(doc);
	}

	@Override
	public String getName() {
		return "write cell";
	}

	@Override
	public void execute() {
		System.out.println("Enter adress:");
		String adress = CLIUtil.readAdress();
		System.out.printf("\nEnter content to cell %s:\n", adress);
		String content = CLIUtil.readConsole();
		ExcelDocument doc = getDoc();
		doc.getCells().put(adress, content);
		// doc.writeContent(adress, content);
		System.out.printf("Content %s is written to cell %s", content, adress);

		// TODO ask to enter cell name (for ex: A1)

		List<ICommand> commands = new ArrayList<>();
		commands.add(new ReadCell(doc));
		commands.add(new WriteCell(doc));
		commands.add(new SaveDoc(doc));
		commands.add(new OpenDoc());
		commands.add(new CreateDoc());
		commands.add(new Exit());
		commands.add(new ExitWithSave(doc));

		CLIUtil.selectAndExecute(commands);
	}
}
