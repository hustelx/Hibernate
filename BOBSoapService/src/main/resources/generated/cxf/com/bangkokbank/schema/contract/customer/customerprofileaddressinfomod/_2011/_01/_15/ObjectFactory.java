
package com.bangkokbank.schema.contract.customer.customerprofileaddressinfomod._2011._01._15;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bangkokbank.schema.contract.customer.customerprofileaddressinfomod._2011._01._15 package. 
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

    private final static QName _CustomerProfileAddressInfoModReq_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAddressInfoMod/2011/01/15", "CustomerProfileAddressInfoModReq");
    private final static QName _CustomerProfileAddressInfoModResp_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAddressInfoMod/2011/01/15", "CustomerProfileAddressInfoModResp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bangkokbank.schema.contract.customer.customerprofileaddressinfomod._2011._01._15
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CustomerProfileAddressInfoModRespType }
     * 
     */
    public CustomerProfileAddressInfoModRespType createCustomerProfileAddressInfoModRespType() {
        return new CustomerProfileAddressInfoModRespType();
    }

    /**
     * Create an instance of {@link CustomerProfileAddressInfoModReqType }
     * 
     */
    public CustomerProfileAddressInfoModReqType createCustomerProfileAddressInfoModReqType() {
        return new CustomerProfileAddressInfoModReqType();
    }

    /**
     * Create an instance of {@link CustomerProfileAddressInfoModResultType }
     * 
     */
    public CustomerProfileAddressInfoModResultType createCustomerProfileAddressInfoModResultType() {
        return new CustomerProfileAddressInfoModResultType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerProfileAddressInfoModReqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAddressInfoMod/2011/01/15", name = "CustomerProfileAddressInfoModReq")
    public JAXBElement<CustomerProfileAddressInfoModReqType> createCustomerProfileAddressInfoModReq(CustomerProfileAddressInfoModReqType value) {
        return new JAXBElement<CustomerProfileAddressInfoModReqType>(_CustomerProfileAddressInfoModReq_QNAME, CustomerProfileAddressInfoModReqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerProfileAddressInfoModRespType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAddressInfoMod/2011/01/15", name = "CustomerProfileAddressInfoModResp")
    public JAXBElement<CustomerProfileAddressInfoModRespType> createCustomerProfileAddressInfoModResp(CustomerProfileAddressInfoModRespType value) {
        return new JAXBElement<CustomerProfileAddressInfoModRespType>(_CustomerProfileAddressInfoModResp_QNAME, CustomerProfileAddressInfoModRespType.class, null, value);
    }

}
