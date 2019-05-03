
package com.bangkokbank.schema.contract.customer.customerprofileaddressinfoinq._2011._01._15;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bangkokbank.schema.contract.customer.customerprofileaddressinfoinq._2011._01._15 package. 
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

    private final static QName _CustomerProfileAddressInfoInqResp_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAddressInfoInq/2011/01/15", "CustomerProfileAddressInfoInqResp");
    private final static QName _CustomerProfileAddressInfoInqReq_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAddressInfoInq/2011/01/15", "CustomerProfileAddressInfoInqReq");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bangkokbank.schema.contract.customer.customerprofileaddressinfoinq._2011._01._15
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CustomerProfileAddressInfoInqRespType }
     * 
     */
    public CustomerProfileAddressInfoInqRespType createCustomerProfileAddressInfoInqRespType() {
        return new CustomerProfileAddressInfoInqRespType();
    }

    /**
     * Create an instance of {@link CustomerProfileAddressInfoInqResultType }
     * 
     */
    public CustomerProfileAddressInfoInqResultType createCustomerProfileAddressInfoInqResultType() {
        return new CustomerProfileAddressInfoInqResultType();
    }

    /**
     * Create an instance of {@link CustomerProfileAddressInfoInqReqType }
     * 
     */
    public CustomerProfileAddressInfoInqReqType createCustomerProfileAddressInfoInqReqType() {
        return new CustomerProfileAddressInfoInqReqType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerProfileAddressInfoInqRespType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAddressInfoInq/2011/01/15", name = "CustomerProfileAddressInfoInqResp")
    public JAXBElement<CustomerProfileAddressInfoInqRespType> createCustomerProfileAddressInfoInqResp(CustomerProfileAddressInfoInqRespType value) {
        return new JAXBElement<CustomerProfileAddressInfoInqRespType>(_CustomerProfileAddressInfoInqResp_QNAME, CustomerProfileAddressInfoInqRespType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerProfileAddressInfoInqReqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAddressInfoInq/2011/01/15", name = "CustomerProfileAddressInfoInqReq")
    public JAXBElement<CustomerProfileAddressInfoInqReqType> createCustomerProfileAddressInfoInqReq(CustomerProfileAddressInfoInqReqType value) {
        return new JAXBElement<CustomerProfileAddressInfoInqReqType>(_CustomerProfileAddressInfoInqReq_QNAME, CustomerProfileAddressInfoInqReqType.class, null, value);
    }

}
