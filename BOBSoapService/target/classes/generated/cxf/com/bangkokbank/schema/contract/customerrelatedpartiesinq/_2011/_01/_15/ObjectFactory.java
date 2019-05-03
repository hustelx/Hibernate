
package com.bangkokbank.schema.contract.customerrelatedpartiesinq._2011._01._15;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bangkokbank.schema.contract.customerrelatedpartiesinq._2011._01._15 package. 
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

    private final static QName _CustomerRelatedPartiesInqResp_QNAME = new QName("http://www.bangkokbank.com/schema/contract/CustomerRelatedPartiesInq/2011/01/15", "CustomerRelatedPartiesInqResp");
    private final static QName _CustomerRelatedPartiesInqReq_QNAME = new QName("http://www.bangkokbank.com/schema/contract/CustomerRelatedPartiesInq/2011/01/15", "CustomerRelatedPartiesInqReq");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bangkokbank.schema.contract.customerrelatedpartiesinq._2011._01._15
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CustomerRelatedPartiesInqReqType }
     * 
     */
    public CustomerRelatedPartiesInqReqType createCustomerRelatedPartiesInqReqType() {
        return new CustomerRelatedPartiesInqReqType();
    }

    /**
     * Create an instance of {@link CustomerRelatedPartiesInqRespType }
     * 
     */
    public CustomerRelatedPartiesInqRespType createCustomerRelatedPartiesInqRespType() {
        return new CustomerRelatedPartiesInqRespType();
    }

    /**
     * Create an instance of {@link CustomerRelatedPartiesInqResultType }
     * 
     */
    public CustomerRelatedPartiesInqResultType createCustomerRelatedPartiesInqResultType() {
        return new CustomerRelatedPartiesInqResultType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerRelatedPartiesInqRespType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/CustomerRelatedPartiesInq/2011/01/15", name = "CustomerRelatedPartiesInqResp")
    public JAXBElement<CustomerRelatedPartiesInqRespType> createCustomerRelatedPartiesInqResp(CustomerRelatedPartiesInqRespType value) {
        return new JAXBElement<CustomerRelatedPartiesInqRespType>(_CustomerRelatedPartiesInqResp_QNAME, CustomerRelatedPartiesInqRespType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerRelatedPartiesInqReqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/CustomerRelatedPartiesInq/2011/01/15", name = "CustomerRelatedPartiesInqReq")
    public JAXBElement<CustomerRelatedPartiesInqReqType> createCustomerRelatedPartiesInqReq(CustomerRelatedPartiesInqReqType value) {
        return new JAXBElement<CustomerRelatedPartiesInqReqType>(_CustomerRelatedPartiesInqReq_QNAME, CustomerRelatedPartiesInqReqType.class, null, value);
    }

}
