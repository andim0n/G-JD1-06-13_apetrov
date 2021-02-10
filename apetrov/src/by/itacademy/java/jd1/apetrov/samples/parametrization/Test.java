package by.itacademy.java.jd1.apetrov.samples.parametrization;

public class Test {

	public static void main(String[] args) {

		// string
		BoxString boxString = new BoxString();
		boxString.setValue("some string in box");
		String valueString = boxString.getValue();
		System.out.println(valueString);

		// int
		BoxInt boxInteger = new BoxInt();
		boxInteger.setValue(123);
		int valueInt = boxInteger.getValue();
		System.out.println(valueInt);

		// obj
		BoxObject boxObjectInt = new BoxObject();
		BoxObject boxObjectString = new BoxObject();

		boxObjectInt.setValue(321);
		boxObjectString.setValue("string");

		String valueObjString = (String) boxObjectString.getValue();
		int valueObjInt = (int) boxObjectInt.getValue();
		System.out.println(valueObjString);
		System.out.println(valueObjInt);

		// parametrization
		Box<String, Integer> boxStringT = new Box<String, Integer>();
		Box<String, Integer> boxIntT = new Box<String, Integer>();

		boxStringT.setValue1("string t");
		boxIntT.setValue2(111);

		String stringValueT = boxStringT.getValue1();
		int intValueT = boxIntT.getValue2();
		System.out.println(stringValueT);
		System.out.println(intValueT);

	}

}
