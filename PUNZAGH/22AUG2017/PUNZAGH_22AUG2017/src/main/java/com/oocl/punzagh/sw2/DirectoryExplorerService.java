
package com.oocl.punzagh.sw2;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "DirectoryExplorerService", targetNamespace = "http://webservice.sw1.barisja2.oocl.com/", wsdlLocation = "http://ZHA-ITA016-W7:8080/BARISJA2_22AUG2017/DirectoryExplorerService?wsdl")
public class DirectoryExplorerService
    extends Service
{

    private final static URL DIRECTORYEXPLORERSERVICE_WSDL_LOCATION;
    private final static WebServiceException DIRECTORYEXPLORERSERVICE_EXCEPTION;
    private final static QName DIRECTORYEXPLORERSERVICE_QNAME = new QName("http://webservice.sw1.barisja2.oocl.com/", "DirectoryExplorerService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://ZHA-ITA016-W7:8080/BARISJA2_22AUG2017/DirectoryExplorerService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DIRECTORYEXPLORERSERVICE_WSDL_LOCATION = url;
        DIRECTORYEXPLORERSERVICE_EXCEPTION = e;
    }

    public DirectoryExplorerService() {
        super(__getWsdlLocation(), DIRECTORYEXPLORERSERVICE_QNAME);
    }

    public DirectoryExplorerService(WebServiceFeature... features) {
        super(__getWsdlLocation(), DIRECTORYEXPLORERSERVICE_QNAME, features);
    }

    public DirectoryExplorerService(URL wsdlLocation) {
        super(wsdlLocation, DIRECTORYEXPLORERSERVICE_QNAME);
    }

    public DirectoryExplorerService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DIRECTORYEXPLORERSERVICE_QNAME, features);
    }

    public DirectoryExplorerService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DirectoryExplorerService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns DirectoryExplorer
     */
    @WebEndpoint(name = "DirectoryExplorerPort")
    public DirectoryExplorer getDirectoryExplorerPort() {
        return super.getPort(new QName("http://webservice.sw1.barisja2.oocl.com/", "DirectoryExplorerPort"), DirectoryExplorer.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DirectoryExplorer
     */
    @WebEndpoint(name = "DirectoryExplorerPort")
    public DirectoryExplorer getDirectoryExplorerPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice.sw1.barisja2.oocl.com/", "DirectoryExplorerPort"), DirectoryExplorer.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DIRECTORYEXPLORERSERVICE_EXCEPTION!= null) {
            throw DIRECTORYEXPLORERSERVICE_EXCEPTION;
        }
        return DIRECTORYEXPLORERSERVICE_WSDL_LOCATION;
    }

}