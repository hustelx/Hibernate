
package com.bangkokbank.schema.contract.customer.customerprofileshareholderinfoadd._2011._01._15;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bangkokbank.schema.contract.customer.customerprofileshareholderinfoadd._2011._01._15 package. 
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

    private final static QName _CustomerProfileShareHolderInfoAddReq_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoAdd/2011/01/15", "CustomerProfileShareHolderInfoAddReq");
    private final static QName _CustomerProfileShareHolderInfoAddResp_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoAdd/2011/01/15", "CustomerProfileShareHolderInfoAddResp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bangkokbank.schema.contract.customer.customerprofileshareholderinfoadd._2011._01._15
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CustomerProfileShareHolderInfoAddRespType }
     * 
     */
    public CustomerProfileShareHolderInfoAddRespType createCustomerProfileShareHolderInfoAddRespType() {
        return new CustomerProfileShareHolderInfoAddRespType();
    }

    /**
     * Create an instance of {@link CustomerProfileShareHolderInfoAddResultType }
     * 
     */
    public CustomerProfileShareHolderInfoAddResultType createCustomerProfileShareHolderInfoAddResultType() {
        return new CustomerProfileShareHolderInfoAddResultType();
    }

    /**
     * Create an instance of {@link CustomerProfileShareHolderInfoAddReqType }
     * 
     */
    public CustomerProfileShareHolderInfoAddReqType createCustomerProfileShareHolderInfoAddReqType() {
        return new CustomerProfileShareHolderInfoAddReqType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerProfileShareHolderInfoAddReqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoAdd/2011/01/15", name = "CustomerProfileShareHolderInfoAddReq")
    public JAXBElement<CustomerProfileShareHolderInfoAddReqType> createCustomerProfileShareHolderInfoAddReq(CustomerProfileShareHolderInfoAddReqType value) {
        return new JAXBElement<CustomerProfileShareHolderInfoAddReqType>(_CustomerProfileShareHolderInfoAddReq_QNAME, CustomerProfileShareHolderInfoAddReqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerProfileShareHolderInfoAddRespType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoAdd/2011/01/15", name = "CustomerProfileShareHolderInfoAddResp")
    public JAXBElement<CustomerProfileShareHolderInfoAddRespType> createCustomerProfileShareHolderInfoAddResp(CustomerProfileShareHolderInfoAddRespType value) {
        return new JAXBElement<CustomerProfileShareHolderInfoAddRespType>(_CustomerProfileShareHolderInfoAddResp_QNAME, CustomerProfileShareHolderInfoAddRespType.class, null, value);
    }

}
