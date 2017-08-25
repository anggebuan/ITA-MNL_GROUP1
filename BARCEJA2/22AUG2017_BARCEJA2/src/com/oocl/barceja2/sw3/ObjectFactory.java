
package com.oocl.barceja2.sw3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.escobjo.webservice package. 
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

    private final static QName _GetValuestoCalculate_QNAME = new QName("http://webservice.escobjo.com/", "getValuestoCalculate");
    private final static QName _GetCalculatorOperationsResponse_QNAME = new QName("http://webservice.escobjo.com/", "getCalculatorOperationsResponse");
    private final static QName _GetCalculatorOperations_QNAME = new QName("http://webservice.escobjo.com/", "getCalculatorOperations");
    private final static QName _GetValuestoCalculateResponse_QNAME = new QName("http://webservice.escobjo.com/", "getValuestoCalculateResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.escobjo.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCalculatorOperations }
     * 
     */
    public GetCalculatorOperations createGetCalculatorOperations() {
        return new GetCalculatorOperations();
    }

    /**
     * Create an instance of {@link GetValuestoCalculateResponse }
     * 
     */
    public GetValuestoCalculateResponse createGetValuestoCalculateResponse() {
        return new GetValuestoCalculateResponse();
    }

    /**
     * Create an instance of {@link GetCalculatorOperationsResponse }
     * 
     */
    public GetCalculatorOperationsResponse createGetCalculatorOperationsResponse() {
        return new GetCalculatorOperationsResponse();
    }

    /**
     * Create an instance of {@link GetValuestoCalculate }
     * 
     */
    public GetValuestoCalculate createGetValuestoCalculate() {
        return new GetValuestoCalculate();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetValuestoCalculate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.escobjo.com/", name = "getValuestoCalculate")
    public JAXBElement<GetValuestoCalculate> createGetValuestoCalculate(GetValuestoCalculate value) {
        return new JAXBElement<GetValuestoCalculate>(_GetValuestoCalculate_QNAME, GetValuestoCalculate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCalculatorOperationsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.escobjo.com/", name = "getCalculatorOperationsResponse")
    public JAXBElement<GetCalculatorOperationsResponse> createGetCalculatorOperationsResponse(GetCalculatorOperationsResponse value) {
        return new JAXBElement<GetCalculatorOperationsResponse>(_GetCalculatorOperationsResponse_QNAME, GetCalculatorOperationsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCalculatorOperations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.escobjo.com/", name = "getCalculatorOperations")
    public JAXBElement<GetCalculatorOperations> createGetCalculatorOperations(GetCalculatorOperations value) {
        return new JAXBElement<GetCalculatorOperations>(_GetCalculatorOperations_QNAME, GetCalculatorOperations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetValuestoCalculateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.escobjo.com/", name = "getValuestoCalculateResponse")
    public JAXBElement<GetValuestoCalculateResponse> createGetValuestoCalculateResponse(GetValuestoCalculateResponse value) {
        return new JAXBElement<GetValuestoCalculateResponse>(_GetValuestoCalculateResponse_QNAME, GetValuestoCalculateResponse.class, null, value);
    }

}
