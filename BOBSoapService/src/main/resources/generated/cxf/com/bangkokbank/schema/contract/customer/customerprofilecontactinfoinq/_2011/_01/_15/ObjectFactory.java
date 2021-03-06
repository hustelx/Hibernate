
package com.bangkokbank.schema.contract.customer.customerprofilecontactinfoinq._2011._01._15;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bangkokbank.schema.contract.customer.customerprofilecontactinfoinq._2011._01._15 package. 
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

    private final static QName _CustomerProfileContactInfoInqResp_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileContactInfoInq/2011/01/15", "CustomerProfileContactInfoInqResp");
    private final static QName _CustomerProfileContactInfoInqReq_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileContactInfoInq/2011/01/15", "CustomerProfileContactInfoInqReq");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bangkokbank.schema.contract.customer.customerprofilecontactinfoinq._2011._01._15
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CustomerProfileContactInfoInqOptionType }
     * 
     */
    public CustomerProfileContactInfoInqOptionType createCustomerProfileContactInfoInqOptionType() {
        return new CustomerProfileContactInfoInqOptionType();
    }

    /**
     * Create an instance of {@link CustomerProfileContactInfoInqResultType }
     * 
     */
    public CustomerProfileContactInfoInqResultType createCustomerProfileContactInfoInqResultType() {
        return new CustomerProfileContactInfoInqResultType();
    }

    /**
     * Create an instance of {@link CustomerProfileContactInfoInqReqType }
     * 
     */
    public CustomerProfileContactInfoInqReqType createCustomerProfileContactInfoInqReqType() {
        return new CustomerProfileContactInfoInqReqType();
    }

    /**
     * Create an instance of {@link CustomerProfileContactInfoInqRespType }
     * 
     */
    public CustomerProfileContactInfoInqRespType createCustomerProfileContactInfoInqRespType() {
        return new CustomerProfileContactInfoInqRespType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerProfileContactInfoInqRespType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileContactInfoInq/2011/01/15", name = "CustomerProfileContactInfoInqResp")
    public JAXBElement<CustomerProfileContactInfoInqRespType> createCustomerProfileContactInfoInqResp(CustomerProfileContactInfoInqRespType value) {
        return new JAXBElement<CustomerProfileContactInfoInqRespType>(_CustomerProfileContactInfoInqResp_QNAME, CustomerProfileContactInfoInqRespType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerProfileContactInfoInqReqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileContactInfoInq/2011/01/15", name = "CustomerProfileContactInfoInqReq")
    public JAXBElement<CustomerProfileContactInfoInqReqType> createCustomerProfileContactInfoInqReq(CustomerProfileContactInfoInqReqType value) {
        return new JAXBElement<CustomerProfileContactInfoInqReqType>(_CustomerProfileContactInfoInqReq_QNAME, CustomerProfileContactInfoInqReqType.class, null, value);
    }

}
