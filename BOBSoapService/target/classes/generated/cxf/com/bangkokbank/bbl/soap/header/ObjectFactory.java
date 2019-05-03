
package com.bangkokbank.bbl.soap.header;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bangkokbank.bbl.soap.header package. 
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

    private final static QName _BBLSoapHeader_QNAME = new QName("http://www.bangkokbank.com/bbl/soap/header/", "BBLSoapHeader");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bangkokbank.bbl.soap.header
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BBLSoapHeaderType }
     * 
     */
    public BBLSoapHeaderType createBBLSoapHeaderType() {
        return new BBLSoapHeaderType();
    }

    /**
     * Create an instance of {@link RequesterInfoType }
     * 
     */
    public RequesterInfoType createRequesterInfoType() {
        return new RequesterInfoType();
    }

    /**
     * Create an instance of {@link RequesterInfoType.NonTerminal }
     * 
     */
    public RequesterInfoType.NonTerminal createRequesterInfoTypeNonTerminal() {
        return new RequesterInfoType.NonTerminal();
    }

    /**
     * Create an instance of {@link ID1Type }
     * 
     */
    public ID1Type createID1Type() {
        return new ID1Type();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BBLSoapHeaderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/bbl/soap/header/", name = "BBLSoapHeader")
    public JAXBElement<BBLSoapHeaderType> createBBLSoapHeader(BBLSoapHeaderType value) {
        return new JAXBElement<BBLSoapHeaderType>(_BBLSoapHeader_QNAME, BBLSoapHeaderType.class, null, value);
    }

}
