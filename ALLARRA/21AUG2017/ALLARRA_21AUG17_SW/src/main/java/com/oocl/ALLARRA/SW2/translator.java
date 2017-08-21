package com.oocl.ALLARRA.SW2;

import net.webservicex.Translate;
import net.webservicex.TranslateService;
import net.webservicex.TranslateServiceSoap;

public class translator {
	public static void main(String[] args) {

			TranslateService ts= new TranslateService();
			TranslateServiceSoap tsp = ts.getTranslateServiceSoap();
			Translate t = new Translate();
			t.setText("Hello");
			t.setLanguageMode("EnglishTOChinese");
			String text = tsp.translate(t.getLanguageMode(),t.getText());	
			System.out.println(text);
			
	}
}
