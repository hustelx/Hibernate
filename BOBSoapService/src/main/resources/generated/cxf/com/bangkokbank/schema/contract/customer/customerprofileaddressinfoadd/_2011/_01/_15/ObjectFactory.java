
package com.bangkokbank.schema.contract.customer.customerprofileaddressinfoadd._2011._01._15;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bangkokbank.schema.contract.customer.customerprofileaddressinfoadd._2011._01._15 package. 
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

    private final static QName _CustomerProfileAddressInfoAddReq_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAddressInfoAdd/2011/01/15", "CustomerProfileAddressInfoAddReq");
    private final static QName _CustomerProfileAddressInfoAddResp_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAddressInfoAdd/2011/01/15", "CustomerProfileAddressInfoAddResp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bangkokbank.schema.contract.customer.customerprofileaddressinfoadd._2011._01._15
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CustomerProfileAddressInfoAddReqType }
     * 
     */
    public CustomerProfileAddressInfoAddReqType createCustomerProfileAddressInfoAddReqType() {
        return new CustomerProfileAddressInfoAddReqType();
    }

    /**
     * Create an instance of {@link CustomerProfileAddressInfoAddRespType }
     * 
     */
    public CustomerProfileAddressInfoAddRespType createCustomerProfileAddressInfoAddRespType() {
        return new CustomerProfileAddressInfoAddRespType();
    }

    /**
     * Create an instance of {@link CustomerProfileAddressInfoAddResultType }
     * 
     */
    public CustomerProfileAddressInfoAddResultType createCustomerProfileAddressInfoAddResultType() {
        return new CustomerProfileAddressInfoAddResultType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerProfileAddressInfoAddReqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAddressInfoAdd/2011/01/15", name = "CustomerProfileAddressInfoAddReq")
    public JAXBElement<CustomerProfileAddressInfoAddReqType> createCustomerProfileAddressInfoAddReq(CustomerProfileAddressInfoAddReqType value) {
        return new JAXBElement<CustomerProfileAddressInfoAddReqType>(_CustomerProfileAddressInfoAddReq_QNAME, CustomerProfileAddressInfoAddReqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerProfileAddressInfoAddRespType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAddressInfoAdd/2011/01/15", name = "CustomerProfileAddressInfoAddResp")
    public JAXBElement<CustomerProfileAddressInfoAddRespType> createCustomerProfileAddressInfoAddResp(CustomerProfileAddressInfoAddRespType value) {
        return new JAXBElement<CustomerProfileAddressInfoAddRespType>(_CustomerProfileAddressInfoAddResp_QNAME, CustomerProfileAddressInfoAddRespType.class, null, value);
    }

}
