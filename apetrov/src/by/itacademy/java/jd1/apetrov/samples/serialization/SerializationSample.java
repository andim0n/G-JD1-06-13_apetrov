package by.itacademy.java.jd1.apetrov.samples.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationSample {

	public static void main(final String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("test.tmp");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(new Car(123, "vw", 2019));

		oos.close();

	}
}
