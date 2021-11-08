
package Client;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CalculatorWebService", targetNamespace = "http://calculatorwebservice/", wsdlLocation = "http://localhost:8080/CalculatorWebServices/CalculatorWebService?WSDL")
public class CalculatorWebService_Service
    extends Service
{

    private final static URL CALCULATORWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException CALCULATORWEBSERVICE_EXCEPTION;
    private final static QName CALCULATORWEBSERVICE_QNAME = new QName("http://calculatorwebservice/", "CalculatorWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/CalculatorWebServices/CalculatorWebService?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CALCULATORWEBSERVICE_WSDL_LOCATION = url;
        CALCULATORWEBSERVICE_EXCEPTION = e;
    }

    public CalculatorWebService_Service() {
        super(__getWsdlLocation(), CALCULATORWEBSERVICE_QNAME);
    }

    public CalculatorWebService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CALCULATORWEBSERVICE_QNAME, features);
    }

    public CalculatorWebService_Service(URL wsdlLocation) {
        super(wsdlLocation, CALCULATORWEBSERVICE_QNAME);
    }

    public CalculatorWebService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CALCULATORWEBSERVICE_QNAME, features);
    }

    public CalculatorWebService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CalculatorWebService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CalculatorWebService
     */
    @WebEndpoint(name = "CalculatorWebServicePort")
    public CalculatorWebService getCalculatorWebServicePort() {
        return super.getPort(new QName("http://calculatorwebservice/", "CalculatorWebServicePort"), CalculatorWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CalculatorWebService
     */
    @WebEndpoint(name = "CalculatorWebServicePort")
    public CalculatorWebService getCalculatorWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://calculatorwebservice/", "CalculatorWebServicePort"), CalculatorWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CALCULATORWEBSERVICE_EXCEPTION!= null) {
            throw CALCULATORWEBSERVICE_EXCEPTION;
        }
        return CALCULATORWEBSERVICE_WSDL_LOCATION;
    }

}
