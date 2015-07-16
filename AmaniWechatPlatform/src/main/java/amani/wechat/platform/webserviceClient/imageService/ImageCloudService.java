
package amani.wechat.platform.webserviceClient.imageService;

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
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ImageCloudService", targetNamespace = "http://services.amani.com", wsdlLocation = "http://localhost:8080/AMNCommonService/services/ImageCloudService?wsdl")
public class ImageCloudService
    extends Service
{

    private final static URL IMAGECLOUDSERVICE_WSDL_LOCATION;
    private final static WebServiceException IMAGECLOUDSERVICE_EXCEPTION;
    private final static QName IMAGECLOUDSERVICE_QNAME = new QName("http://services.amani.com", "ImageCloudService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/AMNCommonService/services/ImageCloudService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        IMAGECLOUDSERVICE_WSDL_LOCATION = url;
        IMAGECLOUDSERVICE_EXCEPTION = e;
    }

    public ImageCloudService() {
        super(__getWsdlLocation(), IMAGECLOUDSERVICE_QNAME);
    }

    public ImageCloudService(WebServiceFeature... features) {
        super(__getWsdlLocation(), IMAGECLOUDSERVICE_QNAME, features);
    }

    public ImageCloudService(URL wsdlLocation) {
        super(wsdlLocation, IMAGECLOUDSERVICE_QNAME);
    }

    public ImageCloudService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, IMAGECLOUDSERVICE_QNAME, features);
    }

    public ImageCloudService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ImageCloudService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ImageCloudServicePortType
     */
    @WebEndpoint(name = "ImageCloudServiceHttpPort")
    public ImageCloudServicePortType getImageCloudServiceHttpPort() {
        return super.getPort(new QName("http://services.amani.com", "ImageCloudServiceHttpPort"), ImageCloudServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ImageCloudServicePortType
     */
    @WebEndpoint(name = "ImageCloudServiceHttpPort")
    public ImageCloudServicePortType getImageCloudServiceHttpPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.amani.com", "ImageCloudServiceHttpPort"), ImageCloudServicePortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (IMAGECLOUDSERVICE_EXCEPTION!= null) {
            throw IMAGECLOUDSERVICE_EXCEPTION;
        }
        return IMAGECLOUDSERVICE_WSDL_LOCATION;
    }

}