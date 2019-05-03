
package com.bangkokbank.schema.contract.financialnewsinq._2011._01._15;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bangkokbank.schema.contract.financialnewsinq._2011._01._15 package. 
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

    private final static QName _FinancialNewsInqResp_QNAME = new QName("http://www.bangkokbank.com/schema/contract/FinancialNewsInq/2011/01/15", "FinancialNewsInqResp");
    private final static QName _FinancialNewsInqReq_QNAME = new QName("http://www.bangkokbank.com/schema/contract/FinancialNewsInq/2011/01/15", "FinancialNewsInqReq");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bangkokbank.schema.contract.financialnewsinq._2011._01._15
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FinancialNewsInqReqType }
     * 
     */
    public FinancialNewsInqReqType createFinancialNewsInqReqType() {
        return new FinancialNewsInqReqType();
    }

    /**
     * Create an instance of {@link FinancialNewsInqRespType.FinancialNewsInqResults }
     * 
     */
    public FinancialNewsInqRespType.FinancialNewsInqResults createFinancialNewsInqRespTypeFinancialNewsInqResults() {
        return new FinancialNewsInqRespType.FinancialNewsInqResults();
    }

    /**
     * Create an instance of {@link FinancialNewsInqRespType }
     * 
     */
    public FinancialNewsInqRespType createFinancialNewsInqRespType() {
        return new FinancialNewsInqRespType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialNewsInqRespType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/FinancialNewsInq/2011/01/15", name = "FinancialNewsInqResp")
    public JAXBElement<FinancialNewsInqRespType> createFinancialNewsInqResp(FinancialNewsInqRespType value) {
        return new JAXBElement<FinancialNewsInqRespType>(_FinancialNewsInqResp_QNAME, FinancialNewsInqRespType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialNewsInqReqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/FinancialNewsInq/2011/01/15", name = "FinancialNewsInqReq")
    public JAXBElement<FinancialNewsInqReqType> createFinancialNewsInqReq(FinancialNewsInqReqType value) {
        return new JAXBElement<FinancialNewsInqReqType>(_FinancialNewsInqReq_QNAME, FinancialNewsInqReqType.class, null, value);
    }

}
