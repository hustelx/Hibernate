
package com.bangkokbank.schema.contract.customer.customerprofileshareholderinfomod._2011._01._15;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bangkokbank.schema.contract.customer.customerprofileshareholderinfomod._2011._01._15 package. 
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

    private final static QName _CustomerProfileShareHolderInfoModReq_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoMod/2011/01/15", "CustomerProfileShareHolderInfoModReq");
    private final static QName _CustomerProfileShareHolderInfoModResp_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoMod/2011/01/15", "CustomerProfileShareHolderInfoModResp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bangkokbank.schema.contract.customer.customerprofileshareholderinfomod._2011._01._15
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CustomerProfileShareHolderInfoModResultType }
     * 
     */
    public CustomerProfileShareHolderInfoModResultType createCustomerProfileShareHolderInfoModResultType() {
        return new CustomerProfileShareHolderInfoModResultType();
    }

    /**
     * Create an instance of {@link CustomerProfileShareHolderInfoModReqType }
     * 
     */
    public CustomerProfileShareHolderInfoModReqType createCustomerProfileShareHolderInfoModReqType() {
        return new CustomerProfileShareHolderInfoModReqType();
    }

    /**
     * Create an instance of {@link CustomerProfileShareHolderInfoModRespType }
     * 
     */
    public CustomerProfileShareHolderInfoModRespType createCustomerProfileShareHolderInfoModRespType() {
        return new CustomerProfileShareHolderInfoModRespType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerProfileShareHolderInfoModReqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoMod/2011/01/15", name = "CustomerProfileShareHolderInfoModReq")
    public JAXBElement<CustomerProfileShareHolderInfoModReqType> createCustomerProfileShareHolderInfoModReq(CustomerProfileShareHolderInfoModReqType value) {
        return new JAXBElement<CustomerProfileShareHolderInfoModReqType>(_CustomerProfileShareHolderInfoModReq_QNAME, CustomerProfileShareHolderInfoModReqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerProfileShareHolderInfoModRespType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoMod/2011/01/15", name = "CustomerProfileShareHolderInfoModResp")
    public JAXBElement<CustomerProfileShareHolderInfoModRespType> createCustomerProfileShareHolderInfoModResp(CustomerProfileShareHolderInfoModRespType value) {
        return new JAXBElement<CustomerProfileShareHolderInfoModRespType>(_CustomerProfileShareHolderInfoModResp_QNAME, CustomerProfileShareHolderInfoModRespType.class, null, value);
    }

}
