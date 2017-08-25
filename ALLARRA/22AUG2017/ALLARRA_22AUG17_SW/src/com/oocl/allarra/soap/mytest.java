//package com.oocl.allarra.soap;
//
//import com.calculator.webservice1.CalculatorWSExecute;
//import com.calculator.webservice1.CalculatorWSExecuteService;
//
//public class mytest {
//	public static void main(String[] args) {
//		GetSnackProperty();
//	}
//	
//	public static void GetSnackProperty() {
//		ServicesService s = new ServicesService();
//		Services service = s.getServicesPort();
//		GetSnackProperty g = new GetSnackProperty();
//		g.setArg0("Lays");
//		GetSnackPropertyResponse rs = new GetSnackPropertyResponse();
//		rs.setReturn(service.getSnackProperty(g.getArg0()));
//		System.out.println(rs.getReturn().getAvailableStock());
//		System.out.println(rs.getReturn().getName());
//		System.out.println(rs.getReturn().getPrice());
//	}
//	public void calcNonie() {
//		CalculatorWSExecuteService cws = new CalculatorWSExecuteService();
//		CalculatorWSExecute cwsInterface = cws.getCalculatorWSExecutePort();
//		
//		String test = cwsInterface.addition(100, 530);
//		System.out.println(test);
//	}
//
//}
