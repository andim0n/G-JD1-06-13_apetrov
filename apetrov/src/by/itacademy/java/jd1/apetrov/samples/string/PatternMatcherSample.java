package by.itacademy.java.jd1.apetrov.samples.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherSample {

	public static void main(String[] args) {
		// create object Pattern - what search
		Pattern p = Pattern.compile(" +- +");
		// create object Matcher - where search
		Matcher matcher = p.matcher("Test - string -   test - ");

		// searching by method find
		// method find search conformity expression and return true or false
		while (matcher.find()) {
			System.out.println(matcher.start() + " " + matcher.end() + " " + matcher.group());
		}
	}

}
