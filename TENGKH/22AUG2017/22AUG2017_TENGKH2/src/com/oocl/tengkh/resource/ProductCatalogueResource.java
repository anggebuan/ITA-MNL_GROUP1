package com.oocl.tengkh.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.forrest.webservice.ProductCatalogue;
import com.forrest.webservice.ProductCatalogueService;

@Path("/prod")
public class ProductCatalogueResource {
	@GET
	@Produces("text/plain")
	public String Products() {
		ProductCatalogueService forrest_ws = new ProductCatalogueService();
		ProductCatalogue ws = forrest_ws.getProductCataloguePort();
		String temp="";
		for(String a: ws.getProductCategories())
		{
			temp+=a+"\n";
		}
		return temp;
	}
}
