package by.itacademy.java.jd1.apetrov.practice.excel.commands;

import by.itacademy.java.jd1.apetrov.practice.excel.commands.other.ICommand;

public class Exit implements ICommand {

    @Override
    public String getName() {
        return "exit";
    }

    @Override
    public void execute() {
        //TODO check if no opened documents
        System.out.println("programm closed");
        System.exit(0);
    }
}
