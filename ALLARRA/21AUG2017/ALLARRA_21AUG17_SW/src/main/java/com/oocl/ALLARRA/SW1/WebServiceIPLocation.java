package com.oocl.ALLARRA.SW1;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class WebServiceIPLocation {
	
	public static void main(String[] args) {
		if(args.length !=1) {
			
		}
		else {
			GeoIPService ipService = new GeoIPService();
			GeoIPServiceSoap soapService = ipService.getGeoIPServiceSoap();
			GeoIP geoIP= soapService.getGeoIP(args[0]);
			System.out.println(geoIP.getCountryName());
		}
	}

}
