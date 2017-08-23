
package com.oocl.punzagh.sw2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oocl.barisja2.sw1.webservice package. 
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

    private final static QName _GetFilesResponse_QNAME = new QName("http://webservice.sw1.barisja2.oocl.com/", "getFilesResponse");
    private final static QName _GetDirectoriesResponse_QNAME = new QName("http://webservice.sw1.barisja2.oocl.com/", "getDirectoriesResponse");
    private final static QName _GetDirectories_QNAME = new QName("http://webservice.sw1.barisja2.oocl.com/", "getDirectories");
    private final static QName _GetFiles_QNAME = new QName("http://webservice.sw1.barisja2.oocl.com/", "getFiles");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oocl.barisja2.sw1.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDirectoriesResponse }
     * 
     */
    public GetDirectoriesResponse createGetDirectoriesResponse() {
        return new GetDirectoriesResponse();
    }

    /**
     * Create an instance of {@link GetFilesResponse }
     * 
     */
    public GetFilesResponse createGetFilesResponse() {
        return new GetFilesResponse();
    }

    /**
     * Create an instance of {@link GetDirectories }
     * 
     */
    public GetDirectories createGetDirectories() {
        return new GetDirectories();
    }

    /**
     * Create an instance of {@link GetFiles }
     * 
     */
    public GetFiles createGetFiles() {
        return new GetFiles();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFilesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.sw1.barisja2.oocl.com/", name = "getFilesResponse")
    public JAXBElement<GetFilesResponse> createGetFilesResponse(GetFilesResponse value) {
        return new JAXBElement<GetFilesResponse>(_GetFilesResponse_QNAME, GetFilesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDirectoriesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.sw1.barisja2.oocl.com/", name = "getDirectoriesResponse")
    public JAXBElement<GetDirectoriesResponse> createGetDirectoriesResponse(GetDirectoriesResponse value) {
        return new JAXBElement<GetDirectoriesResponse>(_GetDirectoriesResponse_QNAME, GetDirectoriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDirectories }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.sw1.barisja2.oocl.com/", name = "getDirectories")
    public JAXBElement<GetDirectories> createGetDirectories(GetDirectories value) {
        return new JAXBElement<GetDirectories>(_GetDirectories_QNAME, GetDirectories.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFiles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.sw1.barisja2.oocl.com/", name = "getFiles")
    public JAXBElement<GetFiles> createGetFiles(GetFiles value) {
        return new JAXBElement<GetFiles>(_GetFiles_QNAME, GetFiles.class, null, value);
    }

}
