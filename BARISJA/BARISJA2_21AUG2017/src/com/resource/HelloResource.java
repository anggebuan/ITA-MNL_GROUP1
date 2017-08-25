package com.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

@Path("/hello")
public class HelloResource {

	@GET
	@Produces("text/plain")
	public String hello() {

		String ipAddress = "113.76.153.73";
		GeoIPService ipService = new GeoIPService();
		GeoIPServiceSoap geoIPServiceSoap = ipService.getGeoIPServiceSoap();
		GeoIP geoIP = geoIPServiceSoap.getGeoIP(ipAddress);
		return geoIP.getCountryName();

	}

}
