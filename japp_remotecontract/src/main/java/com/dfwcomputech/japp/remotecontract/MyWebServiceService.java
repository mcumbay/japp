package com.dfwcomputech.japp.remotecontract;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.5
 * 2014-03-13T16:26:03.957-05:00
 * Generated source version: 2.7.5
 * 
 */
@WebServiceClient(name = "MyWebServiceService", 
                  wsdlLocation = "file:/C:/Users/i315270/git/japp/japp_remotecontract/src/model/resources/MyWebService.wsdl",
                  targetNamespace = "http://remotecontract.japp.dfwcomputech.com") 
public class MyWebServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://remotecontract.japp.dfwcomputech.com", "MyWebServiceService");
    public final static QName MyWebServicePort = new QName("http://remotecontract.japp.dfwcomputech.com", "MyWebServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/i315270/git/japp/japp_remotecontract/src/model/resources/MyWebService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(MyWebServiceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/i315270/git/japp/japp_remotecontract/src/model/resources/MyWebService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public MyWebServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public MyWebServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MyWebServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public MyWebServiceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public MyWebServiceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public MyWebServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns MyWebService
     */
    @WebEndpoint(name = "MyWebServicePort")
    public MyWebService getMyWebServicePort() {
        return super.getPort(MyWebServicePort, MyWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MyWebService
     */
    @WebEndpoint(name = "MyWebServicePort")
    public MyWebService getMyWebServicePort(WebServiceFeature... features) {
        return super.getPort(MyWebServicePort, MyWebService.class, features);
    }

}
