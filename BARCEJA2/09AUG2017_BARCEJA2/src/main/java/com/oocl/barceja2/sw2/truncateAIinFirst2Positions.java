package com.oocl.barceja2.sw2;

public class truncateAIinFirst2Positions {
	
	
	public String truncateAInfirst2positions(String str) {
	if (str.length() <=2) {
		return str.replace("A", "");
	}
	String first2Chars =str.substring(0, 2);
	String stringMinusFirst2Chars = str.substring(2);
		return first2Chars.replaceAll("A", "" + stringMinusFirst2Chars);
	}
	
	public boolean areFirstAndLastTwoCharTheSame(String str) {
		if (str.length() <= 1) {
			return false;
		}
		if (str.length() == 2) {
			return true;
		}
		
		String first2Chars = str.substring(0, 2);
		
		String last2Chars = str.substring(str.length() - 2);
		return first2Chars.equals(last2Chars);
	}

	truncateAIinFirst2Positions(){
		
	}
	
	public static void main(String args) {
		
	}
}
