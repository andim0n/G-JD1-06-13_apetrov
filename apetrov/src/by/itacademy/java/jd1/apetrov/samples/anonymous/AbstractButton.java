
package by.itacademy.java.jd1.apetrov.samples.anonymous;

public abstract class AbstractButton {

	private String label;

	public AbstractButton(String label) {
		super();
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public abstract void onClick();
	/*
	 * @Override public String toString() { return "AbstractButton [label=" + label
	 * + "]"; }
	 */
}