package com.epam.director;

import com.epam.exception.ParserException;
import com.epam.parsers.Parser;
import com.epam.parsers.XmlDomParser;
import com.epam.parsers.XmlJaxbParser;
import com.epam.parsers.saxparser.XmlSaxParser;
import com.epam.validator.VouchersValidator;
import java.util.ArrayList;
import java.util.List;
import com.epam.entities.Voucher;

public class Director {

	private Parser parser;
	private VouchersValidator vouchersValidator;

	public Director(Parser parser, VouchersValidator vouchersValidator) {
		this.parser = parser;
		this.vouchersValidator = vouchersValidator;
	}

	public List<Voucher> parseXml(String xmlPath, String xsdPath) throws ParserException {
		List<Voucher> listOfVouchers = new ArrayList<>();
		if (vouchersValidator.isValid(xmlPath, xsdPath)) {
			listOfVouchers = parser.parse(xmlPath);
		}
		return listOfVouchers;
	}
	
	public static void main(String[] args) {
		/*Should be same output for Sax/Dom and small difference for Jaxb parsers*/
		Director director = new Director(new XmlJaxbParser(), new VouchersValidator());
		try {
			List<Voucher> vouchers = director.parseXml("src/main/resources/vouchers.xml", "src/main/resources/vouchersSchema.xsd");
			for (int i = 0; i < vouchers.size(); i++) {
				
				System.out.println(vouchers.get(i));
				
			}
			
		} catch (ParserException e) {
			e.printStackTrace();
		}
	}
	
}//Director
