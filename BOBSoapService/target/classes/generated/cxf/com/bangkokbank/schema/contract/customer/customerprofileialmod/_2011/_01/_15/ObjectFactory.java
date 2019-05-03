
package com.bangkokbank.schema.contract.customer.customerprofileialmod._2011._01._15;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bangkokbank.schema.contract.customer.customerprofileialmod._2011._01._15 package. 
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

    private final static QName _CustomerProfileIALModReq_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileIALMod/2011/01/15", "CustomerProfileIALModReq");
    private final static QName _CustomerProfileIALModResp_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileIALMod/2011/01/15", "CustomerProfileIALModResp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bangkokbank.schema.contract.customer.customerprofileialmod._2011._01._15
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CustomerProfileIALModResultType }
     * 
     */
    public CustomerProfileIALModResultType createCustomerProfileIALModResultType() {
        return new CustomerProfileIALModResultType();
    }

    /**
     * Create an instance of {@link CustomerProfileIALModReqType }
     * 
     */
    public CustomerProfileIALModReqType createCustomerProfileIALModReqType() {
        return new CustomerProfileIALModReqType();
    }

    /**
     * Create an instance of {@link CustomerProfileIALModRespType }
     * 
     */
    public CustomerProfileIALModRespType createCustomerProfileIALModRespType() {
        return new CustomerProfileIALModRespType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerProfileIALModReqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileIALMod/2011/01/15", name = "CustomerProfileIALModReq")
    public JAXBElement<CustomerProfileIALModReqType> createCustomerProfileIALModReq(CustomerProfileIALModReqType value) {
        return new JAXBElement<CustomerProfileIALModReqType>(_CustomerProfileIALModReq_QNAME, CustomerProfileIALModReqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerProfileIALModRespType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileIALMod/2011/01/15", name = "CustomerProfileIALModResp")
    public JAXBElement<CustomerProfileIALModRespType> createCustomerProfileIALModResp(CustomerProfileIALModRespType value) {
        return new JAXBElement<CustomerProfileIALModRespType>(_CustomerProfileIALModResp_QNAME, CustomerProfileIALModRespType.class, null, value);
    }

}
