
package com.bangkokbank.schema.contract.customer.customeridcarddetailinq._2011._01._15;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bangkokbank.schema.contract.customer.customeridcarddetailinq._2011._01._15 package. 
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

    private final static QName _CustomerIDCardDetailInqResp_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerIDCardDetailInq/2011/01/15", "CustomerIDCardDetailInqResp");
    private final static QName _CustomerIDCardDetailInqReq_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerIDCardDetailInq/2011/01/15", "CustomerIDCardDetailInqReq");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bangkokbank.schema.contract.customer.customeridcarddetailinq._2011._01._15
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CustomerIDCardDetailInqRespType }
     * 
     */
    public CustomerIDCardDetailInqRespType createCustomerIDCardDetailInqRespType() {
        return new CustomerIDCardDetailInqRespType();
    }

    /**
     * Create an instance of {@link CustomerIDCardDetailInqResultType }
     * 
     */
    public CustomerIDCardDetailInqResultType createCustomerIDCardDetailInqResultType() {
        return new CustomerIDCardDetailInqResultType();
    }

    /**
     * Create an instance of {@link CustomerIDCardDetailInqReqType }
     * 
     */
    public CustomerIDCardDetailInqReqType createCustomerIDCardDetailInqReqType() {
        return new CustomerIDCardDetailInqReqType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerIDCardDetailInqRespType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerIDCardDetailInq/2011/01/15", name = "CustomerIDCardDetailInqResp")
    public JAXBElement<CustomerIDCardDetailInqRespType> createCustomerIDCardDetailInqResp(CustomerIDCardDetailInqRespType value) {
        return new JAXBElement<CustomerIDCardDetailInqRespType>(_CustomerIDCardDetailInqResp_QNAME, CustomerIDCardDetailInqRespType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerIDCardDetailInqReqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerIDCardDetailInq/2011/01/15", name = "CustomerIDCardDetailInqReq")
    public JAXBElement<CustomerIDCardDetailInqReqType> createCustomerIDCardDetailInqReq(CustomerIDCardDetailInqReqType value) {
        return new JAXBElement<CustomerIDCardDetailInqReqType>(_CustomerIDCardDetailInqReq_QNAME, CustomerIDCardDetailInqReqType.class, null, value);
    }

}
