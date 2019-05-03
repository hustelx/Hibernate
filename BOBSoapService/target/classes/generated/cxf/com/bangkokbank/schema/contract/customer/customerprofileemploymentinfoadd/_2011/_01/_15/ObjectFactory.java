
package com.bangkokbank.schema.contract.customer.customerprofileemploymentinfoadd._2011._01._15;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bangkokbank.schema.contract.customer.customerprofileemploymentinfoadd._2011._01._15 package. 
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

    private final static QName _CustomerProfileEmploymentInfoAddReq_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEmploymentInfoAdd/2011/01/15", "CustomerProfileEmploymentInfoAddReq");
    private final static QName _CustomerProfileEmploymentInfoAddResp_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEmploymentInfoAdd/2011/01/15", "CustomerProfileEmploymentInfoAddResp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bangkokbank.schema.contract.customer.customerprofileemploymentinfoadd._2011._01._15
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EmploymentInfosAddType }
     * 
     */
    public EmploymentInfosAddType createEmploymentInfosAddType() {
        return new EmploymentInfosAddType();
    }

    /**
     * Create an instance of {@link CustomerProfileEmploymentInfoAddResultType }
     * 
     */
    public CustomerProfileEmploymentInfoAddResultType createCustomerProfileEmploymentInfoAddResultType() {
        return new CustomerProfileEmploymentInfoAddResultType();
    }

    /**
     * Create an instance of {@link CustomerProfileEmploymentInfoAddReqType }
     * 
     */
    public CustomerProfileEmploymentInfoAddReqType createCustomerProfileEmploymentInfoAddReqType() {
        return new CustomerProfileEmploymentInfoAddReqType();
    }

    /**
     * Create an instance of {@link CustomerProfileEmploymentInfoAddRespType }
     * 
     */
    public CustomerProfileEmploymentInfoAddRespType createCustomerProfileEmploymentInfoAddRespType() {
        return new CustomerProfileEmploymentInfoAddRespType();
    }

    /**
     * Create an instance of {@link CustomerEmploymentInfoAddType }
     * 
     */
    public CustomerEmploymentInfoAddType createCustomerEmploymentInfoAddType() {
        return new CustomerEmploymentInfoAddType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerProfileEmploymentInfoAddReqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEmploymentInfoAdd/2011/01/15", name = "CustomerProfileEmploymentInfoAddReq")
    public JAXBElement<CustomerProfileEmploymentInfoAddReqType> createCustomerProfileEmploymentInfoAddReq(CustomerProfileEmploymentInfoAddReqType value) {
        return new JAXBElement<CustomerProfileEmploymentInfoAddReqType>(_CustomerProfileEmploymentInfoAddReq_QNAME, CustomerProfileEmploymentInfoAddReqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerProfileEmploymentInfoAddRespType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEmploymentInfoAdd/2011/01/15", name = "CustomerProfileEmploymentInfoAddResp")
    public JAXBElement<CustomerProfileEmploymentInfoAddRespType> createCustomerProfileEmploymentInfoAddResp(CustomerProfileEmploymentInfoAddRespType value) {
        return new JAXBElement<CustomerProfileEmploymentInfoAddRespType>(_CustomerProfileEmploymentInfoAddResp_QNAME, CustomerProfileEmploymentInfoAddRespType.class, null, value);
    }

}
