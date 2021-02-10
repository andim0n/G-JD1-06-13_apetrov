package by.itacademy.java.jd1.apetrov.samples.annotation.method;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Sample1 sample1 = new Sample1();
		Sample2 sample2 = new Sample2();
		Sample3 sample3 = new Sample3();

		executeSignedMethods(sample1);
		executeSignedMethods(sample2);
		executeSignedMethods(sample3);
	}

	private static void executeSignedMethods(Object sample)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<? extends Object> clazz = sample.getClass();
		Method[] methods = clazz.getMethods();
		for (Method method : methods) {
			if (method.getAnnotation(Autoexecutable.class) != null) {
				method.invoke(sample);
			}
		}
	}

}
