
package com.bangkokbank.schema.contract.customer.customersuspiciousacctdel._2011._01._15;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bangkokbank.schema.contract.customer.customersuspiciousacctdel._2011._01._15 package. 
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

    private final static QName _CustomerSuspiciousAcctDelResp_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctDel/2011/01/15", "CustomerSuspiciousAcctDelResp");
    private final static QName _CustomerSuspiciousAcctDelReq_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctDel/2011/01/15", "CustomerSuspiciousAcctDelReq");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bangkokbank.schema.contract.customer.customersuspiciousacctdel._2011._01._15
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CustomerSuspiciousAcctDelReqType }
     * 
     */
    public CustomerSuspiciousAcctDelReqType createCustomerSuspiciousAcctDelReqType() {
        return new CustomerSuspiciousAcctDelReqType();
    }

    /**
     * Create an instance of {@link CustomerSuspiciousAcctDelResultType }
     * 
     */
    public CustomerSuspiciousAcctDelResultType createCustomerSuspiciousAcctDelResultType() {
        return new CustomerSuspiciousAcctDelResultType();
    }

    /**
     * Create an instance of {@link CustomerSuspiciousAcctDelRespType }
     * 
     */
    public CustomerSuspiciousAcctDelRespType createCustomerSuspiciousAcctDelRespType() {
        return new CustomerSuspiciousAcctDelRespType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerSuspiciousAcctDelRespType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctDel/2011/01/15", name = "CustomerSuspiciousAcctDelResp")
    public JAXBElement<CustomerSuspiciousAcctDelRespType> createCustomerSuspiciousAcctDelResp(CustomerSuspiciousAcctDelRespType value) {
        return new JAXBElement<CustomerSuspiciousAcctDelRespType>(_CustomerSuspiciousAcctDelResp_QNAME, CustomerSuspiciousAcctDelRespType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerSuspiciousAcctDelReqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctDel/2011/01/15", name = "CustomerSuspiciousAcctDelReq")
    public JAXBElement<CustomerSuspiciousAcctDelReqType> createCustomerSuspiciousAcctDelReq(CustomerSuspiciousAcctDelReqType value) {
        return new JAXBElement<CustomerSuspiciousAcctDelReqType>(_CustomerSuspiciousAcctDelReq_QNAME, CustomerSuspiciousAcctDelReqType.class, null, value);
    }

}
