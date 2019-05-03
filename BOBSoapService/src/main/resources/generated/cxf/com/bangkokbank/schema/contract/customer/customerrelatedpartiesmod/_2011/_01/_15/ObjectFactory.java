
package com.bangkokbank.schema.contract.customer.customerrelatedpartiesmod._2011._01._15;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bangkokbank.schema.contract.customer.customerrelatedpartiesmod._2011._01._15 package. 
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

    private final static QName _CustomerRelatedPartiesModReq_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerRelatedPartiesMod/2011/01/15", "CustomerRelatedPartiesModReq");
    private final static QName _CustomerRelatedPartiesModResp_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerRelatedPartiesMod/2011/01/15", "CustomerRelatedPartiesModResp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bangkokbank.schema.contract.customer.customerrelatedpartiesmod._2011._01._15
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CustomerRelatedPartiesModRespType }
     * 
     */
    public CustomerRelatedPartiesModRespType createCustomerRelatedPartiesModRespType() {
        return new CustomerRelatedPartiesModRespType();
    }

    /**
     * Create an instance of {@link CustomerRelatedPartiesModResultType }
     * 
     */
    public CustomerRelatedPartiesModResultType createCustomerRelatedPartiesModResultType() {
        return new CustomerRelatedPartiesModResultType();
    }

    /**
     * Create an instance of {@link CustomerRelatedPartiesModReqType }
     * 
     */
    public CustomerRelatedPartiesModReqType createCustomerRelatedPartiesModReqType() {
        return new CustomerRelatedPartiesModReqType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerRelatedPartiesModReqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerRelatedPartiesMod/2011/01/15", name = "CustomerRelatedPartiesModReq")
    public JAXBElement<CustomerRelatedPartiesModReqType> createCustomerRelatedPartiesModReq(CustomerRelatedPartiesModReqType value) {
        return new JAXBElement<CustomerRelatedPartiesModReqType>(_CustomerRelatedPartiesModReq_QNAME, CustomerRelatedPartiesModReqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerRelatedPartiesModRespType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerRelatedPartiesMod/2011/01/15", name = "CustomerRelatedPartiesModResp")
    public JAXBElement<CustomerRelatedPartiesModRespType> createCustomerRelatedPartiesModResp(CustomerRelatedPartiesModRespType value) {
        return new JAXBElement<CustomerRelatedPartiesModRespType>(_CustomerRelatedPartiesModResp_QNAME, CustomerRelatedPartiesModRespType.class, null, value);
    }

}
