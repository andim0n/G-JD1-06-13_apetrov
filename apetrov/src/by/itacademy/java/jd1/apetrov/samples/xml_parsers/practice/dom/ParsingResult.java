package by.itacademy.java.jd1.apetrov.samples.xml_parsers.practice.dom;

import by.itacademy.java.jd1.apetrov.samples.xml_parsers.practice.sax.Food;

public class ParsingResult {
	private int itemsQuantity;
	private Food itemHighestPrice = new Food();
	private Food itemLowestPrice = new Food();
	private Food itemHighestCol = new Food();
	private Food itemLowestCol = new Food();
	private Food longestName = new Food();
	private double totalPrice;

	public int getItemsQuantity() {
		return itemsQuantity;
	}

	public void setItemsQuantity(final int itemsQuantity) {
		this.itemsQuantity = itemsQuantity;
	}

	public Food getItemHighestCol() {
		return itemHighestCol;
	}

	public void setItemHighestCol(final Food itemHighestCol) {
		this.itemHighestCol = itemHighestCol;
	}

	public Food getItemLowestCol() {
		return itemLowestCol;
	}

	public void setItemLowestCol(final Food itemLowestCol) {
		this.itemLowestCol = itemLowestCol;
	}

	public Food getLongestName() {
		return longestName;
	}

	public void setLongestName(final Food longestName) {
		this.longestName = longestName;
	}

	public Food getItemHighestPrice() {
		return itemHighestPrice;
	}

	public void setItemHighestPrice(final Food itemHighestPrice) {
		this.itemHighestPrice = itemHighestPrice;
	}

	public Food getItemLowestPrice() {
		return itemLowestPrice;
	}

	public void setItemLowestPrice(final Food itemLowestPrice) {
		this.itemLowestPrice = itemLowestPrice;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(final double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public void increaseFoodCount() {
		itemsQuantity++;
	}

	@Override
	public String toString() {
		return "ParsingResult [\nitemsQuantity=" + itemsQuantity + ", \nitemHighestPrice="
				+ itemHighestPrice + ", \nitemLowestPrice=" + itemLowestPrice
				+ ", \nitemHighestCol=" + itemHighestCol + ", \nitemLowestCol="
				+ itemLowestCol + ", \nlongestName=" + longestName + ", \ntotalPrice="
				+ totalPrice + "]";
	}

}
