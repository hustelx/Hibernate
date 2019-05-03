
package com.bangkokbank.schema.contract.customer.customerindiciacheckinq._2016._08._13;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bangkokbank.schema.contract.customer.customerindiciacheckinq._2016._08._13 package. 
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

    private final static QName _CustomerIndiciaCheckInqResp_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerIndiciaCheckInq/2016/08/13", "CustomerIndiciaCheckInqResp");
    private final static QName _CustomerIndiciaCheckInqReq_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerIndiciaCheckInq/2016/08/13", "CustomerIndiciaCheckInqReq");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bangkokbank.schema.contract.customer.customerindiciacheckinq._2016._08._13
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CustomerIndiciaCheckInqRespType }
     * 
     */
    public CustomerIndiciaCheckInqRespType createCustomerIndiciaCheckInqRespType() {
        return new CustomerIndiciaCheckInqRespType();
    }

    /**
     * Create an instance of {@link CustomerIndiciaCheckInqCriteriaType }
     * 
     */
    public CustomerIndiciaCheckInqCriteriaType createCustomerIndiciaCheckInqCriteriaType() {
        return new CustomerIndiciaCheckInqCriteriaType();
    }

    /**
     * Create an instance of {@link CustomerIndiciaCheckInqReqType }
     * 
     */
    public CustomerIndiciaCheckInqReqType createCustomerIndiciaCheckInqReqType() {
        return new CustomerIndiciaCheckInqReqType();
    }

    /**
     * Create an instance of {@link CustomerIndiciaCheckInqResultsType }
     * 
     */
    public CustomerIndiciaCheckInqResultsType createCustomerIndiciaCheckInqResultsType() {
        return new CustomerIndiciaCheckInqResultsType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerIndiciaCheckInqRespType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerIndiciaCheckInq/2016/08/13", name = "CustomerIndiciaCheckInqResp")
    public JAXBElement<CustomerIndiciaCheckInqRespType> createCustomerIndiciaCheckInqResp(CustomerIndiciaCheckInqRespType value) {
        return new JAXBElement<CustomerIndiciaCheckInqRespType>(_CustomerIndiciaCheckInqResp_QNAME, CustomerIndiciaCheckInqRespType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerIndiciaCheckInqReqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerIndiciaCheckInq/2016/08/13", name = "CustomerIndiciaCheckInqReq")
    public JAXBElement<CustomerIndiciaCheckInqReqType> createCustomerIndiciaCheckInqReq(CustomerIndiciaCheckInqReqType value) {
        return new JAXBElement<CustomerIndiciaCheckInqReqType>(_CustomerIndiciaCheckInqReq_QNAME, CustomerIndiciaCheckInqReqType.class, null, value);
    }

}
