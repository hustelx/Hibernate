
package com.bangkokbank.schema.contract.customer.customersuspiciousacctinq._2011._01._15;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bangkokbank.schema.contract.customer.customersuspiciousacctinq._2011._01._15 package. 
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

    private final static QName _CustomerSuspiciousAcctInqReq_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctInq/2011/01/15", "CustomerSuspiciousAcctInqReq");
    private final static QName _CustomerSuspiciousAcctInqResp_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctInq/2011/01/15", "CustomerSuspiciousAcctInqResp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bangkokbank.schema.contract.customer.customersuspiciousacctinq._2011._01._15
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CustomerSuspiciousAcctInqReqType }
     * 
     */
    public CustomerSuspiciousAcctInqReqType createCustomerSuspiciousAcctInqReqType() {
        return new CustomerSuspiciousAcctInqReqType();
    }

    /**
     * Create an instance of {@link CustomerSuspiciousAcctInqResultType }
     * 
     */
    public CustomerSuspiciousAcctInqResultType createCustomerSuspiciousAcctInqResultType() {
        return new CustomerSuspiciousAcctInqResultType();
    }

    /**
     * Create an instance of {@link CustomerSuspiciousAcctInqRespType }
     * 
     */
    public CustomerSuspiciousAcctInqRespType createCustomerSuspiciousAcctInqRespType() {
        return new CustomerSuspiciousAcctInqRespType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerSuspiciousAcctInqReqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctInq/2011/01/15", name = "CustomerSuspiciousAcctInqReq")
    public JAXBElement<CustomerSuspiciousAcctInqReqType> createCustomerSuspiciousAcctInqReq(CustomerSuspiciousAcctInqReqType value) {
        return new JAXBElement<CustomerSuspiciousAcctInqReqType>(_CustomerSuspiciousAcctInqReq_QNAME, CustomerSuspiciousAcctInqReqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerSuspiciousAcctInqRespType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctInq/2011/01/15", name = "CustomerSuspiciousAcctInqResp")
    public JAXBElement<CustomerSuspiciousAcctInqRespType> createCustomerSuspiciousAcctInqResp(CustomerSuspiciousAcctInqRespType value) {
        return new JAXBElement<CustomerSuspiciousAcctInqRespType>(_CustomerSuspiciousAcctInqResp_QNAME, CustomerSuspiciousAcctInqRespType.class, null, value);
    }

}
