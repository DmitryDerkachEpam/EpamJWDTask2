package com.epam.parsers;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.epam.entities.TouristVouchers;
import com.epam.entities.Voucher;
import com.epam.exception.ParserException;

public class XmlJaxbParser implements Parser {

	public static void main(String[] args) throws ParserException {
		XmlJaxbParser xmlJaxbParser = new XmlJaxbParser();
		List<Voucher> lisTouristVouchers = xmlJaxbParser.parse("src/main/resources/vouchers.xml");
		for (Voucher i : lisTouristVouchers) {
			System.out.println(i);
		}
	}
	
	@Override
	public List<Voucher> parse(String filePath) throws ParserException {
		
		List<Voucher> listOfVouchers;
		
		try {
			JAXBContext context = JAXBContext.newInstance(TouristVouchers.class);
	        Unmarshaller unmarshaller = context.createUnmarshaller();
	        FileReader reader = new FileReader(filePath);
	        TouristVouchers touristVouchers = (TouristVouchers) unmarshaller.unmarshal(reader);
	        listOfVouchers = touristVouchers.getListOfVouchers();
	        
		} catch (JAXBException | FileNotFoundException e) {
			throw new ParserException("Jaxb parsing exception", e);
		}
	
		return listOfVouchers;
	}
	
}
