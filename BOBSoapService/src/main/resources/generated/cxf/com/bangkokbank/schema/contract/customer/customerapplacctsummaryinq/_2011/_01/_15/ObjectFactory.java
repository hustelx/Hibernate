
package com.bangkokbank.schema.contract.customer.customerapplacctsummaryinq._2011._01._15;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bangkokbank.schema.contract.customer.customerapplacctsummaryinq._2011._01._15 package. 
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

    private final static QName _CustomerApplAcctSummaryInqReq_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerApplAcctSummaryInq/2011/01/15", "CustomerApplAcctSummaryInqReq");
    private final static QName _CustomerApplAcctSummaryInqResp_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/CustomerApplAcctSummaryInq/2011/01/15", "CustomerApplAcctSummaryInqResp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bangkokbank.schema.contract.customer.customerapplacctsummaryinq._2011._01._15
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CustomerApplAcctSummaryInqRespType }
     * 
     */
    public CustomerApplAcctSummaryInqRespType createCustomerApplAcctSummaryInqRespType() {
        return new CustomerApplAcctSummaryInqRespType();
    }

    /**
     * Create an instance of {@link ApplIDTotalNumType }
     * 
     */
    public ApplIDTotalNumType createApplIDTotalNumType() {
        return new ApplIDTotalNumType();
    }

    /**
     * Create an instance of {@link ApplIDsType }
     * 
     */
    public ApplIDsType createApplIDsType() {
        return new ApplIDsType();
    }

    /**
     * Create an instance of {@link ApplIDTotalNumsType }
     * 
     */
    public ApplIDTotalNumsType createApplIDTotalNumsType() {
        return new ApplIDTotalNumsType();
    }

    /**
     * Create an instance of {@link CustomerApplAcctSummaryInqResultType }
     * 
     */
    public CustomerApplAcctSummaryInqResultType createCustomerApplAcctSummaryInqResultType() {
        return new CustomerApplAcctSummaryInqResultType();
    }

    /**
     * Create an instance of {@link CustomerApplAcctSummaryInqReqType }
     * 
     */
    public CustomerApplAcctSummaryInqReqType createCustomerApplAcctSummaryInqReqType() {
        return new CustomerApplAcctSummaryInqReqType();
    }

    /**
     * Create an instance of {@link CheckingDateOptionType }
     * 
     */
    public CheckingDateOptionType createCheckingDateOptionType() {
        return new CheckingDateOptionType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerApplAcctSummaryInqReqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerApplAcctSummaryInq/2011/01/15", name = "CustomerApplAcctSummaryInqReq")
    public JAXBElement<CustomerApplAcctSummaryInqReqType> createCustomerApplAcctSummaryInqReq(CustomerApplAcctSummaryInqReqType value) {
        return new JAXBElement<CustomerApplAcctSummaryInqReqType>(_CustomerApplAcctSummaryInqReq_QNAME, CustomerApplAcctSummaryInqReqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerApplAcctSummaryInqRespType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerApplAcctSummaryInq/2011/01/15", name = "CustomerApplAcctSummaryInqResp")
    public JAXBElement<CustomerApplAcctSummaryInqRespType> createCustomerApplAcctSummaryInqResp(CustomerApplAcctSummaryInqRespType value) {
        return new JAXBElement<CustomerApplAcctSummaryInqRespType>(_CustomerApplAcctSummaryInqResp_QNAME, CustomerApplAcctSummaryInqRespType.class, null, value);
    }

}
