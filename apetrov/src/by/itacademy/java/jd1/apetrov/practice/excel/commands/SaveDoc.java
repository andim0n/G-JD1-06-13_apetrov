package by.itacademy.java.jd1.apetrov.practice.excel.commands;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import by.itacademy.java.jd1.apetrov.practice.excel.commands.other.AbstractDocumentCommand;
import by.itacademy.java.jd1.apetrov.practice.excel.commands.other.ICommand;
import by.itacademy.java.jd1.apetrov.practice.excel.document.ExcelDocument;
import by.itacademy.java.jd1.apetrov.practice.excel.util.CLIUtil;

public class SaveDoc extends AbstractDocumentCommand implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// private static final String BASE_FOLDER_PATH = "";

	public SaveDoc(final ExcelDocument doc) {
		super(doc);
	}

	@Override
	public String getName() {
		return "save document";
	}

	@Override
	public void execute() {
		// TODO save current document
		ExcelDocument doc = getDoc();

		String fileName = String.format("%s.tmp", doc.getName());

		try (FileOutputStream fos = new FileOutputStream(fileName);
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {

			oos.writeObject(doc);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// TODO print command list
		List<ICommand> rootCommands = new ArrayList<>();
		rootCommands.add(new OpenDoc());
		rootCommands.add(new CreateDoc());
		rootCommands.add(new Exit());

		CLIUtil.selectAndExecute(rootCommands);
	}

}
