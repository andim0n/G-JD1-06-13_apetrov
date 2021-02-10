package by.itacademy.java.jd1.apetrov.practice.excel.commands;

import java.util.ArrayList;
import java.util.List;

import by.itacademy.java.jd1.apetrov.practice.excel.commands.other.AbstractDocumentCommand;
import by.itacademy.java.jd1.apetrov.practice.excel.commands.other.ICommand;
import by.itacademy.java.jd1.apetrov.practice.excel.document.ExcelDocument;
import by.itacademy.java.jd1.apetrov.practice.excel.util.CLIUtil;

public class ReadCell extends AbstractDocumentCommand {

	public ReadCell(final ExcelDocument doc) {
		super(doc);
	}

	@Override
	public String getName() {
		return "read cell";
	}

	@Override
	public void execute() {

		System.out.println("enter cell name (adress)");
		String adress = CLIUtil.readAdress();
		ExcelDocument doc = getDoc();
		try {
			System.out.printf("\nResult:\n%s : %s", adress, doc.readContent(adress));
		} catch (Exception e) {
			System.out.printf("\nThere are no data in adress %s!", adress);
		}

		List<ICommand> commands = new ArrayList<>();
		commands.add(new ReadCell(doc));
		commands.add(new WriteCell(doc));
		commands.add(new SaveDoc(doc));
		commands.add(new OpenDoc());
		commands.add(new CreateDoc());
		commands.add(new Exit());
		commands.add(new ExitWithSave(doc));

		CLIUtil.selectAndExecute(commands);

		// String cellNameOrRange = CLIUtil.readConsole();
		// TODO ask to enter cell name (for ex: A1)
		// would be nice to support cell range (for ex: A1:B12)
	}
}
