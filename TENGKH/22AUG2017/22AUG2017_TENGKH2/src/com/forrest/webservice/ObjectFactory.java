
package com.forrest.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.forrest.webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GegProducts_QNAME = new QName("http://webservice.forrest.com/", "gegProducts");
    private final static QName _GegProductsResponse_QNAME = new QName("http://webservice.forrest.com/", "gegProductsResponse");
    private final static QName _GetProductCategories_QNAME = new QName("http://webservice.forrest.com/", "getProductCategories");
    private final static QName _GetProductCategoriesResponse_QNAME = new QName("http://webservice.forrest.com/", "getProductCategoriesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.forrest.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GegProducts }
     * 
     */
    public GegProducts createGegProducts() {
        return new GegProducts();
    }

    /**
     * Create an instance of {@link GegProductsResponse }
     * 
     */
    public GegProductsResponse createGegProductsResponse() {
        return new GegProductsResponse();
    }

    /**
     * Create an instance of {@link GetProductCategories }
     * 
     */
    public GetProductCategories createGetProductCategories() {
        return new GetProductCategories();
    }

    /**
     * Create an instance of {@link GetProductCategoriesResponse }
     * 
     */
    public GetProductCategoriesResponse createGetProductCategoriesResponse() {
        return new GetProductCategoriesResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GegProducts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.forrest.com/", name = "gegProducts")
    public JAXBElement<GegProducts> createGegProducts(GegProducts value) {
        return new JAXBElement<GegProducts>(_GegProducts_QNAME, GegProducts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GegProductsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.forrest.com/", name = "gegProductsResponse")
    public JAXBElement<GegProductsResponse> createGegProductsResponse(GegProductsResponse value) {
        return new JAXBElement<GegProductsResponse>(_GegProductsResponse_QNAME, GegProductsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductCategories }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.forrest.com/", name = "getProductCategories")
    public JAXBElement<GetProductCategories> createGetProductCategories(GetProductCategories value) {
        return new JAXBElement<GetProductCategories>(_GetProductCategories_QNAME, GetProductCategories.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductCategoriesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.forrest.com/", name = "getProductCategoriesResponse")
    public JAXBElement<GetProductCategoriesResponse> createGetProductCategoriesResponse(GetProductCategoriesResponse value) {
        return new JAXBElement<GetProductCategoriesResponse>(_GetProductCategoriesResponse_QNAME, GetProductCategoriesResponse.class, null, value);
    }

}
