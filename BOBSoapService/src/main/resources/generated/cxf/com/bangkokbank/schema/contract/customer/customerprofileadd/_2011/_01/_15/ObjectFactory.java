
package com.bangkokbank.schema.contract.customer.customerprofileadd._2011._01._15;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bangkokbank.schema.contract.customer.customerprofileadd._2011._01._15 package. 
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

    private final static QName _CustomerProfileAddReq_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAdd/2011/01/15", "CustomerProfileAddReq");
    private final static QName _CustomerProfileAddResp_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAdd/2011/01/15", "CustomerProfileAddResp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bangkokbank.schema.contract.customer.customerprofileadd._2011._01._15
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CustomerProfileAddRespType }
     * 
     */
    public CustomerProfileAddRespType createCustomerProfileAddRespType() {
        return new CustomerProfileAddRespType();
    }

    /**
     * Create an instance of {@link CustomerProfileAddReqType }
     * 
     */
    public CustomerProfileAddReqType createCustomerProfileAddReqType() {
        return new CustomerProfileAddReqType();
    }

    /**
     * Create an instance of {@link CustomerProfileAddResultType }
     * 
     */
    public CustomerProfileAddResultType createCustomerProfileAddResultType() {
        return new CustomerProfileAddResultType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerProfileAddReqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAdd/2011/01/15", name = "CustomerProfileAddReq")
    public JAXBElement<CustomerProfileAddReqType> createCustomerProfileAddReq(CustomerProfileAddReqType value) {
        return new JAXBElement<CustomerProfileAddReqType>(_CustomerProfileAddReq_QNAME, CustomerProfileAddReqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerProfileAddRespType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAdd/2011/01/15", name = "CustomerProfileAddResp")
    public JAXBElement<CustomerProfileAddRespType> createCustomerProfileAddResp(CustomerProfileAddRespType value) {
        return new JAXBElement<CustomerProfileAddRespType>(_CustomerProfileAddResp_QNAME, CustomerProfileAddRespType.class, null, value);
    }

}
