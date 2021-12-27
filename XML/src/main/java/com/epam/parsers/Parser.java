package com.epam.parsers;

import java.util.List;
import com.epam.entities.Voucher;
import com.epam.exception.ParserException;


public interface Parser {

    List<Voucher> parse(String filePath) throws ParserException;
    
}