package com.oocl.barceja2.sw3;

public class mainCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetValuestoCalculateResponse res = new GetValuestoCalculateResponse();
		GetValuestoCalculate cs = new GetValuestoCalculate();
		CalculatorCatalogue cc= null;
		
		
		Double ans = cc.getValuestoCalculate("sub", 3, 2);
		System.out.println(ans);
		
		
	}

}
