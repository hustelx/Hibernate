
package com.bangkokbank.schema.contract.customer.customerprofilecontactinfomod._2011._01._15;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bangkokbank.schema.contract.customer.customerprofilecontactinfomod._2011._01._15 package. 
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

    private final static QName _CustomerProfileContactInfoModResp_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileContactInfoMod/2011/01/15", "CustomerProfileContactInfoModResp");
    private final static QName _CustomerProfileContactInfoModReq_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileContactInfoMod/2011/01/15", "CustomerProfileContactInfoModReq");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bangkokbank.schema.contract.customer.customerprofilecontactinfomod._2011._01._15
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CustomerProfileContactInfoModReqType }
     * 
     */
    public CustomerProfileContactInfoModReqType createCustomerProfileContactInfoModReqType() {
        return new CustomerProfileContactInfoModReqType();
    }

    /**
     * Create an instance of {@link CustomerProfileContactInfoModResultType }
     * 
     */
    public CustomerProfileContactInfoModResultType createCustomerProfileContactInfoModResultType() {
        return new CustomerProfileContactInfoModResultType();
    }

    /**
     * Create an instance of {@link CustomerProfileContactInfoModRespType }
     * 
     */
    public CustomerProfileContactInfoModRespType createCustomerProfileContactInfoModRespType() {
        return new CustomerProfileContactInfoModRespType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerProfileContactInfoModRespType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileContactInfoMod/2011/01/15", name = "CustomerProfileContactInfoModResp")
    public JAXBElement<CustomerProfileContactInfoModRespType> createCustomerProfileContactInfoModResp(CustomerProfileContactInfoModRespType value) {
        return new JAXBElement<CustomerProfileContactInfoModRespType>(_CustomerProfileContactInfoModResp_QNAME, CustomerProfileContactInfoModRespType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerProfileContactInfoModReqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileContactInfoMod/2011/01/15", name = "CustomerProfileContactInfoModReq")
    public JAXBElement<CustomerProfileContactInfoModReqType> createCustomerProfileContactInfoModReq(CustomerProfileContactInfoModReqType value) {
        return new JAXBElement<CustomerProfileContactInfoModReqType>(_CustomerProfileContactInfoModReq_QNAME, CustomerProfileContactInfoModReqType.class, null, value);
    }

}
