package com.pdfparser.main;

import com.pdfparser.main.controller.ParsingController;

public class PDFParser {
	public static void main(String[] args) {
		try {
//			String fileName = "/Users/shubhambansal/Downloads/cancer1.pdf";
//			String fileName = "/Users/shubhambansal/Downloads/mammogram.pdf";
			String fileName = "/Users/shubhambansal/Downloads/physical.pdf";
			long time = System.currentTimeMillis();
			ParsingController controller = new ParsingController();
			controller.parse(fileName);
			System.out.println("Time taken - " + (System.currentTimeMillis() - time	));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}