
package com.bangkokbank.schema.contract.customer.customerprofileshareholderinfoinq._2011._01._15;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bangkokbank.schema.contract.customer.customerprofileshareholderinfoinq._2011._01._15 package. 
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

    private final static QName _CustomerProfileShareHolderInfoInqResp_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoInq/2011/01/15", "CustomerProfileShareHolderInfoInqResp");
    private final static QName _CustomerProfileShareHolderInfoInqReq_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoInq/2011/01/15", "CustomerProfileShareHolderInfoInqReq");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bangkokbank.schema.contract.customer.customerprofileshareholderinfoinq._2011._01._15
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CustomerProfileShareHolderInfoInqRespType }
     * 
     */
    public CustomerProfileShareHolderInfoInqRespType createCustomerProfileShareHolderInfoInqRespType() {
        return new CustomerProfileShareHolderInfoInqRespType();
    }

    /**
     * Create an instance of {@link CustomerProfileShareHolderInfoInqReqType }
     * 
     */
    public CustomerProfileShareHolderInfoInqReqType createCustomerProfileShareHolderInfoInqReqType() {
        return new CustomerProfileShareHolderInfoInqReqType();
    }

    /**
     * Create an instance of {@link CustomerProfileShareHolderInfoInqResultType }
     * 
     */
    public CustomerProfileShareHolderInfoInqResultType createCustomerProfileShareHolderInfoInqResultType() {
        return new CustomerProfileShareHolderInfoInqResultType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerProfileShareHolderInfoInqRespType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoInq/2011/01/15", name = "CustomerProfileShareHolderInfoInqResp")
    public JAXBElement<CustomerProfileShareHolderInfoInqRespType> createCustomerProfileShareHolderInfoInqResp(CustomerProfileShareHolderInfoInqRespType value) {
        return new JAXBElement<CustomerProfileShareHolderInfoInqRespType>(_CustomerProfileShareHolderInfoInqResp_QNAME, CustomerProfileShareHolderInfoInqRespType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerProfileShareHolderInfoInqReqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoInq/2011/01/15", name = "CustomerProfileShareHolderInfoInqReq")
    public JAXBElement<CustomerProfileShareHolderInfoInqReqType> createCustomerProfileShareHolderInfoInqReq(CustomerProfileShareHolderInfoInqReqType value) {
        return new JAXBElement<CustomerProfileShareHolderInfoInqReqType>(_CustomerProfileShareHolderInfoInqReq_QNAME, CustomerProfileShareHolderInfoInqReqType.class, null, value);
    }

}
