
package com.bangkokbank.schema.contract.customer.fatcaindiciacheckop._2016._08._13;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bangkokbank.schema.contract.customer.fatcaindiciacheckop._2016._08._13 package. 
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

    private final static QName _FATCAIndiciaCheckOpResp_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/FATCAIndiciaCheckOp/2016/08/13", "FATCAIndiciaCheckOpResp");
    private final static QName _FATCAIndiciaCheckOpReq_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/FATCAIndiciaCheckOp/2016/08/13", "FATCAIndiciaCheckOpReq");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bangkokbank.schema.contract.customer.fatcaindiciacheckop._2016._08._13
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FATCAIndiciaCheckOpReqType }
     * 
     */
    public FATCAIndiciaCheckOpReqType createFATCAIndiciaCheckOpReqType() {
        return new FATCAIndiciaCheckOpReqType();
    }

    /**
     * Create an instance of {@link FATCAPrimaryAcctHolderInfoType }
     * 
     */
    public FATCAPrimaryAcctHolderInfoType createFATCAPrimaryAcctHolderInfoType() {
        return new FATCAPrimaryAcctHolderInfoType();
    }

    /**
     * Create an instance of {@link FATCAIndiciaCheckOpResultsType }
     * 
     */
    public FATCAIndiciaCheckOpResultsType createFATCAIndiciaCheckOpResultsType() {
        return new FATCAIndiciaCheckOpResultsType();
    }

    /**
     * Create an instance of {@link FATCAIndiciaCheckOpRespType }
     * 
     */
    public FATCAIndiciaCheckOpRespType createFATCAIndiciaCheckOpRespType() {
        return new FATCAIndiciaCheckOpRespType();
    }

    /**
     * Create an instance of {@link FATCAIndiciaCheckOpCriteriaType }
     * 
     */
    public FATCAIndiciaCheckOpCriteriaType createFATCAIndiciaCheckOpCriteriaType() {
        return new FATCAIndiciaCheckOpCriteriaType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FATCAIndiciaCheckOpRespType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/FATCAIndiciaCheckOp/2016/08/13", name = "FATCAIndiciaCheckOpResp")
    public JAXBElement<FATCAIndiciaCheckOpRespType> createFATCAIndiciaCheckOpResp(FATCAIndiciaCheckOpRespType value) {
        return new JAXBElement<FATCAIndiciaCheckOpRespType>(_FATCAIndiciaCheckOpResp_QNAME, FATCAIndiciaCheckOpRespType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FATCAIndiciaCheckOpReqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/FATCAIndiciaCheckOp/2016/08/13", name = "FATCAIndiciaCheckOpReq")
    public JAXBElement<FATCAIndiciaCheckOpReqType> createFATCAIndiciaCheckOpReq(FATCAIndiciaCheckOpReqType value) {
        return new JAXBElement<FATCAIndiciaCheckOpReqType>(_FATCAIndiciaCheckOpReq_QNAME, FATCAIndiciaCheckOpReqType.class, null, value);
    }

}
