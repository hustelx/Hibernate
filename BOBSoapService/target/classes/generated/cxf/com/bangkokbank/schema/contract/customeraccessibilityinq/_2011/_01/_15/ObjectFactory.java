
package com.bangkokbank.schema.contract.customeraccessibilityinq._2011._01._15;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bangkokbank.schema.contract.customeraccessibilityinq._2011._01._15 package. 
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

    private final static QName _CustomerAccessibilityInqReq_QNAME = new QName("http://www.bangkokbank.com/schema/contract/CustomerAccessibilityInq/2011/01/15", "CustomerAccessibilityInqReq");
    private final static QName _CustomerAccessibilityInqResp_QNAME = new QName("http://www.bangkokbank.com/schema/contract/CustomerAccessibilityInq/2011/01/15", "CustomerAccessibilityInqResp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bangkokbank.schema.contract.customeraccessibilityinq._2011._01._15
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CustomerAccessibilityType }
     * 
     */
    public CustomerAccessibilityType createCustomerAccessibilityType() {
        return new CustomerAccessibilityType();
    }

    /**
     * Create an instance of {@link CustomerAccessibilityInqRespType.CustomerAccessibilityInqResult }
     * 
     */
    public CustomerAccessibilityInqRespType.CustomerAccessibilityInqResult createCustomerAccessibilityInqRespTypeCustomerAccessibilityInqResult() {
        return new CustomerAccessibilityInqRespType.CustomerAccessibilityInqResult();
    }

    /**
     * Create an instance of {@link CustomerAccessibilityInqRespType }
     * 
     */
    public CustomerAccessibilityInqRespType createCustomerAccessibilityInqRespType() {
        return new CustomerAccessibilityInqRespType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerAccessibilityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/CustomerAccessibilityInq/2011/01/15", name = "CustomerAccessibilityInqReq")
    public JAXBElement<CustomerAccessibilityType> createCustomerAccessibilityInqReq(CustomerAccessibilityType value) {
        return new JAXBElement<CustomerAccessibilityType>(_CustomerAccessibilityInqReq_QNAME, CustomerAccessibilityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerAccessibilityInqRespType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/CustomerAccessibilityInq/2011/01/15", name = "CustomerAccessibilityInqResp")
    public JAXBElement<CustomerAccessibilityInqRespType> createCustomerAccessibilityInqResp(CustomerAccessibilityInqRespType value) {
        return new JAXBElement<CustomerAccessibilityInqRespType>(_CustomerAccessibilityInqResp_QNAME, CustomerAccessibilityInqRespType.class, null, value);
    }

}
