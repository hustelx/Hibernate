
package com.bangkokbank.schema.contract.customer.customerprofilekycmod._2011._01._15;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bangkokbank.schema.contract.customer.customerprofilekycmod._2011._01._15 package. 
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

    private final static QName _CustomerProfileKYCModResp_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileKYCMod/2011/01/15", "CustomerProfileKYCModResp");
    private final static QName _CustomerProfileKYCModReq_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileKYCMod/2011/01/15", "CustomerProfileKYCModReq");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bangkokbank.schema.contract.customer.customerprofilekycmod._2011._01._15
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CustomerProfileKYCModRespType }
     * 
     */
    public CustomerProfileKYCModRespType createCustomerProfileKYCModRespType() {
        return new CustomerProfileKYCModRespType();
    }

    /**
     * Create an instance of {@link CustomerProfileKYCModReqType }
     * 
     */
    public CustomerProfileKYCModReqType createCustomerProfileKYCModReqType() {
        return new CustomerProfileKYCModReqType();
    }

    /**
     * Create an instance of {@link CustomerProfileKYCModResultType }
     * 
     */
    public CustomerProfileKYCModResultType createCustomerProfileKYCModResultType() {
        return new CustomerProfileKYCModResultType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerProfileKYCModRespType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileKYCMod/2011/01/15", name = "CustomerProfileKYCModResp")
    public JAXBElement<CustomerProfileKYCModRespType> createCustomerProfileKYCModResp(CustomerProfileKYCModRespType value) {
        return new JAXBElement<CustomerProfileKYCModRespType>(_CustomerProfileKYCModResp_QNAME, CustomerProfileKYCModRespType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerProfileKYCModReqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileKYCMod/2011/01/15", name = "CustomerProfileKYCModReq")
    public JAXBElement<CustomerProfileKYCModReqType> createCustomerProfileKYCModReq(CustomerProfileKYCModReqType value) {
        return new JAXBElement<CustomerProfileKYCModReqType>(_CustomerProfileKYCModReq_QNAME, CustomerProfileKYCModReqType.class, null, value);
    }

}
