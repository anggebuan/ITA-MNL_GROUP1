package com.ramonWS.test;

import com.oocl.allarra.soap.*;
public class RamonWSTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Services1Service s = new Services1Service();
		Services1 service = s.getServices1Port();
		GetSnackProperty g = new GetSnackProperty();
		g.setArg0("Lays");
		GetSnackPropertyResponse rs = new GetSnackPropertyResponse();
		rs.setReturn(service.getSnackProperty(g.getArg0()));
		System.out.println(rs.getReturn().getAvailableStock());
		System.out.println(rs.getReturn().getName());
		System.out.println(rs.getReturn().getPrice()); 
	}

}
