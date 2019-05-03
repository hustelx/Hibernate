
package com.bangkokbank.schema.contract.customer.customerrelatedpartieskycmod._2011._01._15;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bangkokbank.schema.contract.customer.customerrelatedpartieskycmod._2011._01._15 package. 
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

    private final static QName _CustomerRelatedPartiesKYCModResp_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerRelatedPartiesKYCMod/2011/01/15", "CustomerRelatedPartiesKYCModResp");
    private final static QName _CustomerRelatedPartiesKYCModReq_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerRelatedPartiesKYCMod/2011/01/15", "CustomerRelatedPartiesKYCModReq");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bangkokbank.schema.contract.customer.customerrelatedpartieskycmod._2011._01._15
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CustomerRelatedPartiesKYCModReqType }
     * 
     */
    public CustomerRelatedPartiesKYCModReqType createCustomerRelatedPartiesKYCModReqType() {
        return new CustomerRelatedPartiesKYCModReqType();
    }

    /**
     * Create an instance of {@link CustomerRelatedPartiesKYCModResultType }
     * 
     */
    public CustomerRelatedPartiesKYCModResultType createCustomerRelatedPartiesKYCModResultType() {
        return new CustomerRelatedPartiesKYCModResultType();
    }

    /**
     * Create an instance of {@link CustomerRelatedPartiesKYCModRespType }
     * 
     */
    public CustomerRelatedPartiesKYCModRespType createCustomerRelatedPartiesKYCModRespType() {
        return new CustomerRelatedPartiesKYCModRespType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerRelatedPartiesKYCModRespType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerRelatedPartiesKYCMod/2011/01/15", name = "CustomerRelatedPartiesKYCModResp")
    public JAXBElement<CustomerRelatedPartiesKYCModRespType> createCustomerRelatedPartiesKYCModResp(CustomerRelatedPartiesKYCModRespType value) {
        return new JAXBElement<CustomerRelatedPartiesKYCModRespType>(_CustomerRelatedPartiesKYCModResp_QNAME, CustomerRelatedPartiesKYCModRespType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerRelatedPartiesKYCModReqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerRelatedPartiesKYCMod/2011/01/15", name = "CustomerRelatedPartiesKYCModReq")
    public JAXBElement<CustomerRelatedPartiesKYCModReqType> createCustomerRelatedPartiesKYCModReq(CustomerRelatedPartiesKYCModReqType value) {
        return new JAXBElement<CustomerRelatedPartiesKYCModReqType>(_CustomerRelatedPartiesKYCModReq_QNAME, CustomerRelatedPartiesKYCModReqType.class, null, value);
    }

}
