
package com.bangkokbank.schema.contract.customer.customerprofileemploymentinfodel._2011._01._15;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bangkokbank.schema.contract.customer.customerprofileemploymentinfodel._2011._01._15 package. 
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

    private final static QName _CustomerProfileEmploymentInfoDelResp_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEmploymentInfoDel/2011/01/15", "CustomerProfileEmploymentInfoDelResp");
    private final static QName _CustomerProfileEmploymentInfoDelReq_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEmploymentInfoDel/2011/01/15", "CustomerProfileEmploymentInfoDelReq");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bangkokbank.schema.contract.customer.customerprofileemploymentinfodel._2011._01._15
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CustomerProfileEmploymentInfoDelResultType }
     * 
     */
    public CustomerProfileEmploymentInfoDelResultType createCustomerProfileEmploymentInfoDelResultType() {
        return new CustomerProfileEmploymentInfoDelResultType();
    }

    /**
     * Create an instance of {@link CustomerEmploymentInfoDelType }
     * 
     */
    public CustomerEmploymentInfoDelType createCustomerEmploymentInfoDelType() {
        return new CustomerEmploymentInfoDelType();
    }

    /**
     * Create an instance of {@link EmploymentInfosDelType }
     * 
     */
    public EmploymentInfosDelType createEmploymentInfosDelType() {
        return new EmploymentInfosDelType();
    }

    /**
     * Create an instance of {@link CustomerProfileEmploymentInfoDelRespType }
     * 
     */
    public CustomerProfileEmploymentInfoDelRespType createCustomerProfileEmploymentInfoDelRespType() {
        return new CustomerProfileEmploymentInfoDelRespType();
    }

    /**
     * Create an instance of {@link CustomerProfileEmploymentInfoDelReqType }
     * 
     */
    public CustomerProfileEmploymentInfoDelReqType createCustomerProfileEmploymentInfoDelReqType() {
        return new CustomerProfileEmploymentInfoDelReqType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerProfileEmploymentInfoDelRespType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEmploymentInfoDel/2011/01/15", name = "CustomerProfileEmploymentInfoDelResp")
    public JAXBElement<CustomerProfileEmploymentInfoDelRespType> createCustomerProfileEmploymentInfoDelResp(CustomerProfileEmploymentInfoDelRespType value) {
        return new JAXBElement<CustomerProfileEmploymentInfoDelRespType>(_CustomerProfileEmploymentInfoDelResp_QNAME, CustomerProfileEmploymentInfoDelRespType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerProfileEmploymentInfoDelReqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEmploymentInfoDel/2011/01/15", name = "CustomerProfileEmploymentInfoDelReq")
    public JAXBElement<CustomerProfileEmploymentInfoDelReqType> createCustomerProfileEmploymentInfoDelReq(CustomerProfileEmploymentInfoDelReqType value) {
        return new JAXBElement<CustomerProfileEmploymentInfoDelReqType>(_CustomerProfileEmploymentInfoDelReq_QNAME, CustomerProfileEmploymentInfoDelReqType.class, null, value);
    }

}
