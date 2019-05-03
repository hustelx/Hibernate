
package com.bangkokbank.bbl.soap.fault;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostFaultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HostFaultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessageID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="faultString" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="faultLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="faultCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Multifault" type="{http://www.bangkokbank.com/bbl/soap/fault}FaultMultiType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostFaultType", propOrder = {
    "messageID",
    "faultString",
    "faultLevel",
    "faultCode",
    "multifault"
})
public class HostFaultType {

    @XmlElement(name = "MessageID", required = true)
    protected String messageID;
    @XmlElement(required = true)
    protected String faultString;
    protected String faultLevel;
    protected String faultCode;
    @XmlElement(name = "Multifault")
    protected FaultMultiType multifault;

    /**
     * Gets the value of the messageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageID() {
        return messageID;
    }

    /**
     * Sets the value of the messageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageID(String value) {
        this.messageID = value;
    }

    /**
     * Gets the value of the faultString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultString() {
        return faultString;
    }

    /**
     * Sets the value of the faultString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultString(String value) {
        this.faultString = value;
    }

    /**
     * Gets the value of the faultLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultLevel() {
        return faultLevel;
    }

    /**
     * Sets the value of the faultLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultLevel(String value) {
        this.faultLevel = value;
    }

    /**
     * Gets the value of the faultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultCode() {
        return faultCode;
    }

    /**
     * Sets the value of the faultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultCode(String value) {
        this.faultCode = value;
    }

    /**
     * Gets the value of the multifault property.
     * 
     * @return
     *     possible object is
     *     {@link FaultMultiType }
     *     
     */
    public FaultMultiType getMultifault() {
        return multifault;
    }

    /**
     * Sets the value of the multifault property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaultMultiType }
     *     
     */
    public void setMultifault(FaultMultiType value) {
        this.multifault = value;
    }

}
