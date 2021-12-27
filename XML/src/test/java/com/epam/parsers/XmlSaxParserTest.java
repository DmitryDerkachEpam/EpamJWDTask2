package com.epam.parsers;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.epam.entities.BusinessVoucher;
import com.epam.entities.FamilyVoucher;
import com.epam.entities.Voucher;
import com.epam.entities.associatedclasses.HotelCharacteristics;
import com.epam.entities.associatedclasses.MealType;
import com.epam.entities.associatedclasses.MealsIncluded;
import com.epam.entities.associatedclasses.RoomType;
import com.epam.entities.associatedclasses.Type;
import com.epam.exception.ParserException;
import com.epam.parsers.saxparser.XmlSaxParser;

public class XmlSaxParserTest {

	private static final String VALID_PATH = "src/main/resources/vouchers.xml";
	
	@Test
	public void TestParseShouldParseFileWhenPathIsValid() throws ParserException {
		//given
		FamilyVoucher familyVoucher = new FamilyVoucher();
		familyVoucher.setId(1);
		familyVoucher.setType(Type.WEEKEND);
		familyVoucher.setCountry("Mexico");
		familyVoucher.setNumberOfDays(10);
		familyVoucher.setTransport("bus");
		
		MealsIncluded mealsIncluded = new MealsIncluded();
		mealsIncluded.setAvailable(true);
		mealsIncluded.setMealType(MealType.AI);
		
		HotelCharacteristics hotelCharacteristics = new HotelCharacteristics();
		hotelCharacteristics.setNumOfStars(5);
		hotelCharacteristics.setMealsIncluded(mealsIncluded);
		hotelCharacteristics.setRoomType(RoomType.TRIPLE);
		
		familyVoucher.setHotelCharacteristics(hotelCharacteristics);
		familyVoucher.setCost(500);
		familyVoucher.setNumOfFamilyMembers(3);
		
		BusinessVoucher businessVoucher = new BusinessVoucher();
		businessVoucher.setId(2);
		businessVoucher.setType(Type.BUSINESS);
		businessVoucher.setCountry("USA");
		businessVoucher.setNumberOfDays(2);
		businessVoucher.setTransport("airplane");
		
		MealsIncluded mealsIncluded1 = new MealsIncluded();
		mealsIncluded1.setAvailable(true);
		mealsIncluded1.setMealType(MealType.BB);
		
		HotelCharacteristics hotelCharacteristics1 = new HotelCharacteristics();
		hotelCharacteristics1.setNumOfStars(4);
		hotelCharacteristics1.setMealsIncluded(mealsIncluded1);
		hotelCharacteristics1.setRoomType(RoomType.DOUBLE);
		
		businessVoucher.setHotelCharacteristics(hotelCharacteristics1);
		businessVoucher.setCost(1000);
		businessVoucher.setNumOfMeetings(2);
		
		XmlSaxParser xmlSaxParser = new XmlSaxParser();
		List<Voucher> expected = Arrays.asList(familyVoucher, businessVoucher);
		//when
		List<Voucher> actual = xmlSaxParser.parse(VALID_PATH);
		//then
		Assert.assertEquals(expected, actual);
	}
	
}
