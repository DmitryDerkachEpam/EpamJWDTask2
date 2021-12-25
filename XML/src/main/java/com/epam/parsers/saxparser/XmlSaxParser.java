package com.epam.parsers.saxparser;

import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;
import com.epam.entities.Voucher;
import com.epam.exception.ParserException;
import com.epam.parsers.Parser;

public class XmlSaxParser implements Parser{

	@Override
	public List<Voucher> parse(String filePath) throws ParserException{
		
		/*Opening the file for reading*/
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SaxParserHandler handler = new SaxParserHandler();
		SAXParser parser = null;
		try {
			parser = factory.newSAXParser();
		} catch (Exception e) {
			throw new ParserException ("Open sax parser error" + e.toString());
		}
		
		File file = new File(filePath);
		
		try {
			parser.parse(file, handler);
		} catch (SAXException e) {
			throw new ParserException ("Sax parsing exception" + e.toString());
		} catch (IOException e) {
			throw new ParserException ("IO exception" + e.toString());
		}
		return handler.vouchers;
	}

}
