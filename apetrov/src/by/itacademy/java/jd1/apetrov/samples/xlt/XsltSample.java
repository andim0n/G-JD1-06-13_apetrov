package by.itacademy.java.jd1.apetrov.samples.xlt;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class XsltSample {

	public static void main(final String[] args) throws Exception {
		StreamSource source = new StreamSource(
				XsltSample.class.getResourceAsStream("xml-source.xml"));
		StreamSource stylesource = new StreamSource(
				XsltSample.class.getResourceAsStream("hello.xsl"));

		TransformerFactory factory = TransformerFactory.newInstance();
		Transformer transformer = factory.newTransformer(stylesource);

		StreamResult result = new StreamResult(System.out);
		transformer.transform(source, result);
	}

}
