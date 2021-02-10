package by.itacademy.java.jd1.apetrov.practice.excel.commands;

import java.util.ArrayList;
import java.util.List;

import by.itacademy.java.jd1.apetrov.practice.excel.commands.other.ICommand;
import by.itacademy.java.jd1.apetrov.practice.excel.document.ExcelDocument;
import by.itacademy.java.jd1.apetrov.practice.excel.util.CLIUtil;

public class CreateDoc implements ICommand {

    @Override
    public String getName() {
        return "create document";
    }

    @Override
    public void execute() {
        ExcelDocument doc = new ExcelDocument();
        System.out.println("enter filename");
        String fileName = CLIUtil.readConsole();
        doc.setName(fileName);
        System.out.println("new empty document created");
        

        List<ICommand> commands = new ArrayList<>();
        commands.add(new SaveDoc(doc));
        commands.add(new ReadCell(doc));
        commands.add(new WriteCell(doc));
        commands.add(new ExitWithSave(doc));

        CLIUtil.selectAndExecute(commands);




    }

}
