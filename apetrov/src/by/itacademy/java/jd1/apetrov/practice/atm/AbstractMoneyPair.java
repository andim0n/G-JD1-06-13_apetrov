package by.itacademy.java.jd1.apetrov.practice.atm;

public abstract class AbstractMoneyPair {

	private int nominal;
	private int quantity;

	public AbstractMoneyPair(int nominal, int quantity) {
		super();
		this.nominal = nominal;
		this.quantity = quantity;
	}

	public int getNominal() {
		return nominal;
	}

	public void setNominal(int nominal) {
		this.nominal = nominal;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "\nMoneyPair [nominal=" + nominal + ", quantity=" + quantity + "]";
	}
}
