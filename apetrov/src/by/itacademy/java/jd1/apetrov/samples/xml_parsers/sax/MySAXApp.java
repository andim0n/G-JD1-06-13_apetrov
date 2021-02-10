package by.itacademy.java.jd1.apetrov.samples.xml_parsers.sax;

import java.io.InputStream;

import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

public class MySAXApp extends DefaultHandler {
	public static void main(String args[]) throws Exception {
		XMLReader xr = XMLReaderFactory.createXMLReader();
		MySAXApp handler = new MySAXApp();
		xr.setContentHandler(handler);
		xr.setErrorHandler(handler);
		InputStream inputStream = MySAXApp.class.getResourceAsStream("sample-sax.xml");
		xr.parse(new InputSource(inputStream));
	}

	@Override
	public void startElement(String uri, String name, String qName, Attributes atts) {
		if ("".equals(uri)) {
			System.out.println("Start element: " + qName);
		} else {
			System.out.println("Start element: {" + uri + "}" + name);
		}
	}

	@Override
	public void endElement(String uri, String name, String qName) {
		if ("".equals(uri)) {
			System.out.println("End element: " + qName);
		} else {
			System.out.println("End element:   {" + uri + "}" + name);
		}
	}

	@Override
	public void startDocument() {
		System.out.println("Start document");
	}

	@Override
	public void endDocument() {
		System.out.println("End document");
	}
}