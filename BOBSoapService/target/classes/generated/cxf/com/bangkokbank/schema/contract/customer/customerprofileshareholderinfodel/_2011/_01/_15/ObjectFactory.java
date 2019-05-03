
package com.bangkokbank.schema.contract.customer.customerprofileshareholderinfodel._2011._01._15;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bangkokbank.schema.contract.customer.customerprofileshareholderinfodel._2011._01._15 package. 
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

    private final static QName _CustomerProfileShareHolderInfoDelReq_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoDel/2011/01/15", "CustomerProfileShareHolderInfoDelReq");
    private final static QName _CustomerProfileShareHolderInfoDelResp_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoDel/2011/01/15", "CustomerProfileShareHolderInfoDelResp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bangkokbank.schema.contract.customer.customerprofileshareholderinfodel._2011._01._15
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CustomerProfileShareHolderInfoDelReqType }
     * 
     */
    public CustomerProfileShareHolderInfoDelReqType createCustomerProfileShareHolderInfoDelReqType() {
        return new CustomerProfileShareHolderInfoDelReqType();
    }

    /**
     * Create an instance of {@link CustomerProfileShareHolderInfoDelResultType }
     * 
     */
    public CustomerProfileShareHolderInfoDelResultType createCustomerProfileShareHolderInfoDelResultType() {
        return new CustomerProfileShareHolderInfoDelResultType();
    }

    /**
     * Create an instance of {@link CustomerProfileShareHolderInfoDelRespType }
     * 
     */
    public CustomerProfileShareHolderInfoDelRespType createCustomerProfileShareHolderInfoDelRespType() {
        return new CustomerProfileShareHolderInfoDelRespType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerProfileShareHolderInfoDelReqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoDel/2011/01/15", name = "CustomerProfileShareHolderInfoDelReq")
    public JAXBElement<CustomerProfileShareHolderInfoDelReqType> createCustomerProfileShareHolderInfoDelReq(CustomerProfileShareHolderInfoDelReqType value) {
        return new JAXBElement<CustomerProfileShareHolderInfoDelReqType>(_CustomerProfileShareHolderInfoDelReq_QNAME, CustomerProfileShareHolderInfoDelReqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerProfileShareHolderInfoDelRespType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoDel/2011/01/15", name = "CustomerProfileShareHolderInfoDelResp")
    public JAXBElement<CustomerProfileShareHolderInfoDelRespType> createCustomerProfileShareHolderInfoDelResp(CustomerProfileShareHolderInfoDelRespType value) {
        return new JAXBElement<CustomerProfileShareHolderInfoDelRespType>(_CustomerProfileShareHolderInfoDelResp_QNAME, CustomerProfileShareHolderInfoDelRespType.class, null, value);
    }

}
