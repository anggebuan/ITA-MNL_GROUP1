package com.oocl.tengkh.app;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oocl.tengkh.resource.ProductCatalogueResource;

@ApplicationPath("/app1")
public class ProductCatalogue extends Application {

}
