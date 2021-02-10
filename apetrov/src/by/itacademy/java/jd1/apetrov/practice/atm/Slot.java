package by.itacademy.java.jd1.apetrov.practice.atm;

public class Slot extends AbstractMoneyPair implements Comparable<Slot> {

	public Slot(int nominal, int quantity) {
		super(nominal, quantity);
	}

	public void add(int aditionalQuantity) {
		int newQuantity = getQuantity() + aditionalQuantity;
		setQuantity(newQuantity);
	}

	public boolean isApplicable(int requestedNominal) {
		return getNominal() == requestedNominal;
	}

	@Override
	public int compareTo(Slot o) {
		return o.getNominal() - getNominal();
	}

	public void withdraw(int quantity) {
		int newQuantity = getQuantity() - quantity;
		setQuantity(newQuantity);
	}

}
