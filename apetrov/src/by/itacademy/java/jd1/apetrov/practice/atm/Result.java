package by.itacademy.java.jd1.apetrov.practice.atm;

import java.util.List;

public class Result {
	private List<ResultItem> items;

	private String error;

	public Result(List<ResultItem> resultItems) {
		this.items = resultItems;
	}

	public Result(String error) {
		this.error = error;
	}

	public boolean isSuccess() {
		return error == null;
	}

	@Override
	public String toString() {
		return "Result [items=" + items + ", error=" + error + "]";
	}

}
