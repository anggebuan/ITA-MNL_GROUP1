package com.oocl.barceja2.hw1;


import net.webservicex.geo.GeoIP;
import net.webservicex.geo.GeoIPService;
import net.webservicex.geo.GeoIPServiceSoap;

public class WebServiceIpLocation {
	
	public String IPAdd(String ipAdd) {
		// TODO Auto-generated method stub
		String resIP = "";
		String ipAddress = ipAdd;

		GeoIPService ipService = new GeoIPService();
		GeoIPServiceSoap geoIpServiceSoap = ipService.getGeoIPServiceSoap();
		GeoIP geoIp = geoIpServiceSoap.getGeoIP(ipAddress);
		resIP = geoIp.getCountryName();

		if (resIP == null) {
			resIP = "You need to pass in one IP address";
		}
		return resIP;
	}
}
