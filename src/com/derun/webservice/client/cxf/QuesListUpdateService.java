package com.derun.webservice.client.cxf;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.6.0
 * 2016-08-26T10:17:43.099+08:00
 * Generated source version: 2.6.0
 * 
 */
@WebServiceClient(name = "QuesListUpdateService", 
                  wsdlLocation = "http://localhost:8001/taxcarship/services/QuesListUpdateService?wsdl",
                  targetNamespace = "http://service.wtmd.derun.com") 
public class QuesListUpdateService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.wtmd.derun.com", "QuesListUpdateService");
    public final static QName QuesListUpdateServiceHttpPort = new QName("http://service.wtmd.derun.com", "QuesListUpdateServiceHttpPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8001/taxcarship/services/QuesListUpdateService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(QuesListUpdateService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8001/taxcarship/services/QuesListUpdateService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public QuesListUpdateService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public QuesListUpdateService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public QuesListUpdateService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns QuesListUpdateServicePortType
     */
    @WebEndpoint(name = "QuesListUpdateServiceHttpPort")
    public QuesListUpdateServicePortType getQuesListUpdateServiceHttpPort() {
        return super.getPort(QuesListUpdateServiceHttpPort, QuesListUpdateServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns QuesListUpdateServicePortType
     */
    @WebEndpoint(name = "QuesListUpdateServiceHttpPort")
    public QuesListUpdateServicePortType getQuesListUpdateServiceHttpPort(WebServiceFeature... features) {
        return super.getPort(QuesListUpdateServiceHttpPort, QuesListUpdateServicePortType.class, features);
    }

}