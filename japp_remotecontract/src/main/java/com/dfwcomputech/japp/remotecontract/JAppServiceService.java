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
 * 2014-03-13T15:04:17.904-05:00
 * Generated source version: 2.7.5
 * 
 */
@WebServiceClient(name = "JAppServiceService", 
                  wsdlLocation = "file:/C:/Users/i315270/git/japp/japp_remotecontract/src/model/resources/JAPPService.wsdl",
                  targetNamespace = "http://remotecontract.japp.dfwcomputech.com") 
public class JAppServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://remotecontract.japp.dfwcomputech.com", "JAppServiceService");
    public final static QName JAppServicePort = new QName("http://remotecontract.japp.dfwcomputech.com", "JAppServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/i315270/git/japp/japp_remotecontract/src/model/resources/JAPPService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(JAppServiceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/i315270/git/japp/japp_remotecontract/src/model/resources/JAPPService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public JAppServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public JAppServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public JAppServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public JAppServiceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public JAppServiceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public JAppServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns JAppService
     */
    @WebEndpoint(name = "JAppServicePort")
    public JAppService getJAppServicePort() {
        return super.getPort(JAppServicePort, JAppService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns JAppService
     */
    @WebEndpoint(name = "JAppServicePort")
    public JAppService getJAppServicePort(WebServiceFeature... features) {
        return super.getPort(JAppServicePort, JAppService.class, features);
    }

}