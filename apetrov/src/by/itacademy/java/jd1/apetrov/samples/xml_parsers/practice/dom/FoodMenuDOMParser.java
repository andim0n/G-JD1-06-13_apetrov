package by.itacademy.java.jd1.apetrov.samples.xml_parsers.practice.dom;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import by.itacademy.java.jd1.apetrov.samples.xml_parsers.practice.sax.Food;

public class FoodMenuDOMParser {

	public static void main(final String argv[])
			throws SAXException, IOException, ParserConfigurationException {

		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder
				.parse(FoodMenuDOMParser.class.getResourceAsStream("../sample.xml"));
		ParsingResult result = new ParsingResult();
		// optional, but recommended
		// read this -
		// http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
		doc.getDocumentElement().normalize();

		NodeList nList = doc.getElementsByTagName("food");
		result.setItemsQuantity(nList.getLength());

		for (int i = 0; i < nList.getLength(); i++) {
			Node nNode = nList.item(i);

			String foodName = handlePrice(result, nNode);

			handleLowestCal(result, nNode, foodName);
		}

		System.out.println(result);
	}

	private static void handleLowestCal(final ParsingResult result, final Node nNode,
			final String foodName) {
		// calories
		String valueCal = getElementValue(nNode, "calories");
		double calories = Double.parseDouble(valueCal);
		Food itemLowestCol = result.getItemLowestCol();
		if (itemLowestCol.getCol() == null || itemLowestCol.getCol() > calories) {
			itemLowestCol.setCol(calories);
			itemLowestCol.setName(foodName);
		}
	}

	private static String handlePrice(final ParsingResult result, final Node nNode) {
		String priceString = getElementValue(nNode, "price");
		String foodName = getElementValue(nNode, "name");

		String value = priceString.replace("$", "");
		double price = Double.parseDouble(value);

		Food itemHighestPrise = result.getItemHighestPrice();
		Food itemLowestPrise = result.getItemLowestPrice();

		if (itemHighestPrise.getPrice() == null || itemHighestPrise.getPrice() < price) {
			itemHighestPrise.setPrice(price);
			itemHighestPrise.setName(foodName);
		}

		if (itemLowestPrise.getPrice() == null || itemLowestPrise.getPrice() > price) {
			itemLowestPrise.setPrice(price);
			itemLowestPrise.setName(foodName);
		}
		return foodName;
	}

	private static String getElementValue(final Node nNode, final String elementName) {
		NodeList children = nNode.getChildNodes();
		for (int j = 0; j < children.getLength(); j++) {
			Node childNode = children.item(j);
			if (elementName.equals(childNode.getNodeName())) {
				return childNode.getTextContent();
			}
		}
		return null;
	}
}