
package com.dfwcomputech.japp.remotecontract;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.dfwcomputech.japp.remotecontract package. 
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

    private final static QName _GetCurrentUser_QNAME = new QName("http://remotecontract.japp.dfwcomputech.com", "getCurrentUser");
    private final static QName _GetCurrentUserResponse_QNAME = new QName("http://remotecontract.japp.dfwcomputech.com", "getCurrentUserResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.dfwcomputech.japp.remotecontract
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCurrentUserResponse }
     * 
     */
    public GetCurrentUserResponse createGetCurrentUserResponse() {
        return new GetCurrentUserResponse();
    }

    /**
     * Create an instance of {@link GetCurrentUser }
     * 
     */
    public GetCurrentUser createGetCurrentUser() {
        return new GetCurrentUser();
    }

    /**
     * Create an instance of {@link JAppUser }
     * 
     */
    public JAppUser createJAppUser() {
        return new JAppUser();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://remotecontract.japp.dfwcomputech.com", name = "getCurrentUser")
    public JAXBElement<GetCurrentUser> createGetCurrentUser(GetCurrentUser value) {
        return new JAXBElement<GetCurrentUser>(_GetCurrentUser_QNAME, GetCurrentUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://remotecontract.japp.dfwcomputech.com", name = "getCurrentUserResponse")
    public JAXBElement<GetCurrentUserResponse> createGetCurrentUserResponse(GetCurrentUserResponse value) {
        return new JAXBElement<GetCurrentUserResponse>(_GetCurrentUserResponse_QNAME, GetCurrentUserResponse.class, null, value);
    }

}
