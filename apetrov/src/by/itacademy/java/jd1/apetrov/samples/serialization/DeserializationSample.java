package by.itacademy.java.jd1.apetrov.samples.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationSample {

	public static void main(final String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("t.tmp");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Car car = (Car) ois.readObject();
		ois.close();

		System.out.println(car);
	}

}
