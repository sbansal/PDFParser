package com.pdfparser.test;

import java.util.StringTokenizer;
import java.util.regex.Matcher;

import com.pdfparser.main.controller.ParsingController;


import junit.framework.TestCase;

public class AllTests extends TestCase{

	
	public void testPrice() {
		String price = "$861.00 $601.00 $260.00";
		Matcher m = ParsingController.PRICE_PATTERN.matcher(price);
		
		if(m.find()) {
			System.out.println(m.group());
		}
	}
}
