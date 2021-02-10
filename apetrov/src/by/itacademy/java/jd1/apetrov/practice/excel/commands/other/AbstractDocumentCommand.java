package by.itacademy.java.jd1.apetrov.practice.excel.commands.other;

import by.itacademy.java.jd1.apetrov.practice.excel.document.ExcelDocument;

public abstract class AbstractDocumentCommand implements ICommand {
    private ExcelDocument doc;

    public AbstractDocumentCommand(ExcelDocument doc) {
        super();
        this.doc = doc;
    }

    public ExcelDocument getDoc() {
        return doc;
    }
}
