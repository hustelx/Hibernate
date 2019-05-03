
package com.bangkokbank.schema.contract.customer.customersuspiciousacctmod._2011._01._15;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bangkokbank.schema.contract.customer.customersuspiciousacctmod._2011._01._15 package. 
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

    private final static QName _CustomerSuspiciousAcctModResp_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctMod/2011/01/15", "CustomerSuspiciousAcctModResp");
    private final static QName _CustomerSuspiciousAcctModReq_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctMod/2011/01/15", "CustomerSuspiciousAcctModReq");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bangkokbank.schema.contract.customer.customersuspiciousacctmod._2011._01._15
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CustomerSuspiciousAcctModReqType }
     * 
     */
    public CustomerSuspiciousAcctModReqType createCustomerSuspiciousAcctModReqType() {
        return new CustomerSuspiciousAcctModReqType();
    }

    /**
     * Create an instance of {@link CustomerSuspiciousAcctModRespType }
     * 
     */
    public CustomerSuspiciousAcctModRespType createCustomerSuspiciousAcctModRespType() {
        return new CustomerSuspiciousAcctModRespType();
    }

    /**
     * Create an instance of {@link CustomerSuspiciousAcctModResultType }
     * 
     */
    public CustomerSuspiciousAcctModResultType createCustomerSuspiciousAcctModResultType() {
        return new CustomerSuspiciousAcctModResultType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerSuspiciousAcctModRespType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctMod/2011/01/15", name = "CustomerSuspiciousAcctModResp")
    public JAXBElement<CustomerSuspiciousAcctModRespType> createCustomerSuspiciousAcctModResp(CustomerSuspiciousAcctModRespType value) {
        return new JAXBElement<CustomerSuspiciousAcctModRespType>(_CustomerSuspiciousAcctModResp_QNAME, CustomerSuspiciousAcctModRespType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerSuspiciousAcctModReqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctMod/2011/01/15", name = "CustomerSuspiciousAcctModReq")
    public JAXBElement<CustomerSuspiciousAcctModReqType> createCustomerSuspiciousAcctModReq(CustomerSuspiciousAcctModReqType value) {
        return new JAXBElement<CustomerSuspiciousAcctModReqType>(_CustomerSuspiciousAcctModReq_QNAME, CustomerSuspiciousAcctModReqType.class, null, value);
    }

}
