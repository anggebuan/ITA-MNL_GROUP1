package WebService;

import net.webservicex_currency.Currency;
import net.webservicex_currency.CurrencyConvertor;
import net.webservicex_currency.CurrencyConvertorSoap;

public class WebServiceCurrency {

	public static void main (String[] args) {

		Currency currency ;
		
		
		CurrencyConvertor currencyConvertor = new CurrencyConvertor();
		CurrencyConvertorSoap currencyConvertorSoap = currencyConvertor.getCurrencyConvertorSoap();
		double money = currencyConvertorSoap.conversionRate(Currency.USD, Currency.PHP);		
		System.out.println(money);
	 
	}
}
