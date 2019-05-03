
package com.bangkokbank.schema.contract.customerprofileinq._2011._01._15;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bangkokbank.schema.contract.customerprofileinq._2011._01._15 package. 
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

    private final static QName _CustomerProfileInqReq_QNAME = new QName("http://www.bangkokbank.com/schema/contract/CustomerProfileInq/2011/01/15", "CustomerProfileInqReq");
    private final static QName _CustomerProfileInqResp_QNAME = new QName("http://www.bangkokbank.com/schema/contract/CustomerProfileInq/2011/01/15", "CustomerProfileInqResp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bangkokbank.schema.contract.customerprofileinq._2011._01._15
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CustomerProfileInqResultType.JointCustomers }
     * 
     */
    public CustomerProfileInqResultType.JointCustomers createCustomerProfileInqResultTypeJointCustomers() {
        return new CustomerProfileInqResultType.JointCustomers();
    }

    /**
     * Create an instance of {@link CustomerProfileInqResultType }
     * 
     */
    public CustomerProfileInqResultType createCustomerProfileInqResultType() {
        return new CustomerProfileInqResultType();
    }

    /**
     * Create an instance of {@link CustomerProfileInqRespType }
     * 
     */
    public CustomerProfileInqRespType createCustomerProfileInqRespType() {
        return new CustomerProfileInqRespType();
    }

    /**
     * Create an instance of {@link CustomerProfileInqReqType }
     * 
     */
    public CustomerProfileInqReqType createCustomerProfileInqReqType() {
        return new CustomerProfileInqReqType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerProfileInqReqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/CustomerProfileInq/2011/01/15", name = "CustomerProfileInqReq")
    public JAXBElement<CustomerProfileInqReqType> createCustomerProfileInqReq(CustomerProfileInqReqType value) {
        return new JAXBElement<CustomerProfileInqReqType>(_CustomerProfileInqReq_QNAME, CustomerProfileInqReqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerProfileInqRespType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/CustomerProfileInq/2011/01/15", name = "CustomerProfileInqResp")
    public JAXBElement<CustomerProfileInqRespType> createCustomerProfileInqResp(CustomerProfileInqRespType value) {
        return new JAXBElement<CustomerProfileInqRespType>(_CustomerProfileInqResp_QNAME, CustomerProfileInqRespType.class, null, value);
    }

}
