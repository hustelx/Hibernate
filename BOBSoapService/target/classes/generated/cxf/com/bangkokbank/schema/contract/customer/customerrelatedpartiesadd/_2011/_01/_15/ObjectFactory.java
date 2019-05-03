
package com.bangkokbank.schema.contract.customer.customerrelatedpartiesadd._2011._01._15;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bangkokbank.schema.contract.customer.customerrelatedpartiesadd._2011._01._15 package. 
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

    private final static QName _CustomerRelatedPartiesAddReq_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerRelatedPartiesAdd/2011/01/15", "CustomerRelatedPartiesAddReq");
    private final static QName _CustomerRelatedPartiesAddResp_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerRelatedPartiesAdd/2011/01/15", "CustomerRelatedPartiesAddResp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bangkokbank.schema.contract.customer.customerrelatedpartiesadd._2011._01._15
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddOwnerFlagsType }
     * 
     */
    public AddOwnerFlagsType createAddOwnerFlagsType() {
        return new AddOwnerFlagsType();
    }

    /**
     * Create an instance of {@link CustomerRelatedPartiesAddRespType }
     * 
     */
    public CustomerRelatedPartiesAddRespType createCustomerRelatedPartiesAddRespType() {
        return new CustomerRelatedPartiesAddRespType();
    }

    /**
     * Create an instance of {@link CustomerRelatedPartiesAddReqType }
     * 
     */
    public CustomerRelatedPartiesAddReqType createCustomerRelatedPartiesAddReqType() {
        return new CustomerRelatedPartiesAddReqType();
    }

    /**
     * Create an instance of {@link CustomerRelatedPartiesAddResultType }
     * 
     */
    public CustomerRelatedPartiesAddResultType createCustomerRelatedPartiesAddResultType() {
        return new CustomerRelatedPartiesAddResultType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerRelatedPartiesAddReqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerRelatedPartiesAdd/2011/01/15", name = "CustomerRelatedPartiesAddReq")
    public JAXBElement<CustomerRelatedPartiesAddReqType> createCustomerRelatedPartiesAddReq(CustomerRelatedPartiesAddReqType value) {
        return new JAXBElement<CustomerRelatedPartiesAddReqType>(_CustomerRelatedPartiesAddReq_QNAME, CustomerRelatedPartiesAddReqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerRelatedPartiesAddRespType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerRelatedPartiesAdd/2011/01/15", name = "CustomerRelatedPartiesAddResp")
    public JAXBElement<CustomerRelatedPartiesAddRespType> createCustomerRelatedPartiesAddResp(CustomerRelatedPartiesAddRespType value) {
        return new JAXBElement<CustomerRelatedPartiesAddRespType>(_CustomerRelatedPartiesAddResp_QNAME, CustomerRelatedPartiesAddRespType.class, null, value);
    }

}
