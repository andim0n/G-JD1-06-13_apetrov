package by.itacademy.java.jd1.apetrov.samples.xml_parsers.practice.sax;

import java.io.InputStream;

import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

public class FoodMenuSaxParser extends DefaultHandler {
    private static ParsingResult result;

    private String lastTagName;

    private String lastFoodName;

    public static void main(String args[]) throws Exception {
        XMLReader xr = XMLReaderFactory.createXMLReader();
        FoodMenuSaxParser handler = new FoodMenuSaxParser();
        xr.setContentHandler(handler);
        xr.setErrorHandler(handler);
        result = new ParsingResult();

        InputStream inputStream = FoodMenuSaxParser.class
                .getResourceAsStream("../sample.xml");
        xr.parse(new InputSource(inputStream));
        System.out.println(result);
    }

    @Override
    public void startElement(String uri, String name, String qName, Attributes atts){
        lastTagName = name;
        if ("food".equals(name)) {
            result.increaseFoodCount();
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String str = new String(ch, start, length);
        if (str.contains("\n    ")) {
            return;
        }

        if ("name".equals(lastTagName)) {
            lastFoodName = str;
        }

        if ("price".equals(lastTagName)) {
            String value = str.replace("$", "");
            double price = Double.parseDouble(value);

            if (result.getItemHighestPrice() == null) {
                result.setItemHighestPrice(new Food());
            }

            if (result.getItemLowestPrice() == null) {
                result.setItemLowestPrice(new Food());
            }

            Food itemHighestPrise = result.getItemHighestPrice();
            Food itemLowestPrise = result.getItemLowestPrice();

            if (itemHighestPrise.getPrice() == null
                    || itemHighestPrise.getPrice() < price) {
                itemHighestPrise.setPrice(price);
                itemHighestPrise.setName(lastFoodName);
            }

            if (itemLowestPrise.getPrice() == null
                    || itemLowestPrise.getPrice() > price) {
                itemLowestPrise.setPrice(price);
                itemLowestPrise.setName(lastFoodName);
            }

        }
    }

    @Override
    public void endElement(String uri, String name, String qName) {
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