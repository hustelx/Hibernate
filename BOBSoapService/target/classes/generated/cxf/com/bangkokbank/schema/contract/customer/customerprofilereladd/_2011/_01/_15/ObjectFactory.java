
package com.bangkokbank.schema.contract.customer.customerprofilereladd._2011._01._15;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bangkokbank.schema.contract.customer.customerprofilereladd._2011._01._15 package. 
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

    private final static QName _CustomerProfileRelAddResp_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileRelAdd/2011/01/15", "CustomerProfileRelAddResp");
    private final static QName _CustomerProfileRelAddReq_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileRelAdd/2011/01/15", "CustomerProfileRelAddReq");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bangkokbank.schema.contract.customer.customerprofilereladd._2011._01._15
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CustomerProfileRelAddResultType }
     * 
     */
    public CustomerProfileRelAddResultType createCustomerProfileRelAddResultType() {
        return new CustomerProfileRelAddResultType();
    }

    /**
     * Create an instance of {@link CustomerProfileRelAddReqType }
     * 
     */
    public CustomerProfileRelAddReqType createCustomerProfileRelAddReqType() {
        return new CustomerProfileRelAddReqType();
    }

    /**
     * Create an instance of {@link CustomerProfileRelAddRespType }
     * 
     */
    public CustomerProfileRelAddRespType createCustomerProfileRelAddRespType() {
        return new CustomerProfileRelAddRespType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerProfileRelAddRespType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileRelAdd/2011/01/15", name = "CustomerProfileRelAddResp")
    public JAXBElement<CustomerProfileRelAddRespType> createCustomerProfileRelAddResp(CustomerProfileRelAddRespType value) {
        return new JAXBElement<CustomerProfileRelAddRespType>(_CustomerProfileRelAddResp_QNAME, CustomerProfileRelAddRespType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerProfileRelAddReqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileRelAdd/2011/01/15", name = "CustomerProfileRelAddReq")
    public JAXBElement<CustomerProfileRelAddReqType> createCustomerProfileRelAddReq(CustomerProfileRelAddReqType value) {
        return new JAXBElement<CustomerProfileRelAddReqType>(_CustomerProfileRelAddReq_QNAME, CustomerProfileRelAddReqType.class, null, value);
    }

}
