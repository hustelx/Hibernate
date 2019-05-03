
package com.bangkokbank.schema.contract.customer.customerprofilemod._2011._01._15;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bangkokbank.schema.contract.customer.customerprofilemod._2011._01._15 package. 
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

    private final static QName _CustomerProfileModReq_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileMod/2011/01/15", "CustomerProfileModReq");
    private final static QName _CustomerProfileModResp_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileMod/2011/01/15", "CustomerProfileModResp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bangkokbank.schema.contract.customer.customerprofilemod._2011._01._15
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ForeignTaxIDType }
     * 
     */
    public ForeignTaxIDType createForeignTaxIDType() {
        return new ForeignTaxIDType();
    }

    /**
     * Create an instance of {@link CustomerProfileModRespType }
     * 
     */
    public CustomerProfileModRespType createCustomerProfileModRespType() {
        return new CustomerProfileModRespType();
    }

    /**
     * Create an instance of {@link CustomerProfilePreviousModType }
     * 
     */
    public CustomerProfilePreviousModType createCustomerProfilePreviousModType() {
        return new CustomerProfilePreviousModType();
    }

    /**
     * Create an instance of {@link CustomerProfileModReqType }
     * 
     */
    public CustomerProfileModReqType createCustomerProfileModReqType() {
        return new CustomerProfileModReqType();
    }

    /**
     * Create an instance of {@link CustomerProfileModResultType }
     * 
     */
    public CustomerProfileModResultType createCustomerProfileModResultType() {
        return new CustomerProfileModResultType();
    }

    /**
     * Create an instance of {@link TaxIDType }
     * 
     */
    public TaxIDType createTaxIDType() {
        return new TaxIDType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerProfileModReqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileMod/2011/01/15", name = "CustomerProfileModReq")
    public JAXBElement<CustomerProfileModReqType> createCustomerProfileModReq(CustomerProfileModReqType value) {
        return new JAXBElement<CustomerProfileModReqType>(_CustomerProfileModReq_QNAME, CustomerProfileModReqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerProfileModRespType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileMod/2011/01/15", name = "CustomerProfileModResp")
    public JAXBElement<CustomerProfileModRespType> createCustomerProfileModResp(CustomerProfileModRespType value) {
        return new JAXBElement<CustomerProfileModRespType>(_CustomerProfileModResp_QNAME, CustomerProfileModRespType.class, null, value);
    }

}
