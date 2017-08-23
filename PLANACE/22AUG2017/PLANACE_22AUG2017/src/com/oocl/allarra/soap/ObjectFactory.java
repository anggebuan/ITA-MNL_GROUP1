
package com.oocl.allarra.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oocl.allarra.soap package. 
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

    private final static QName _GetSnackPropertyResponse_QNAME = new QName("http://soap.allarra.oocl.com/", "getSnackPropertyResponse");
    private final static QName _GetSnacksAvailabilityResponse_QNAME = new QName("http://soap.allarra.oocl.com/", "getSnacksAvailabilityResponse");
    private final static QName _GetProductCategories_QNAME = new QName("http://soap.allarra.oocl.com/", "getProductCategories");
    private final static QName _GetProductCategoriesResponse_QNAME = new QName("http://soap.allarra.oocl.com/", "getProductCategoriesResponse");
    private final static QName _GetSnacksAvailability_QNAME = new QName("http://soap.allarra.oocl.com/", "getSnacksAvailability");
    private final static QName _GetSnackProperty_QNAME = new QName("http://soap.allarra.oocl.com/", "getSnackProperty");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oocl.allarra.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetSnackPropertyResponse }
     * 
     */
    public GetSnackPropertyResponse createGetSnackPropertyResponse() {
        return new GetSnackPropertyResponse();
    }

    /**
     * Create an instance of {@link GetSnacksAvailabilityResponse }
     * 
     */
    public GetSnacksAvailabilityResponse createGetSnacksAvailabilityResponse() {
        return new GetSnacksAvailabilityResponse();
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
     * Create an instance of {@link GetSnacksAvailability }
     * 
     */
    public GetSnacksAvailability createGetSnacksAvailability() {
        return new GetSnacksAvailability();
    }

    /**
     * Create an instance of {@link GetSnackProperty }
     * 
     */
    public GetSnackProperty createGetSnackProperty() {
        return new GetSnackProperty();
    }

    /**
     * Create an instance of {@link ProductClass }
     * 
     */
    public ProductClass createProductClass() {
        return new ProductClass();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSnackPropertyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.allarra.oocl.com/", name = "getSnackPropertyResponse")
    public JAXBElement<GetSnackPropertyResponse> createGetSnackPropertyResponse(GetSnackPropertyResponse value) {
        return new JAXBElement<GetSnackPropertyResponse>(_GetSnackPropertyResponse_QNAME, GetSnackPropertyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSnacksAvailabilityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.allarra.oocl.com/", name = "getSnacksAvailabilityResponse")
    public JAXBElement<GetSnacksAvailabilityResponse> createGetSnacksAvailabilityResponse(GetSnacksAvailabilityResponse value) {
        return new JAXBElement<GetSnacksAvailabilityResponse>(_GetSnacksAvailabilityResponse_QNAME, GetSnacksAvailabilityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductCategories }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.allarra.oocl.com/", name = "getProductCategories")
    public JAXBElement<GetProductCategories> createGetProductCategories(GetProductCategories value) {
        return new JAXBElement<GetProductCategories>(_GetProductCategories_QNAME, GetProductCategories.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductCategoriesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.allarra.oocl.com/", name = "getProductCategoriesResponse")
    public JAXBElement<GetProductCategoriesResponse> createGetProductCategoriesResponse(GetProductCategoriesResponse value) {
        return new JAXBElement<GetProductCategoriesResponse>(_GetProductCategoriesResponse_QNAME, GetProductCategoriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSnacksAvailability }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.allarra.oocl.com/", name = "getSnacksAvailability")
    public JAXBElement<GetSnacksAvailability> createGetSnacksAvailability(GetSnacksAvailability value) {
        return new JAXBElement<GetSnacksAvailability>(_GetSnacksAvailability_QNAME, GetSnacksAvailability.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSnackProperty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.allarra.oocl.com/", name = "getSnackProperty")
    public JAXBElement<GetSnackProperty> createGetSnackProperty(GetSnackProperty value) {
        return new JAXBElement<GetSnackProperty>(_GetSnackProperty_QNAME, GetSnackProperty.class, null, value);
    }

}
