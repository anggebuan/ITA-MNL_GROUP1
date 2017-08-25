package com.oocl.ALLARRA.SW3;


import net.webservicex.ConversionRate;
import net.webservicex.Currency;
import net.webservicex.CurrencyConvertor;
import net.webservicex.CurrencyConvertorSoap;

public class CurrConverter{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Currency c;
		ConversionRate cr = new ConversionRate();
		
		cr.setFromCurrency(net.webservicex.Currency.USD);
		cr.setToCurrency(net.webservicex.Currency.PHP);
		
		CurrencyConvertor cc = new CurrencyConvertor();
		CurrencyConvertorSoap ccs = cc.getCurrencyConvertorSoap();
		double test = ccs.conversionRate(cr.getFromCurrency(), cr.getToCurrency());
		System.out.println(test);
	}

}
