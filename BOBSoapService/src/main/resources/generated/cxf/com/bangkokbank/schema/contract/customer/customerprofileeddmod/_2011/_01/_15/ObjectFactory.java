
package com.bangkokbank.schema.contract.customer.customerprofileeddmod._2011._01._15;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bangkokbank.schema.contract.customer.customerprofileeddmod._2011._01._15 package. 
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

    private final static QName _CustomerProfileEDDModReq_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEDDMod/2011/01/15", "CustomerProfileEDDModReq");
    private final static QName _CustomerProfileEDDModResp_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEDDMod/2011/01/15", "CustomerProfileEDDModResp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bangkokbank.schema.contract.customer.customerprofileeddmod._2011._01._15
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CustomerProfileEDDModResultType }
     * 
     */
    public CustomerProfileEDDModResultType createCustomerProfileEDDModResultType() {
        return new CustomerProfileEDDModResultType();
    }

    /**
     * Create an instance of {@link CustomerProfileEDDModReqType }
     * 
     */
    public CustomerProfileEDDModReqType createCustomerProfileEDDModReqType() {
        return new CustomerProfileEDDModReqType();
    }

    /**
     * Create an instance of {@link CustomerProfileEDDModRespType }
     * 
     */
    public CustomerProfileEDDModRespType createCustomerProfileEDDModRespType() {
        return new CustomerProfileEDDModRespType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerProfileEDDModReqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEDDMod/2011/01/15", name = "CustomerProfileEDDModReq")
    public JAXBElement<CustomerProfileEDDModReqType> createCustomerProfileEDDModReq(CustomerProfileEDDModReqType value) {
        return new JAXBElement<CustomerProfileEDDModReqType>(_CustomerProfileEDDModReq_QNAME, CustomerProfileEDDModReqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerProfileEDDModRespType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEDDMod/2011/01/15", name = "CustomerProfileEDDModResp")
    public JAXBElement<CustomerProfileEDDModRespType> createCustomerProfileEDDModResp(CustomerProfileEDDModRespType value) {
        return new JAXBElement<CustomerProfileEDDModRespType>(_CustomerProfileEDDModResp_QNAME, CustomerProfileEDDModRespType.class, null, value);
    }

}
