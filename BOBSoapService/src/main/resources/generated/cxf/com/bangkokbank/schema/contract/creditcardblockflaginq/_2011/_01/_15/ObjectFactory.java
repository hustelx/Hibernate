
package com.bangkokbank.schema.contract.creditcardblockflaginq._2011._01._15;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bangkokbank.schema.contract.creditcardblockflaginq._2011._01._15 package. 
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

    private final static QName _CreditCardBlockFlagInqReq_QNAME = new QName("http://www.bangkokbank.com/schema/contract/CreditCardBlockFlagInq/2011/01/15", "CreditCardBlockFlagInqReq");
    private final static QName _CreditCardBlockFlagInqResp_QNAME = new QName("http://www.bangkokbank.com/schema/contract/CreditCardBlockFlagInq/2011/01/15", "CreditCardBlockFlagInqResp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bangkokbank.schema.contract.creditcardblockflaginq._2011._01._15
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreditCardBlockFlagInqRespType.CreditCardBlockFlagInqResult }
     * 
     */
    public CreditCardBlockFlagInqRespType.CreditCardBlockFlagInqResult createCreditCardBlockFlagInqRespTypeCreditCardBlockFlagInqResult() {
        return new CreditCardBlockFlagInqRespType.CreditCardBlockFlagInqResult();
    }

    /**
     * Create an instance of {@link CreditCardBlockFlagInqReqType }
     * 
     */
    public CreditCardBlockFlagInqReqType createCreditCardBlockFlagInqReqType() {
        return new CreditCardBlockFlagInqReqType();
    }

    /**
     * Create an instance of {@link CreditCardBlockFlagInqRespType }
     * 
     */
    public CreditCardBlockFlagInqRespType createCreditCardBlockFlagInqRespType() {
        return new CreditCardBlockFlagInqRespType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCardBlockFlagInqReqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/CreditCardBlockFlagInq/2011/01/15", name = "CreditCardBlockFlagInqReq")
    public JAXBElement<CreditCardBlockFlagInqReqType> createCreditCardBlockFlagInqReq(CreditCardBlockFlagInqReqType value) {
        return new JAXBElement<CreditCardBlockFlagInqReqType>(_CreditCardBlockFlagInqReq_QNAME, CreditCardBlockFlagInqReqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCardBlockFlagInqRespType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/CreditCardBlockFlagInq/2011/01/15", name = "CreditCardBlockFlagInqResp")
    public JAXBElement<CreditCardBlockFlagInqRespType> createCreditCardBlockFlagInqResp(CreditCardBlockFlagInqRespType value) {
        return new JAXBElement<CreditCardBlockFlagInqRespType>(_CreditCardBlockFlagInqResp_QNAME, CreditCardBlockFlagInqRespType.class, null, value);
    }

}
