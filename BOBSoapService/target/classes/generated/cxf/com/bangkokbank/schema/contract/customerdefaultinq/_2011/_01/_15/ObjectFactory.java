
package com.bangkokbank.schema.contract.customerdefaultinq._2011._01._15;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bangkokbank.schema.contract.customerdefaultinq._2011._01._15 package. 
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

    private final static QName _CustomerDefaultInqReq_QNAME = new QName("http://www.bangkokbank.com/schema/contract/CustomerDefaultInq/2011/01/15", "CustomerDefaultInqReq");
    private final static QName _CustomerDefaultInqResp_QNAME = new QName("http://www.bangkokbank.com/schema/contract/CustomerDefaultInq/2011/01/15", "CustomerDefaultInqResp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bangkokbank.schema.contract.customerdefaultinq._2011._01._15
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CustomerDefaultInqRespType }
     * 
     */
    public CustomerDefaultInqRespType createCustomerDefaultInqRespType() {
        return new CustomerDefaultInqRespType();
    }

    /**
     * Create an instance of {@link CustomerDefaultInqRespType.CustomerDefaultInqResults }
     * 
     */
    public CustomerDefaultInqRespType.CustomerDefaultInqResults createCustomerDefaultInqRespTypeCustomerDefaultInqResults() {
        return new CustomerDefaultInqRespType.CustomerDefaultInqResults();
    }

    /**
     * Create an instance of {@link CustomerDefaultInqReqType }
     * 
     */
    public CustomerDefaultInqReqType createCustomerDefaultInqReqType() {
        return new CustomerDefaultInqReqType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerDefaultInqReqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/CustomerDefaultInq/2011/01/15", name = "CustomerDefaultInqReq")
    public JAXBElement<CustomerDefaultInqReqType> createCustomerDefaultInqReq(CustomerDefaultInqReqType value) {
        return new JAXBElement<CustomerDefaultInqReqType>(_CustomerDefaultInqReq_QNAME, CustomerDefaultInqReqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerDefaultInqRespType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/CustomerDefaultInq/2011/01/15", name = "CustomerDefaultInqResp")
    public JAXBElement<CustomerDefaultInqRespType> createCustomerDefaultInqResp(CustomerDefaultInqRespType value) {
        return new JAXBElement<CustomerDefaultInqRespType>(_CustomerDefaultInqResp_QNAME, CustomerDefaultInqRespType.class, null, value);
    }

}
