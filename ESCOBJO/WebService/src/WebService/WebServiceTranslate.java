package WebService;


//import net.webservicex_translate.Translate;
//import net.webservicex_translate.TranslateResponse;
import net.webservicex_translate.TranslateService;
import net.webservicex_translate.TranslateServiceSoap;

public class WebServiceTranslate {

	public static void main (String[] args) {

//		String word = "Hello";
//		String result = "";
//		Translate translate = new Translate();
//		translate.setLanguageMode("EnglishTOKorean");
//		
//		String lang = translate.getLanguageMode();
//		System.out.println(lang);
//		TranslateResponse translateResponse = new TranslateResponse();	
//		translate.setText(word);
//		result =translateResponse.getTranslateResult();
//		translateResponse.setTranslateResult(result);
//			System.out.println("Result: " + result);
		
			TranslateService translateService = new TranslateService();
			TranslateServiceSoap translateServiceSoap = translateService.getTranslateServiceSoap();
			//String trans = translateServiceSoap.translate("EnglishTOKorean", "Hello").toString();
			String trans = translateServiceSoap.translate("EnglishTOKorean", "Hello");
			System.out.println(trans); 
			//translateServiceSoap.
			
	 
	}
}
