
package com.bangkokbank.schema.contract.customer.customersuspiciousacctadd._2011._01._15;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bangkokbank.schema.contract.customer.customersuspiciousacctadd._2011._01._15 package. 
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

    private final static QName _CustomerSuspiciousAcctAddReq_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctAdd/2011/01/15", "CustomerSuspiciousAcctAddReq");
    private final static QName _CustomerSuspiciousAcctAddResp_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctAdd/2011/01/15", "CustomerSuspiciousAcctAddResp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bangkokbank.schema.contract.customer.customersuspiciousacctadd._2011._01._15
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CustomerSuspiciousAcctAddReqType }
     * 
     */
    public CustomerSuspiciousAcctAddReqType createCustomerSuspiciousAcctAddReqType() {
        return new CustomerSuspiciousAcctAddReqType();
    }

    /**
     * Create an instance of {@link CustomerSuspiciousAcctAddResultType }
     * 
     */
    public CustomerSuspiciousAcctAddResultType createCustomerSuspiciousAcctAddResultType() {
        return new CustomerSuspiciousAcctAddResultType();
    }

    /**
     * Create an instance of {@link CustomerSuspiciousAcctAddRespType }
     * 
     */
    public CustomerSuspiciousAcctAddRespType createCustomerSuspiciousAcctAddRespType() {
        return new CustomerSuspiciousAcctAddRespType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerSuspiciousAcctAddReqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctAdd/2011/01/15", name = "CustomerSuspiciousAcctAddReq")
    public JAXBElement<CustomerSuspiciousAcctAddReqType> createCustomerSuspiciousAcctAddReq(CustomerSuspiciousAcctAddReqType value) {
        return new JAXBElement<CustomerSuspiciousAcctAddReqType>(_CustomerSuspiciousAcctAddReq_QNAME, CustomerSuspiciousAcctAddReqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerSuspiciousAcctAddRespType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctAdd/2011/01/15", name = "CustomerSuspiciousAcctAddResp")
    public JAXBElement<CustomerSuspiciousAcctAddRespType> createCustomerSuspiciousAcctAddResp(CustomerSuspiciousAcctAddRespType value) {
        return new JAXBElement<CustomerSuspiciousAcctAddRespType>(_CustomerSuspiciousAcctAddResp_QNAME, CustomerSuspiciousAcctAddRespType.class, null, value);
    }

}
