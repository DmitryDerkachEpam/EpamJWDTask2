package com.epam.parsers;

import java.util.List;
import com.epam.entities.TouristVoucher;
import com.epam.exception.ParserException;


public interface Parser {

    List<TouristVoucher> parse(String filePath) throws ParserException;
}