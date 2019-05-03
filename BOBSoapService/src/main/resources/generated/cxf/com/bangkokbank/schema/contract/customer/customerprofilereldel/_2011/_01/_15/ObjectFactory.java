
package com.bangkokbank.schema.contract.customer.customerprofilereldel._2011._01._15;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bangkokbank.schema.contract.customer.customerprofilereldel._2011._01._15 package. 
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

    private final static QName _CustomerProfileRelDelReq_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileRelDel/2011/01/15", "CustomerProfileRelDelReq");
    private final static QName _CustomerProfileRelDelResp_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileRelDel/2011/01/15", "CustomerProfileRelDelResp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bangkokbank.schema.contract.customer.customerprofilereldel._2011._01._15
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CustomerProfileRelDelResultType }
     * 
     */
    public CustomerProfileRelDelResultType createCustomerProfileRelDelResultType() {
        return new CustomerProfileRelDelResultType();
    }

    /**
     * Create an instance of {@link CustomerProfileRelDelReqType }
     * 
     */
    public CustomerProfileRelDelReqType createCustomerProfileRelDelReqType() {
        return new CustomerProfileRelDelReqType();
    }

    /**
     * Create an instance of {@link CustomerProfileRelDelRespType }
     * 
     */
    public CustomerProfileRelDelRespType createCustomerProfileRelDelRespType() {
        return new CustomerProfileRelDelRespType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerProfileRelDelReqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileRelDel/2011/01/15", name = "CustomerProfileRelDelReq")
    public JAXBElement<CustomerProfileRelDelReqType> createCustomerProfileRelDelReq(CustomerProfileRelDelReqType value) {
        return new JAXBElement<CustomerProfileRelDelReqType>(_CustomerProfileRelDelReq_QNAME, CustomerProfileRelDelReqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerProfileRelDelRespType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileRelDel/2011/01/15", name = "CustomerProfileRelDelResp")
    public JAXBElement<CustomerProfileRelDelRespType> createCustomerProfileRelDelResp(CustomerProfileRelDelRespType value) {
        return new JAXBElement<CustomerProfileRelDelRespType>(_CustomerProfileRelDelResp_QNAME, CustomerProfileRelDelRespType.class, null, value);
    }

}
