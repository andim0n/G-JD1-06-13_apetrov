package by.itacademy.java.jd1.apetrov.samples.xlt;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;

public class XpathSample {

	public static void main(final String[] args) throws Exception {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		Document xmlDocument = builder
				.parse(XpathSample.class.getResourceAsStream("xml-source.xml"));
		XPath xPath = XPathFactory.newInstance().newXPath();
		String expression = "/hello-world/greeting";
		System.out.println(
				xPath.compile(expression).evaluate(xmlDocument, XPathConstants.STRING));
	}
}
