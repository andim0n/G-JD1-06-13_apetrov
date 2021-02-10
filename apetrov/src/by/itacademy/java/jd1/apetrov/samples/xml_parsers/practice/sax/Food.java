package by.itacademy.java.jd1.apetrov.samples.xml_parsers.practice.sax;

public class Food {
	private String name;
	private Double price;
	private Double col;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getCol() {
		return col;
	}

	public void setCol(Double col) {
		this.col = col;
	}

	@Override
	public String toString() {
		return "\nFood [name=" + name + ", price=" + price + ", col=" + col + "]";
	}

}