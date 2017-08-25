
package com.oocl.punzagh.sw2;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "DirectoryExplorer", targetNamespace = "http://webservice.sw1.barisja2.oocl.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DirectoryExplorer {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDirectories", targetNamespace = "http://webservice.sw1.barisja2.oocl.com/", className = "com.oocl.barisja2.sw1.webservice.GetDirectories")
    @ResponseWrapper(localName = "getDirectoriesResponse", targetNamespace = "http://webservice.sw1.barisja2.oocl.com/", className = "com.oocl.barisja2.sw1.webservice.GetDirectoriesResponse")
    @Action(input = "http://webservice.sw1.barisja2.oocl.com/DirectoryExplorer/getDirectoriesRequest", output = "http://webservice.sw1.barisja2.oocl.com/DirectoryExplorer/getDirectoriesResponse")
    public String getDirectories();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getFiles", targetNamespace = "http://webservice.sw1.barisja2.oocl.com/", className = "com.oocl.barisja2.sw1.webservice.GetFiles")
    @ResponseWrapper(localName = "getFilesResponse", targetNamespace = "http://webservice.sw1.barisja2.oocl.com/", className = "com.oocl.barisja2.sw1.webservice.GetFilesResponse")
    @Action(input = "http://webservice.sw1.barisja2.oocl.com/DirectoryExplorer/getFilesRequest", output = "http://webservice.sw1.barisja2.oocl.com/DirectoryExplorer/getFilesResponse")
    public String getFiles();

}