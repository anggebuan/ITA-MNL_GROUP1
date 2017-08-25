package WebService;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class WebServiceIPLocation{

	public static void main (String[] args) {
		if(args.length!=1) {
			System.out.println("You need to pass in 1 IP Add");
	}else {
		String ipAdd = args[0];
		//ipAdd = "204.79.197.200";
		
		GeoIPService ipService = new GeoIPService();
		GeoIPServiceSoap geoIPServiceSoap = ipService.getGeoIPServiceSoap();
		GeoIP geoIp= geoIPServiceSoap.getGeoIP(ipAdd);
		System.out.println(geoIp.getCountryName());
		
	}
}
}