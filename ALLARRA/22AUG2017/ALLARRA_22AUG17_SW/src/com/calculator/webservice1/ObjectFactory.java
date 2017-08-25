
package com.calculator.webservice1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.calculator.webservice1 package. 
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

    private final static QName _SquareRootResponse_QNAME = new QName("http://webservice1.calculator.com/", "squareRootResponse");
    private final static QName _MultiplyResponse_QNAME = new QName("http://webservice1.calculator.com/", "multiplyResponse");
    private final static QName _AdditionResponse_QNAME = new QName("http://webservice1.calculator.com/", "additionResponse");
    private final static QName _SquareRoot_QNAME = new QName("http://webservice1.calculator.com/", "squareRoot");
    private final static QName _SubtractionResponse_QNAME = new QName("http://webservice1.calculator.com/", "subtractionResponse");
    private final static QName _Subtraction_QNAME = new QName("http://webservice1.calculator.com/", "subtraction");
    private final static QName _Addition_QNAME = new QName("http://webservice1.calculator.com/", "addition");
    private final static QName _Multiply_QNAME = new QName("http://webservice1.calculator.com/", "multiply");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.calculator.webservice1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SquareRootResponse }
     * 
     */
    public SquareRootResponse createSquareRootResponse() {
        return new SquareRootResponse();
    }

    /**
     * Create an instance of {@link AdditionResponse }
     * 
     */
    public AdditionResponse createAdditionResponse() {
        return new AdditionResponse();
    }

    /**
     * Create an instance of {@link MultiplyResponse }
     * 
     */
    public MultiplyResponse createMultiplyResponse() {
        return new MultiplyResponse();
    }

    /**
     * Create an instance of {@link SquareRoot }
     * 
     */
    public SquareRoot createSquareRoot() {
        return new SquareRoot();
    }

    /**
     * Create an instance of {@link SubtractionResponse }
     * 
     */
    public SubtractionResponse createSubtractionResponse() {
        return new SubtractionResponse();
    }

    /**
     * Create an instance of {@link Subtraction }
     * 
     */
    public Subtraction createSubtraction() {
        return new Subtraction();
    }

    /**
     * Create an instance of {@link Multiply }
     * 
     */
    public Multiply createMultiply() {
        return new Multiply();
    }

    /**
     * Create an instance of {@link Addition }
     * 
     */
    public Addition createAddition() {
        return new Addition();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SquareRootResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice1.calculator.com/", name = "squareRootResponse")
    public JAXBElement<SquareRootResponse> createSquareRootResponse(SquareRootResponse value) {
        return new JAXBElement<SquareRootResponse>(_SquareRootResponse_QNAME, SquareRootResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice1.calculator.com/", name = "multiplyResponse")
    public JAXBElement<MultiplyResponse> createMultiplyResponse(MultiplyResponse value) {
        return new JAXBElement<MultiplyResponse>(_MultiplyResponse_QNAME, MultiplyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice1.calculator.com/", name = "additionResponse")
    public JAXBElement<AdditionResponse> createAdditionResponse(AdditionResponse value) {
        return new JAXBElement<AdditionResponse>(_AdditionResponse_QNAME, AdditionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SquareRoot }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice1.calculator.com/", name = "squareRoot")
    public JAXBElement<SquareRoot> createSquareRoot(SquareRoot value) {
        return new JAXBElement<SquareRoot>(_SquareRoot_QNAME, SquareRoot.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubtractionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice1.calculator.com/", name = "subtractionResponse")
    public JAXBElement<SubtractionResponse> createSubtractionResponse(SubtractionResponse value) {
        return new JAXBElement<SubtractionResponse>(_SubtractionResponse_QNAME, SubtractionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Subtraction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice1.calculator.com/", name = "subtraction")
    public JAXBElement<Subtraction> createSubtraction(Subtraction value) {
        return new JAXBElement<Subtraction>(_Subtraction_QNAME, Subtraction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Addition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice1.calculator.com/", name = "addition")
    public JAXBElement<Addition> createAddition(Addition value) {
        return new JAXBElement<Addition>(_Addition_QNAME, Addition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multiply }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice1.calculator.com/", name = "multiply")
    public JAXBElement<Multiply> createMultiply(Multiply value) {
        return new JAXBElement<Multiply>(_Multiply_QNAME, Multiply.class, null, value);
    }

}
