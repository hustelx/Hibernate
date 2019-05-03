
package com.bangkokbank.schema.contract.customer.generatetempacctop._2011._01._15;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bangkokbank.schema.contract.customer.generatetempacctop._2011._01._15 package. 
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

    private final static QName _GenerateTempAcctOpResp_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/GenerateTempAcctOp/2011/01/15", "GenerateTempAcctOpResp");
    private final static QName _GenerateTempAcctOpReq_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/GenerateTempAcctOp/2011/01/15", "GenerateTempAcctOpReq");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bangkokbank.schema.contract.customer.generatetempacctop._2011._01._15
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GenerateTempAcctOpRespType }
     * 
     */
    public GenerateTempAcctOpRespType createGenerateTempAcctOpRespType() {
        return new GenerateTempAcctOpRespType();
    }

    /**
     * Create an instance of {@link GenerateTempAcctOpReqType }
     * 
     */
    public GenerateTempAcctOpReqType createGenerateTempAcctOpReqType() {
        return new GenerateTempAcctOpReqType();
    }

    /**
     * Create an instance of {@link GenerateTempAcctOpResultType }
     * 
     */
    public GenerateTempAcctOpResultType createGenerateTempAcctOpResultType() {
        return new GenerateTempAcctOpResultType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateTempAcctOpRespType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/GenerateTempAcctOp/2011/01/15", name = "GenerateTempAcctOpResp")
    public JAXBElement<GenerateTempAcctOpRespType> createGenerateTempAcctOpResp(GenerateTempAcctOpRespType value) {
        return new JAXBElement<GenerateTempAcctOpRespType>(_GenerateTempAcctOpResp_QNAME, GenerateTempAcctOpRespType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateTempAcctOpReqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/GenerateTempAcctOp/2011/01/15", name = "GenerateTempAcctOpReq")
    public JAXBElement<GenerateTempAcctOpReqType> createGenerateTempAcctOpReq(GenerateTempAcctOpReqType value) {
        return new JAXBElement<GenerateTempAcctOpReqType>(_GenerateTempAcctOpReq_QNAME, GenerateTempAcctOpReqType.class, null, value);
    }

}
