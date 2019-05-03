
package com.bangkokbank.schema.contract.customer.customerprofileemploymentinfoinq._2011._01._15;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bangkokbank.schema.contract.customer.customerprofileemploymentinfoinq._2011._01._15 package. 
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

    private final static QName _CustomerProfileEmploymentInfoInqResp_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEmploymentInfoInq/2011/01/15", "CustomerProfileEmploymentInfoInqResp");
    private final static QName _CustomerProfileEmploymentInfoInqReq_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEmploymentInfoInq/2011/01/15", "CustomerProfileEmploymentInfoInqReq");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bangkokbank.schema.contract.customer.customerprofileemploymentinfoinq._2011._01._15
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CustomerEmploymentInfoInqType }
     * 
     */
    public CustomerEmploymentInfoInqType createCustomerEmploymentInfoInqType() {
        return new CustomerEmploymentInfoInqType();
    }

    /**
     * Create an instance of {@link CustomerEmploymentInfosInqType }
     * 
     */
    public CustomerEmploymentInfosInqType createCustomerEmploymentInfosInqType() {
        return new CustomerEmploymentInfosInqType();
    }

    /**
     * Create an instance of {@link CustomerProfileEmploymentInfoInqReqType }
     * 
     */
    public CustomerProfileEmploymentInfoInqReqType createCustomerProfileEmploymentInfoInqReqType() {
        return new CustomerProfileEmploymentInfoInqReqType();
    }

    /**
     * Create an instance of {@link CustomerProfileEmploymentInfoInqRespType }
     * 
     */
    public CustomerProfileEmploymentInfoInqRespType createCustomerProfileEmploymentInfoInqRespType() {
        return new CustomerProfileEmploymentInfoInqRespType();
    }

    /**
     * Create an instance of {@link CustomerProfileEmploymentInfoInqResultType }
     * 
     */
    public CustomerProfileEmploymentInfoInqResultType createCustomerProfileEmploymentInfoInqResultType() {
        return new CustomerProfileEmploymentInfoInqResultType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerProfileEmploymentInfoInqRespType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEmploymentInfoInq/2011/01/15", name = "CustomerProfileEmploymentInfoInqResp")
    public JAXBElement<CustomerProfileEmploymentInfoInqRespType> createCustomerProfileEmploymentInfoInqResp(CustomerProfileEmploymentInfoInqRespType value) {
        return new JAXBElement<CustomerProfileEmploymentInfoInqRespType>(_CustomerProfileEmploymentInfoInqResp_QNAME, CustomerProfileEmploymentInfoInqRespType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerProfileEmploymentInfoInqReqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEmploymentInfoInq/2011/01/15", name = "CustomerProfileEmploymentInfoInqReq")
    public JAXBElement<CustomerProfileEmploymentInfoInqReqType> createCustomerProfileEmploymentInfoInqReq(CustomerProfileEmploymentInfoInqReqType value) {
        return new JAXBElement<CustomerProfileEmploymentInfoInqReqType>(_CustomerProfileEmploymentInfoInqReq_QNAME, CustomerProfileEmploymentInfoInqReqType.class, null, value);
    }

}
