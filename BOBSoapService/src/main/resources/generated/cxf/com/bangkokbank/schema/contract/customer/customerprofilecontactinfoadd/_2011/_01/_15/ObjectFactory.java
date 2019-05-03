
package com.bangkokbank.schema.contract.customer.customerprofilecontactinfoadd._2011._01._15;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bangkokbank.schema.contract.customer.customerprofilecontactinfoadd._2011._01._15 package. 
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

    private final static QName _CustomerProfileContactInfoAddResp_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileContactInfoAdd/2011/01/15", "CustomerProfileContactInfoAddResp");
    private final static QName _CustomerProfileContactInfoAddReq_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileContactInfoAdd/2011/01/15", "CustomerProfileContactInfoAddReq");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bangkokbank.schema.contract.customer.customerprofilecontactinfoadd._2011._01._15
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CustomerProfileContactInfoAddReqType }
     * 
     */
    public CustomerProfileContactInfoAddReqType createCustomerProfileContactInfoAddReqType() {
        return new CustomerProfileContactInfoAddReqType();
    }

    /**
     * Create an instance of {@link CustomerProfileContactInfoAddResultType }
     * 
     */
    public CustomerProfileContactInfoAddResultType createCustomerProfileContactInfoAddResultType() {
        return new CustomerProfileContactInfoAddResultType();
    }

    /**
     * Create an instance of {@link CustomerProfileContactInfoAddRespType }
     * 
     */
    public CustomerProfileContactInfoAddRespType createCustomerProfileContactInfoAddRespType() {
        return new CustomerProfileContactInfoAddRespType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerProfileContactInfoAddRespType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileContactInfoAdd/2011/01/15", name = "CustomerProfileContactInfoAddResp")
    public JAXBElement<CustomerProfileContactInfoAddRespType> createCustomerProfileContactInfoAddResp(CustomerProfileContactInfoAddRespType value) {
        return new JAXBElement<CustomerProfileContactInfoAddRespType>(_CustomerProfileContactInfoAddResp_QNAME, CustomerProfileContactInfoAddRespType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerProfileContactInfoAddReqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileContactInfoAdd/2011/01/15", name = "CustomerProfileContactInfoAddReq")
    public JAXBElement<CustomerProfileContactInfoAddReqType> createCustomerProfileContactInfoAddReq(CustomerProfileContactInfoAddReqType value) {
        return new JAXBElement<CustomerProfileContactInfoAddReqType>(_CustomerProfileContactInfoAddReq_QNAME, CustomerProfileContactInfoAddReqType.class, null, value);
    }

}
