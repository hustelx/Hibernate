
package com.bangkokbank.bbl.soap.fault;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bangkokbank.bbl.soap.fault package. 
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

    private final static QName _ESBFault_QNAME = new QName("http://www.bangkokbank.com/bbl/soap/fault", "ESBFault");
    private final static QName _HostFault_QNAME = new QName("http://www.bangkokbank.com/bbl/soap/fault", "HostFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bangkokbank.bbl.soap.fault
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HostFaultType }
     * 
     */
    public HostFaultType createHostFaultType() {
        return new HostFaultType();
    }

    /**
     * Create an instance of {@link FaultMultiType }
     * 
     */
    public FaultMultiType createFaultMultiType() {
        return new FaultMultiType();
    }

    /**
     * Create an instance of {@link FaultDetailType }
     * 
     */
    public FaultDetailType createFaultDetailType() {
        return new FaultDetailType();
    }

    /**
     * Create an instance of {@link ESBFaultType }
     * 
     */
    public ESBFaultType createESBFaultType() {
        return new ESBFaultType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ESBFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/bbl/soap/fault", name = "ESBFault")
    public JAXBElement<ESBFaultType> createESBFault(ESBFaultType value) {
        return new JAXBElement<ESBFaultType>(_ESBFault_QNAME, ESBFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HostFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/bbl/soap/fault", name = "HostFault")
    public JAXBElement<HostFaultType> createHostFault(HostFaultType value) {
        return new JAXBElement<HostFaultType>(_HostFault_QNAME, HostFaultType.class, null, value);
    }

}
