package by.itacademy.java.jd1.apetrov.practice.excel.document;

import java.io.Serializable;
import java.util.HashMap;

public class ExcelDocument implements Serializable {

	/**
	 * last update 26.09
	 */
	private static final long serialVersionUID = 1L;

	private String name;
	private HashMap<String, String> cells;

	public String readContent(final String key) throws Exception {
		if (cells.containsKey(key)) {
			return cells.get(key);
		} else {
			throw new Exception();
		}

	}

	public void writeContent(final String key, final String content) {
		cells.put(key, content);
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public HashMap<String, String> getCells() {
		return cells;
	}

}
